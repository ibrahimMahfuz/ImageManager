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

    fun setDir(directory: Directory): SaveStorage {
        return this.getDir(this, directory)
    }

    fun setDir(dir: String, vararg subdir: String): SaveStorage {
        return this.getDir(this, dir, *subdir)
    }

    fun setFile(file: File): SaveStorage {
        return this.getFile(this, file)
    }

    fun setFile(fileName: String): SaveStorage {
        return this.getFile(this, fileName)
    }

    fun setExtension(extension: Extension): SaveStorage {
        return this.getExtension(this, extension)
    }

    fun setExtension(ext: String): SaveStorage {
        return this.getExtension(this, ext)
    }
}