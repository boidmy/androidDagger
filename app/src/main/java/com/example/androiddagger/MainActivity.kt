package com.example.androiddagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import module.Car
import module.engine.Diesel
import module.engine.Engine
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        engine.text = car.engine()
        tier.text = car.tier()
    }
}