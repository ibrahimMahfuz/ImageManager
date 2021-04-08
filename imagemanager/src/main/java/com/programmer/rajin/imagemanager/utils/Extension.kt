package com.programmer.rajin.imagemanager.utils

class Extension {
    companion object{
        const val JPG = "jpg"
        const val PNG = "png"
    }

    var extentionName = ".$PNG"
    get() = field
    set(value) {
        if (value.contains('.')) {
            value.replace('.',' ').trim().also { field = it }
            return
        }
        field = value
    }
}