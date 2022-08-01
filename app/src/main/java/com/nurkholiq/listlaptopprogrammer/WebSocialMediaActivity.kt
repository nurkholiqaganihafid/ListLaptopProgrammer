package com.nurkholiq.listlaptopprogrammer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WebSocialMediaActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    companion object {
        const val URL_SOCIAL_MEDIA = "url_social_media"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_social_media)

        val linkSocialMedia = intent.getStringExtra(URL_SOCIAL_MEDIA)

        webView = findViewById(R.id.wv_social_media)
        webView.webViewClient = WebViewClient()
        webView.loadUrl(linkSocialMedia!!)
        webView.settings.javaScriptEnabled = true
        webView.settings.setSupportZoom(true)
    }

    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}