package com.programmer.rajin.imagemanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.programmer.rajin.imagemanager.ImageManager.Companion.INTERNAL_STORAGE
import com.programmer.rajin.imagemanager.utils.Extension.Companion.PNG

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ImageManager(this).saveImage(INTERNAL_STORAGE)
            .setDir("ikan","ikan","ayam")
            .setExtension(PNG)

    }
}