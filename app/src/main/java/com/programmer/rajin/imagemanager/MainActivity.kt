package com.programmer.rajin.imagemanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.programmer.rajin.imagemanager.ImageManager.Companion.INTERNAL_STORAGE
import com.programmer.rajin.imagemanager.utils.Directory
import com.programmer.rajin.imagemanager.utils.Extension

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ImageManager().saveImage(INTERNAL_STORAGE)
            .getDir(Directory().setName("ikan", "ayam", "baju"))
            .getExtension(Extension().setName("ikan"))
            .save(object : ImageManagerCallback {
                override fun onSuccess() {
                    Log.d("debug-tag", "onSuccess: ")
                }

                override fun onError() {
                    TODO("Not yet implemented")
                }

            })

    }
}