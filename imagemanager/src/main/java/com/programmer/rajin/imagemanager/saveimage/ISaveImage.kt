package com.programmer.rajin.imagemanager.saveimage

import com.programmer.rajin.imagemanager.ImageManagerCallback
import com.programmer.rajin.imagemanager.utils.Directory
import com.programmer.rajin.imagemanager.utils.Extension
import com.programmer.rajin.imagemanager.utils.File

interface ISaveImage {
    fun getDir(directory: Directory) : ISaveImage
    fun getFile(file: File) : ISaveImage
    fun getExtension(extension: Extension) : ISaveImage
    fun save(imageManagerCallback: ImageManagerCallback)
    fun save()
}