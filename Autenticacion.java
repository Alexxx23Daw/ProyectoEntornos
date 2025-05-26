/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoertornos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alexg
 */
public class Autenticacion {
    
    private Map<String, String> registrados; 

    public Autenticacion() {
        this.registrados = new HashMap<>();
        registrados.put("alex23", "23");
        registrados.put("mariaBaza", "baza623");
        registrados.put("antonio12", "1212");
    }
    
    public boolean iniciarSesion(String usuario, String contraseña) {
        if (registrados.containsKey(usuario)) {
            return registrados.get(usuario).equals(contraseña);
        }
        return false;
    }
}
