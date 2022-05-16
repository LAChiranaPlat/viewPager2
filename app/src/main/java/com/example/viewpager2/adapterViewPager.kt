package com.example.viewpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class adapterViewPager(fragActivity:FragmentActivity):FragmentStateAdapter(fragActivity) {

    override fun getItemCount()=3

    override fun createFragment(position: Int): Fragment {

        when(position){

            0->{
                val fragFormulario=form()
                return fragFormulario
            }
            1->{
                val fragList=list()
                return fragList
            }
            2->{
                val fragSetting=config()
                return fragSetting
            }


        }

        return Fragment()
    }
}