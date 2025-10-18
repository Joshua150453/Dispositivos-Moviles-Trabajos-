package com.example.juegocolores.ui.fragments

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.juegocolores.databinding.FragmentWelcomeBinding
import com.example.juegocolores.R

// Fragmento de bienvenida: muestra el título y las reglas del juego
class WelcomeFragment : Fragment() {
    private var _binding: FragmentWelcomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) : View {
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.tvTitle.text = getString(R.string.app_name)

        // Muestra las reglas del juego en un diálogo
        binding.btnRules.setOnClickListener {
            AlertDialog.Builder(requireContext())
                .setTitle("Reglas")
                .setMessage("Presiona el botón que coincida con el color mostrado. Tiempo: 30 segundos. Cada acierto suma 1 punto.")
                .setPositiveButton("OK", null)
                .show()
        }

        // Navega al fragmento del juego
        binding.btnStart.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_gameFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
