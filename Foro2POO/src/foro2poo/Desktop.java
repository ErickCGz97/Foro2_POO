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
public class Desktop extends Equipo{
    
    protected String memoria;
    protected String tarjetaGrafica;
    protected String torre;
    protected String discoDuro;

    public Desktop() {
    }

    public Desktop(String fabricante, String modelo, String microprocesador, String memoria, String tarjetaGrafica, String torre, String discoDuro) {
        super(fabricante, modelo, microprocesador);
        this.memoria = memoria;
        this.tarjetaGrafica = tarjetaGrafica;
        this.torre = torre;
        this.discoDuro = discoDuro;
    }
    
    
    
    public String mostarInformacionDesktop()
    {
        return super.mostrarInformacionEquipo() + "\nMemoria (RAM): " + memoria + "\nTarjeta gráfica: " + tarjetaGrafica + "\nTamaño de torre: " + torre
                + "\nCapacidad de disco duro (GB): " + discoDuro;    
    }
}
