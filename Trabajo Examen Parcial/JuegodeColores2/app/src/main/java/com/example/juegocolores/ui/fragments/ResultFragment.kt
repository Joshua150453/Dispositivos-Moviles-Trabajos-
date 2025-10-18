package com.example.juegocolores.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.juegocolores.databinding.FragmentResultBinding
import com.example.juegocolores.model.Score
import com.example.juegocolores.ui.adapters.ScoreAdapter
import com.example.juegocolores.util.PrefsHelper
import com.example.juegocolores.R

// Fragmento que muestra el resultado final y el historial de la sesión
class ResultFragment : Fragment() {
    private var _binding: FragmentResultBinding? = null
    private val binding get() = _binding!!
    private lateinit var prefs: PrefsHelper

    // Infla el layout del fragmento
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentResultBinding.inflate(inflater, container, false)
        return binding.root
    }

    // Se ejecuta al crear la vista: muestra puntajes y lista
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        prefs = PrefsHelper(requireContext())

        // Obtiene el puntaje final desde los argumentos de navegación
        val finalScore = arguments?.getInt("finalScore") ?: 0

        // Muestra el puntaje actual y el mejor puntaje guardado
        binding.tvFinalScore.text = "Puntaje final: $finalScore"
        binding.tvHighScore.text = "Mejor: ${prefs.getHighScore()}"

        // Configura RecyclerView para mostrar historial de puntajes en la sesión actual
        val list = GameFragment.sessionScores.toList().sortedByDescending { it.timestamp }
        binding.rvHistory.layoutManager = LinearLayoutManager(requireContext())
        binding.rvHistory.adapter = ScoreAdapter(list)

        // Botón para volver a jugar
        binding.btnPlayAgain.setOnClickListener {
            findNavController().navigate(R.id.action_resultFragment_to_gameFragment)
        }
    }

    // Limpieza al destruir la vista
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
