package com.programmer.rajin.imagemanager.saveimage

import com.programmer.rajin.imagemanager.ImageManagerCallback
import com.programmer.rajin.imagemanager.Storage
import com.programmer.rajin.imagemanager.utils.Directory
import com.programmer.rajin.imagemanager.utils.Extension
import com.programmer.rajin.imagemanager.utils.File

open class SaveStorage: Storage(), ISaveImage {
    override fun save(imageManagerCallback: ImageManagerCallback) {
        TODO("Not yet implemented")
    }

    override fun save() {
        TODO("Not yet implemented")
    }

    fun getDir(directory: Directory): SaveStorage {
        return this.getDir(this, directory)
    }

    fun getDir(dir: String, vararg subdir: String): SaveStorage {
        return this.getDir(this, dir, *subdir)
    }

    fun getFile(file: File): SaveStorage {
        return this.getFile(this, file)
    }

    fun getFile(fileName: String): SaveStorage {
        return this.getFile(this, fileName)
    }

    fun getExtension(extension: Extension): SaveStorage {
        return this.getExtension(this, extension)
    }

    fun getExtension(ext: String): SaveStorage {
        return this.getExtension(this, ext)
    }
}