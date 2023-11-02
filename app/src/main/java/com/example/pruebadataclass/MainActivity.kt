package com.example.pruebadataclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pruebadataclass.Objects.Direccion
import com.example.pruebadataclass.Objects.User
import com.example.pruebadataclass.adapter.UsersAdapter
import java.util.Date

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addUser = findViewById<Button>(R.id.bttAddUser)
        val arrayUsers = arrayListOf<User>()

        initRecyclerView(arrayUsers)

        addUser.setOnClickListener{
            arrayUsers.add(User(
                image = "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png",
                nombre = "Abel",
                apellido = "Florez",
                email = "a@a.com",
                direccion = Direccion(ciudad = "Barcelona", calle = "Carrer pelayo", portal = 113, piso = 2, puerta = 4, cp = "08011"),
                FechaNacimiento = "14-01-2002"
            ))

            initRecyclerView(arrayUsers)
        }
    }

    fun initRecyclerView(arrayList: ArrayList<User>){
        val recyclerView = findViewById<RecyclerView>(R.id.rvUsers)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UsersAdapter(arrayList)
    }
}

