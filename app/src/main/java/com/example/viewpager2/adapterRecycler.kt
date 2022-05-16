package com.example.viewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.viewpager2.databinding.PerritosBinding
import com.google.android.material.transition.Hold

class adapterRecycler(var infoPerrito:ArrayList<Perrito>): RecyclerView.Adapter<adapterRecycler.Contenedor>() {

    class Contenedor(v: PerritosBinding):RecyclerView.ViewHolder(v.root) {

        val nombre:TextView
        val raza:TextView
        val desc:TextView
        val btnPropietario:Button
        val foto:ImageView

        init {
            nombre=v.txtNAme
            raza=v.txtRaza
            desc=v.txtDescripcion
            foto=v.imgFoto
            btnPropietario=v.btnPropietario
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapterRecycler.Contenedor {

        val vistaContent=PerritosBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Contenedor(vistaContent)

    }

    override fun onBindViewHolder(holder: adapterRecycler.Contenedor, position: Int) {

        val perrito=infoPerrito.get(position)

        holder.nombre.text=perrito.nombre
        holder.raza.text=perrito.raza
        holder.desc.text=perrito.desc

        holder.btnPropietario.text=perrito.propietario

        Glide
            .with(holder.foto.context)
            .load(perrito.foto)
            .placeholder(R.drawable.pets)
            .into(holder.foto);


    }

    override fun getItemCount()=infoPerrito.size


}