package com.programmer.rajin.imagemanager

import com.programmer.rajin.imagemanager.retrieveimage.IRetrieveImage
import com.programmer.rajin.imagemanager.retrieveimage.RetrieveExternalStorage
import com.programmer.rajin.imagemanager.retrieveimage.RetrieveInternalStorage
import com.programmer.rajin.imagemanager.saveimage.ISaveImage
import com.programmer.rajin.imagemanager.saveimage.SaveExternalStorage
import com.programmer.rajin.imagemanager.saveimage.SaveInternalStorage
import com.programmer.rajin.imagemanager.saveimage.SaveStorage

open class ImageManager {
    companion object{
        const val INTERNAL_STORAGE = 1
        const val EXTENAL_STORAGE = 2
    }

    private lateinit var _storeImage: SaveStorage
    private lateinit var _retrieveImage: IRetrieveImage

    fun saveImage(flag: Int = INTERNAL_STORAGE) : SaveStorage {
        when(flag){
            INTERNAL_STORAGE -> _storeImage = SaveInternalStorage()
            EXTENAL_STORAGE -> _storeImage = SaveExternalStorage()
            else -> throw UnknownError("Tidak ada pilihan itu bro")
        }
        return _storeImage
    }

    fun retrieveImage(flag: Int = INTERNAL_STORAGE) : IRetrieveImage{
        when(flag){
            INTERNAL_STORAGE -> _retrieveImage = RetrieveInternalStorage()
            EXTENAL_STORAGE -> _retrieveImage = RetrieveExternalStorage()
        }
        return _retrieveImage
    }
}