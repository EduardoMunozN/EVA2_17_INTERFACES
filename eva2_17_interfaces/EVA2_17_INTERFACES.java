/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_17_interfaces;

/**
 *
 * @author eduar
 */
public class EVA2_17_INTERFACES {

    public static void main(String[] args) {
        //MostrarDatos datos = new MostrarDatos ();
        Persona perso = new Persona ("Juan", 19);
        perso.imprimirDatos();
        Computadora compu = new Computadora("Intel i7", 12, 25000, "Computadora");
        compu.imprimirDatos();
        
    }
}
