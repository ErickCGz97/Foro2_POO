/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foro2poo;

/**
 * Proyecto: Foro 2 - Programacion Orientada a Objetos (UDB Virtual)
 * @author Erick Alexander Cabrera González
 * Fecha: 6/3/2025
 */
public class Laptop extends Equipo{
    
    private String memoria;
    private String pantalla;
    private String discoDuro;

    public Laptop() {
    }


    public Laptop(String fabricante, String modelo, String microprocesador, String memoria, String pantalla, String discoDuro) {
        super(fabricante, modelo, microprocesador);
        this.memoria = memoria;
        this.pantalla = pantalla;
        this.discoDuro = discoDuro;
    }

    public String mostrarInformacionLaptop() {
        return super.mostrarInformacionEquipo() + "\nMemoria: " + memoria + "\nTamaño de pantalla: " + pantalla + 
               "\nCapacidad de disco duro: " + discoDuro;
    }  
    
}
