package com.example.recyclerviewapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapp.adapter.UsuarioAdapter
import com.example.recyclerviewapp.model.Usuario

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: UsuarioAdapter
    private val listaUsuarios = mutableListOf(
        Usuario("Juan Pérez", 25, "juan@mail.com"),
        Usuario("María López", 30, "maria@mail.com"),
        Usuario("Carlos Sánchez", 22, "carlos@mail.com")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        // ✅ Aquí pasamos los callbacks faltantes
        adapter = UsuarioAdapter(
            listaUsuarios,
            onEditClick = { pos, usuario ->
                adapter.updateUsuario(pos, usuario) // 🔹 Editar usuario
            },
            onDeleteClick = { pos ->
                adapter.deleteUsuario(pos) // 🔹 Eliminar usuario
            }
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}
