package com.example.pruebadataclass.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pruebadataclass.R
import com.example.pruebadataclass.Objects.User

class UsersAdapter(private val Usuarios:ArrayList<User>) : RecyclerView.Adapter<UsersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return UsersViewHolder(layoutInflater.inflate(R.layout.item_user,parent,false))
    }

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
        val item = Usuarios[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = Usuarios.size
}
