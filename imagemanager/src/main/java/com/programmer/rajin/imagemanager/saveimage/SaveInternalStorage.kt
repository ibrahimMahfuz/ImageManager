package com.programmer.rajin.imagemanager.saveimage

import com.programmer.rajin.imagemanager.ImageManagerCallback
import com.programmer.rajin.imagemanager.utils.Directory
import com.programmer.rajin.imagemanager.utils.Extension
import com.programmer.rajin.imagemanager.utils.File

class SaveInternalStorage : ISaveImage {
    override fun getDir(directory: Directory): ISaveImage {
        return this
    }

    override fun getFile(file: File): ISaveImage {
        return this
    }

    override fun getExtension(extension: Extension): ISaveImage {
        return this
    }


    override fun save(imageManagerCallback: ImageManagerCallback) {
        print("image saved with callback")
        imageManagerCallback.onSuccess()
    }

    override fun save() {
        print("image saved")
    }

}