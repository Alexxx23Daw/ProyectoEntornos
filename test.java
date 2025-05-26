/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoertornos;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author alexg
 */
public class test {
    
        @Test
        public void testIniciarSesion() {
            Autenticacion sistema = new Autenticacion();
            boolean resultado = sistema.iniciarSesion("alex23", "23");
            assertTrue(resultado);
        }
    
}
