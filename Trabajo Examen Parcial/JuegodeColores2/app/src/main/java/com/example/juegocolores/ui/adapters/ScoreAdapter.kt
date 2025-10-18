package com.example.juegocolores.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.juegocolores.databinding.ItemScoreBinding
import com.example.juegocolores.model.Score
import java.text.SimpleDateFormat
import java.util.*

// Adaptador para mostrar la lista de puntajes en un RecyclerView
class ScoreAdapter(private val items: List<Score>) : RecyclerView.Adapter<ScoreAdapter.ScoreVH>() {

    // ViewHolder que contiene el binding del item
    class ScoreVH(val binding: ItemScoreBinding) : RecyclerView.ViewHolder(binding.root)

    // Infla el layout de cada item de la lista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScoreVH {
        val binding = ItemScoreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ScoreVH(binding)
    }

    // Asocia los datos con las vistas de cada item
    override fun onBindViewHolder(holder: ScoreVH, position: Int) {
        val item = items[position]
        holder.binding.tvScoreItem.text = "Puntaje: ${item.value}"
        val sdf = SimpleDateFormat("dd/MM HH:mm", Locale.getDefault())
        holder.binding.tvTimeItem.text = sdf.format(Date(item.timestamp))
    }

    // Devuelve el número total de items
    override fun getItemCount(): Int = items.size
}
