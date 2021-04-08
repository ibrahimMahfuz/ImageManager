package com.programmer.rajin.imagemanager

import com.programmer.rajin.imagemanager.saveimage.ISaveImage
import com.programmer.rajin.imagemanager.utils.Directory
import com.programmer.rajin.imagemanager.utils.Extension
import com.programmer.rajin.imagemanager.utils.File

open class Storage() {
    var directory: Directory = Directory()
    get() {
        return field
    }
    set(value) {
        field = value
    }
    var file: File = File()
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var extension: Extension = Extension()
        get() {
            return field
        }
        set(value) {
            field = value
        }

    protected fun <T> getDir(klass :T, directory: Directory) : T {
        this.directory = directory
        return klass
    }

    protected fun <T> getDir(klass :T, dir: String, vararg subdir: String): T{
        this.directory.setName(dir, *subdir)
        return klass
    }

    protected fun <T> getFile(klass :T, file: File): T {
        this.file = file
        return klass
    }

    protected fun <T> getFile(klass :T, fileName: String): T{
        this.file.fileName = fileName
        return klass
    }

    protected fun <T> getExtension(klass :T, extension: Extension): T {
        this.extension = extension
        return klass
    }

    protected fun <T> getExtension(klass :T, ext: String): T {
        this.extension.extentionName = ext
        return klass
    }
}