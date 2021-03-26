package com.programmer.rajin.imagemanager.saveimage

import com.programmer.rajin.imagemanager.ImageManagerCallback
import com.programmer.rajin.imagemanager.utils.Directory
import com.programmer.rajin.imagemanager.utils.Extension
import com.programmer.rajin.imagemanager.utils.File

class SaveInternalStorage : ISaveImage {
    private lateinit var directory: Directory
    private lateinit var file: File
    private lateinit var extension: Extension

    override fun getDir(directory: Directory): ISaveImage {
        this.directory = directory
        return this
    }

    override fun getFile(file: File): ISaveImage {
        this.file = file
        return this
    }

    override fun getExtension(extension: Extension): ISaveImage {
        this.extension = extension
        return this
    }


    override fun save(imageManagerCallback: ImageManagerCallback) {
        imageManagerCallback.onSuccess()
    }

    override fun save() {
    }

}