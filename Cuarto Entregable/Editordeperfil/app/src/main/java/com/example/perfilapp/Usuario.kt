/**
 * Clase de datos Usuario
 * Representa un perfil básico de usuario que será enviado entre actividades.
 * Autor: Joshua David Ortiz Rosas
 * Fecha creación: 20/09/2025
 * Última modificación: 23/09/2025
 */
package com.example.perfilapp

import java.io.Serializable

// ✅ data class que implementa Serializable para enviar entre Activities
data class Usuario(
    val nombre: String,
    val edad: Int,
    val ciudad: String,
    val correo: String
) : Serializable
