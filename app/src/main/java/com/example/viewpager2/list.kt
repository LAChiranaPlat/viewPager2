package com.example.viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.viewpager2.databinding.FragmentListBinding

class list : Fragment() {

    lateinit var layout:FragmentListBinding
    private val binding get() = layout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        layout= FragmentListBinding.inflate(inflater,container,false)


        val items:ArrayList<Perrito>

        items= ArrayList()

        items.add(Perrito("frufru","chit zu","negrita y hembrita","http://c.files.bbci.co.uk/48DD/production/_107435681_perro1.jpg","Miguel",))
        items.add(Perrito("Apolo","Gran Danes zu","negrita y hembrita","http://c.files.bbci.co.uk/48DD/production/_107435681_perro1.jpg","Miguel",))
        items.add(Perrito("Covi","Gran Danes","negrita y hembrita","http://c.files.bbci.co.uk/48DD/production/_107435681_perro1.jpg","Miguel",))
        items.add(Perrito("Princesa","Galgos","negrita y hembrita","http://c.files.bbci.co.uk/48DD/production/_107435681_perro1.jpg","Miguel",))
        items.add(Perrito("Ip","Pequines","negrita y hembrita","http://c.files.bbci.co.uk/48DD/production/_107435681_perro1.jpg","Miguel",))

        val ada=adapterRecycler(items)

        layout.lista.layoutManager=LinearLayoutManager(context)

        layout.lista.adapter=ada

        return layout.root

    }


}