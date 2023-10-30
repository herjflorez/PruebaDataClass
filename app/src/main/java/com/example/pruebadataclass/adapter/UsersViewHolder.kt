package com.example.pruebadataclass.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pruebadataclass.R
import com.example.pruebadataclass.Objects.User

class UsersViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val image = view.findViewById<ImageView>(R.id.ivUser)
    val name = view.findViewById<TextView>(R.id.tvName)
    val surname = view.findViewById<TextView>(R.id.tvSurname)
    val birthday = view.findViewById<TextView>(R.id.tvBirthday)
    val mail = view.findViewById<TextView>(R.id.tvMail)
    val direction = view.findViewById<TextView>(R.id.tvDirection)

    fun render(userModel: User){
        Glide.with(image.context).load(userModel.image).into(image)
        name.text = userModel.nombre
        surname.text = userModel.apellido
        birthday.text = userModel.FechaNacimiento
        mail.text = userModel.email
        direction.text = userModel.direccion.toString()

    }

}
