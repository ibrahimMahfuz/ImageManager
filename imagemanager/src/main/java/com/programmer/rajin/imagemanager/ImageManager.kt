package com.programmer.rajin.imagemanager

import com.programmer.rajin.imagemanager.saveimage.ISaveImage
import com.programmer.rajin.imagemanager.saveimage.SaveExternalStorage
import com.programmer.rajin.imagemanager.saveimage.SaveInternalStorage

open class ImageManager {
    companion object{
        const val INTERNAL_STORAGE = 1
        const val EXTENAL_STORAGE = 2
    }

    private lateinit var _saveImage: ISaveImage

    fun saveImage(flag: Int = 0) : ISaveImage {
        return when(flag){
            INTERNAL_STORAGE -> SaveInternalStorage()
            EXTENAL_STORAGE -> SaveExternalStorage()
            else -> SaveInternalStorage()
        }
    }
}