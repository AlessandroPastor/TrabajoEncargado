/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofa;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author LAN SPARTACO
 */
// Programación Orientada a Objetos 
// Patrones de Diseño de SW - Equipo 2
// FACHADA
    public class FacadeMovil {

        public Movil encendido() {

            Bateria bateria = new Bateria();
            bateria.encendido();

            CPU cpu = new CPU();
            cpu.arranqueCPU();

            ServicioMovil gps = new ServicioGPS();
            gps.empezar();

            ServicioMovil wifi = new ServicioWIFI();
            wifi.empezar();

            List<ServicioMovil> servicioMovil = Arrays.asList(gps, wifi);

            Movil movil = new Movil(bateria, cpu, servicioMovil);

            return movil;
        }

        public void apagado(Movil movil) {

            for (ServicioMovil service : movil.getServicioMovil()) {
                service.cerrar();
            }
            movil.getCpu().apagadoCPU();
            movil.getBateria().apagado();
        }

    }
