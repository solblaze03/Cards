package com.example.practica1

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Matrix
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.practica1.databinding.ActivityAppBinding

class app : AppCompatActivity() {

    private lateinit var binding: ActivityAppBinding

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAppBinding.inflate(layoutInflater)
        setContentView(binding.root)
        cargarImagen("https://wallpaperset.com/w/full/d/0/3/37504.jpg",binding.Cardview1)
        cargarImagen("https://www.irrompibles.net/irrwp/wp-content/uploads/2024/10/sparking_zero-1.jpg",binding.Cardview2)
        cargarImagen("https://wallpapercave.com/wp/wp2499614.png",binding.Cardview3)
        cargarImagen("https://i1.wp.com/thekoalition.com/images/2014/12/Final-Fantasy-X-HD-cover-art.jpg?fit=2560%2C1440&ssl=1",binding.Cardview4)

        dirigirWiki(binding.butDBS,"https://es.bandainamcoent.eu/dragon-ball/dragon-ball-sparking-zero")
        dirigirWiki(binding.butRE4,"https://es.wikipedia.org/wiki/Resident_Evil_4")
        dirigirWiki(binding.butFFX,"https://es.wikipedia.org/wiki/Final_Fantasy_X")
        dirigirWiki(binding.butFFVII,"https://es.wikipedia.org/wiki/Final_Fantasy_VII")
    }

    fun dirigirWiki(boton : Button,url: String){
        boton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
    }

    fun cargarImagen(url : String,imagen : ImageView){
        Glide.with(this).load(url).into(imagen)
    }
}