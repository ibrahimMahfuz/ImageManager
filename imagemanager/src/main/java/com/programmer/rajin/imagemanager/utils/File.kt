package com.programmer.rajin.imagemanager.utils

import kotlin.random.Random

class File {
    private val charPool : List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    var fileName: String = (1..10)
        .map { i -> Random.nextInt(0, charPool.size) }
        .map(charPool::get)
        .joinToString("")
    get() = fileName
    set(value) {
        field = value
    }
}