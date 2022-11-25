/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofa;

/**
 *
 * @author LAN SPARTACO
 */
public class ServicioGPS implements ServicioMovil{
    @Override
    public void empezar() {
        System.out.println("servicio GPS activado");
    }

    @Override
    public void cerrar() {
        System.out.println("servicio GPS desactivado");
    }
    
}
