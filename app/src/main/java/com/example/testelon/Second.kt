package com.example.testelon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class Second : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setSupportActionBar(findViewById(R.id.my_toolbar))


        val tvSetName: TextView = findViewById(R.id.tv_item_judul)
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvSetDet: TextView = findViewById(R.id.tv_item_detail2)

        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getIntExtra(EXTRA_PHOTO,0)
        val tIden = intent.getStringExtra(EXTRA_DETAIL)

        tvSetName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions().override(150, 150))
            .into(imgSetPhoto)
        tvSetDet.text = tIden
    }
    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DETAIL = "extra_identity"
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
