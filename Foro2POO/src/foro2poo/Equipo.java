
package foro2poo;

/**
 * Proyecto: Foro 2 - Programacion Orientada a Objetos (UDB Virtual)
 * @author Erick Alexander Cabrera González
 * Fecha: 6/3/2025
 */
public class Equipo {
    
    private String fabricante;
    private String modelo;
    private String microprocesador;
    
    //Constructor vacio
    public Equipo() {    
    }

    //COnstructor con parametros
    public Equipo(String fabricante, String modelo, String microprocesador) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
    }
    
    //Metodo mostra informacion del equipo
    public String mostrarInformacionEquipo()
    {
        return "Fabricante: " + fabricante + "\nModelo: " + modelo 
                + "\nMicroprocesador: " + microprocesador;
    }
}
