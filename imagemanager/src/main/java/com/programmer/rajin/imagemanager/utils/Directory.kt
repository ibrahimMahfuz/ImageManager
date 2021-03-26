package com.programmer.rajin.imagemanager.utils

class Directory {
    var dirName: String = "imagemanager"

    fun setName(dir: String, vararg subdirs: String): Directory{
        var fullDirName = dir
        for (subdir in subdirs){
            fullDirName = "$fullDirName/$subdir"
        }
        this.dirName = fullDirName
        return this
    }
}