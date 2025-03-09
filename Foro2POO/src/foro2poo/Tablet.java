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
public class Tablet extends Equipo{
    
    //Atributos de la clase Equipo
    private String pantalla;
    private String pantallaCapacitivaResistiva;
    private String memoriaNAND;
    private String sistemaOperativo;

    public Tablet() {
    }

    public Tablet(String fabricante, String modelo, String microprocesador, String pantalla, String pantallaCapacitivaResistiva, String memoriaNAND, String sistemaOperativo) {
        super(fabricante, modelo, microprocesador);
        this.pantalla = pantalla;
        this.pantallaCapacitivaResistiva = pantallaCapacitivaResistiva;
        this.memoriaNAND = memoriaNAND;
        this.sistemaOperativo = sistemaOperativo;
    }
    
    public String mostrarInformacionTablet() {
        return super.mostrarInformacionEquipo() + "\nTamaño de pantalla (Pulgadas): " + pantalla + "\nTipo de pantalla: " + pantallaCapacitivaResistiva + 
               "\nTamaño de memoria NAND (GB): " + memoriaNAND + "\nSistema Operativo: " + sistemaOperativo;
    }    
}
