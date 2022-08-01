package com.nurkholiq.listlaptopprogrammer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.Toolbar

class AuthorActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnGithub: Button
    private lateinit var btnInstagram: Button
    private lateinit var btnYoutube: Button
    private lateinit var btnLinkedin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_author)

        val toolbar: Toolbar = findViewById(R.id.bar_layout)
        setSupportActionBar(toolbar)
        supportActionBar?.title = null

        toolbar.setNavigationOnClickListener {
            finish()
        }

        btnGithub = findViewById(R.id.btn_github)
        btnInstagram = findViewById(R.id.btn_instagram)
        btnYoutube = findViewById(R.id.btn_youtube)
        btnLinkedin = findViewById(R.id.btn_linkedin)

        btnGithub.setOnClickListener(this)
        btnInstagram.setOnClickListener(this)
        btnYoutube.setOnClickListener(this)
        btnLinkedin.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_github) {
            val intent = Intent(this@AuthorActivity, WebSocialMediaActivity::class.java)
            intent.putExtra(
                WebSocialMediaActivity.URL_SOCIAL_MEDIA,
                "https://github.com/nurkholiqaganihafid"
            )
            startActivity(intent)
        }

        if (v?.id == R.id.btn_youtube) {
            val intent = Intent(this@AuthorActivity, WebSocialMediaActivity::class.java)
            intent.putExtra(
                WebSocialMediaActivity.URL_SOCIAL_MEDIA,
                "https://www.youtube.com/channel/UCBKRxucErPveGjFshrw0uBA"
            )
            startActivity(intent)
        }

        if (v?.id == R.id.btn_instagram) {
            val intent = Intent(this@AuthorActivity, WebSocialMediaActivity::class.java)
            intent.putExtra(
                WebSocialMediaActivity.URL_SOCIAL_MEDIA,
                "https://www.instagram.com/nurkholiq.agani_hafid/"
            )
            startActivity(intent)
        }

        if (v?.id == R.id.btn_linkedin) {
            val intent = Intent(this@AuthorActivity, WebSocialMediaActivity::class.java)
            intent.putExtra(
                WebSocialMediaActivity.URL_SOCIAL_MEDIA,
                "https://www.linkedin.com/in/nurkholiq-agani-hafid-0b1a61244/"
            )
            startActivity(intent)
        }
    }
}