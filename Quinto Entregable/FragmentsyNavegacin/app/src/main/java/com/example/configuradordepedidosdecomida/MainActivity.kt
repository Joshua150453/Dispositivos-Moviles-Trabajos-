package com.example.configuradordepedidosdecomida

/*
    Autor: Joshua David Ortiz Rosas
    Curso: Programacion De Dispositivos Moviles
    Semestre: VI
    Fecha: 26/09/2025
    Ultima modificacion: 30/09/2025 
*/

/*
    Configurador de pedido de comida.
    Objetivo: Permitir al usuario armar un pedido paso a paso y visualizarlo al finalizar.

    Fragments:
    InicioFragment
        - Botón: "Nuevo pedido" → navega a SeleccionComidaFragment.

    SeleccionComidaFragment
        - Selección de comida (ej: pizza, hamburguesa, ensalada).
        - Al hacer clic en “Siguiente”: Se crea un Bundle con el tipo de comida seleccionado.
        - Se navega a SeleccionExtrasFragment.

    SeleccionExtrasFragment
        - Selección de extras (bebida, papas, postre).
        - Al hacer clic en “Siguiente”: Se agrega la info de los extras al mismo Bundle o se
          crea uno nuevo con todos los datos.
        - Se navega a ResumenPedidoFragment.

    ResumenPedidoFragment
    - Usa arguments?.getString(...), etc. para mostrar la comida y extras.
    - Botones:
        - “Confirmar pedido”: muestra un Toast y vuelve al inicio (navigate()).
        - "Editar pedido”:
        - Usa setFragmentResult() con los datos actuales del pedido.
        - Llama a popBackStack() para regresar a SeleccionComidaFragment,
          que los puede recuperar con setFragmentResultListener(...).
*/

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }
}
