/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectofa;

/**
 *
 * @author LAN SPARTACO
 */
public class ProyectoFA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        FacadeMovil facade = new FacadeMovil();
        System.out.println("\n------- ON --------");
        Movil movil = facade.encendido();

        System.out.println("\n\n------- OFF --------");

        facade.apagado(movil);
    }

    }

