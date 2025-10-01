package com.example.recyclerviewapp.adapter

import android.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapp.R
import com.example.recyclerviewapp.model.Usuario

class UsuarioViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val txtNombre: TextView = itemView.findViewById(R.id.txtNombre)
    private val txtEdad: TextView = itemView.findViewById(R.id.txtEdad)
    private val txtCorreo: TextView = itemView.findViewById(R.id.txtCorreo)

    fun render(usuario: Usuario, onEditClick: (Int, Usuario) -> Unit, onDeleteClick: (Int) -> Unit) {
        txtNombre.text = usuario.nombre
        txtEdad.text = "Edad: ${usuario.edad}"
        txtCorreo.text = usuario.correo

        // 👇 Long click abre opciones
        itemView.setOnLongClickListener {
            val pos = bindingAdapterPosition
            if (pos != RecyclerView.NO_POSITION) {
                AlertDialog.Builder(itemView.context)
                    .setTitle("Acción")
                    .setItems(arrayOf("Editar", "Eliminar")) { _, which ->
                        when (which) {
                            0 -> showEditDialog(usuario, onEditClick) // Editar
                            1 -> onDeleteClick(pos) // Eliminar
                        }
                    }
                    .show()
            }
            true
        }
    }

    private fun showEditDialog(usuario: Usuario, onEditClick: (Int, Usuario) -> Unit) {
        val context = itemView.context
        val dialogView = LayoutInflater.from(context).inflate(R.layout.dialog_edit_usuario, null)

        val editNombre = dialogView.findViewById<EditText>(R.id.editNombre)
        val editEdad = dialogView.findViewById<EditText>(R.id.editEdad)
        val editCorreo = dialogView.findViewById<EditText>(R.id.editCorreo)

        // Valores actuales
        editNombre.setText(usuario.nombre)
        editEdad.setText(usuario.edad.toString())
        editCorreo.setText(usuario.correo)

        AlertDialog.Builder(context)
            .setTitle("Editar usuario")
            .setView(dialogView)
            .setPositiveButton("Guardar") { _, _ ->
                val pos = bindingAdapterPosition
                if (pos != RecyclerView.NO_POSITION) {
                    usuario.nombre = editNombre.text.toString()
                    usuario.edad = editEdad.text.toString().toIntOrNull() ?: usuario.edad
                    usuario.correo = editCorreo.text.toString()
                    onEditClick(pos, usuario)
                }
            }
            .setNegativeButton("Cancelar", null)
            .show()
    }
}
