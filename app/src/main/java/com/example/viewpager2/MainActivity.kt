package com.example.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager2.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    lateinit var content:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        content= ActivityMainBinding.inflate(layoutInflater)

        setContentView(content.root)

        val adapter=adapterViewPager(this)
        content.vp.adapter=adapter

        val manager=TabLayoutMediator(content.tabs,content.vp,TabLayoutMediator.TabConfigurationStrategy{tab,position->
            when(position){
                0-> tab.setIcon(getDrawable(R.drawable.newpost))
                1->tab.setIcon(getDrawable(R.drawable.notas))
                2->tab.setIcon(getDrawable(R.drawable.settings))
            }
        })

        manager.attach()

    }
}