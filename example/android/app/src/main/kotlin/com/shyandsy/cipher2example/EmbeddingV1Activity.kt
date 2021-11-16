package com.shyandsy.cipher2example

import android.os.Bundle
import com.shyandsy.cipher2.Cipher2Plugin
import io.flutter.app.FlutterActivity

class EmbeddingV1Activity : FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Cipher2Plugin.registerWith(registrarFor("cipher2"))
    }
}