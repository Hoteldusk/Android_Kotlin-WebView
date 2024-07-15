package com.dusk.webview

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val webView = findViewById<WebView>(R.id.web) as WebView

        webView.loadUrl("https://google.com")

        webView.settings.javaScriptEnabled = true

        webView.webViewClient = WebViewClient()

        webView.settings.setSupportZoom(true)

    }

    override fun onBackPressed() {
        super.onBackPressed()

        if(webView.canGoBack()) {
            webView.goBack()
        } else {
            finish()
        }
    }
}