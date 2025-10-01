package com.example.recyclerviewapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapp.R
import com.example.recyclerviewapp.model.Usuario

class UsuarioAdapter(
    private val usuarios: MutableList<Usuario>,
    private val onEditClick: (Int, Usuario) -> Unit,
    private val onDeleteClick: (Int) -> Unit
) : RecyclerView.Adapter<UsuarioViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsuarioViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_usuario, parent, false)
        return UsuarioViewHolder(view)
    }

    override fun onBindViewHolder(holder: UsuarioViewHolder, position: Int) {
        holder.render(usuarios[position], onEditClick, onDeleteClick)
    }

    override fun getItemCount(): Int = usuarios.size

    // 🔹 Método para actualizar usuario después de editar
    fun updateUsuario(pos: Int, usuario: Usuario) {
        usuarios[pos] = usuario
        notifyItemChanged(pos)
    }

    // 🔹 Método para eliminar usuario
    fun deleteUsuario(pos: Int) {
        usuarios.removeAt(pos)
        notifyItemRemoved(pos)
    }
}
