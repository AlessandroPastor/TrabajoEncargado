/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofa;

import java.util.List;

/**
 *
 * @author LAN SPARTACO
 */
public class Movil {
    private final Bateria bateria;
    private final CPU cpu;
    private final List<ServicioMovil> servicioMovil;

    public Movil(Bateria bateria, CPU cpu, List<ServicioMovil> servicioMovil) {
        this.bateria = bateria;
        this.cpu = cpu;
        this.servicioMovil = servicioMovil;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public List<ServicioMovil> getServicioMovil() {
        return servicioMovil;
    }    
    
    
}
