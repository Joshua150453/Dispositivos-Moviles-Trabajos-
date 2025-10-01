package com.example.recyclerviewapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapp.adapter.UsuarioAdapter
import com.example.recyclerviewapp.model.Usuario

class RecyclerViewFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: UsuarioAdapter
    private val listaUsuarios = mutableListOf(
        Usuario("Juan Pérez", 25, "juan@mail.com"),
        Usuario("María López", 30, "maria@mail.com"),
        Usuario("Carlos Sánchez", 22, "carlos@mail.com")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recycler_view, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)

        adapter = UsuarioAdapter(
            listaUsuarios,
            onEditClick = { pos, usuario ->
                adapter.updateUsuario(pos, usuario) // 🔹 Actualiza RecyclerView
            },
            onDeleteClick = { pos ->
                adapter.deleteUsuario(pos) // 🔹 Elimina de la lista
            }
        )

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        return view
    }
}
