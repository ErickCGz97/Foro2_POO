
package foro2poo;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * Proyecto: Foro 2 - Programacion Orientada a Objetos (UDB Virtual)
 * @author Erick Alexander Cabrera González
 * Fecha: 6/3/2025
 * 
 * Docente: Rafael Torres
 */
public class Foro2POO {
    
    //Objetos para uso de propiedades y metodos
    private static ArrayList<Desktop> desktops = new ArrayList<>();
    private static ArrayList<Laptop> laptops = new ArrayList<>();
    private static ArrayList<Tablet> tablets = new ArrayList<>();
        
    public static void main(String[] args) {
        
        //MENU PRINCIPAL DEL PROYECTO
        while (true) 
        {
            String[] opciones = {"Registrar equipo", "Ver equipos", "Salir"};
            int eleccion = JOptionPane.showOptionDialog(null, "Selecciona una opción", "Menú",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (eleccion) {
                case 0:
                    registrarEquipo();
                    break;
                case 1:
                    verEquipos();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }        
    
    //Metodo para registrar equipos, se ingresa en el menu para elegir que tipo de equipo se va a registrar
    public static void registrarEquipo() 
    {
        String[] tipos = {"Desktop", "Laptop", "Tablet"};
        int tipo = JOptionPane.showOptionDialog(null, "Selecciona el tipo de equipo", "Registrar equipo",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tipos, tipos[0]);

        switch (tipo) {
            case 0:
                registrarDesktop();
                break;
            case 1:
                registrarLaptop();
                break;
            case 2:
                registrarTablet();
                break;
            default:
                break;
        }
    }

    public static void registrarDesktop() {
        String fabricante = JOptionPane.showInputDialog("Fabricante:");
        String modelo = JOptionPane.showInputDialog("Modelo:");
        String microprocesador = JOptionPane.showInputDialog("Microprocesador:");
        String memoria = JOptionPane.showInputDialog("Memoria (RAM):");
        String tarjetaGrafica = JOptionPane.showInputDialog("Tarjeta gráfica:");
        String torre = JOptionPane.showInputDialog("Tamaño de torre: \n(SuperTorre, SemiTorre, MicroTorre)");
        String discoDuro = JOptionPane.showInputDialog("Capacidad de disco duro (GB):");

        desktops.add(new Desktop(fabricante, modelo, microprocesador, memoria, tarjetaGrafica, torre, discoDuro));
        JOptionPane.showMessageDialog(null, "Equipo - Desktop registrada exitosamente.");
    }

    public static void registrarLaptop() {
        String fabricante = JOptionPane.showInputDialog("Fabricante:");
        String modelo = JOptionPane.showInputDialog("Modelo:");
        String microprocesador = JOptionPane.showInputDialog("Microprocesador:");
        String memoria = JOptionPane.showInputDialog("Memoria (RAM):");
        String pantalla = JOptionPane.showInputDialog("Tamaño de la pantalla (Pulgadas):");
        String discoDuro = JOptionPane.showInputDialog("Capacidad del disco duro (GB):");

        laptops.add(new Laptop(fabricante, modelo, microprocesador, memoria, pantalla, discoDuro));
        JOptionPane.showMessageDialog(null, "Equipo - Laptop registrada exitosamente.");
    }
    
    public static void registrarTablet(){
        String fabricante = JOptionPane.showInputDialog(("Fabricante: "));
        String modelo = JOptionPane.showInputDialog("Modelo: ");
        String microprocesador= JOptionPane.showInputDialog("Microprocesador: ");
        String diagonalPantalla = JOptionPane.showInputDialog("Tamaño diagonal de la pantalla (Pulgadas): ");
        /*
        Las pantallas táctiles resistivas o capacitiva se diferencian en base a la fabricacion y funcionamiento        
        */
        String tipoPantalla = JOptionPane.showInputDialog("Capacitiva o Recursiva: ");
        String memoriaNAND = JOptionPane.showInputDialog("Tamaño de memoria NAND (GB): ");
        String sistemaOperativo = JOptionPane.showInputDialog("Sistema Operativo: ");
        
        tablets.add(new Tablet(fabricante, modelo, microprocesador, diagonalPantalla, tipoPantalla, memoriaNAND, sistemaOperativo));
        JOptionPane.showMessageDialog(null, "Equipo - Tablet registrada exitosamente");
    } 
    
    //Metodo para ver la lista de equipos
    public static void verEquipos() {
        String[] opciones = {"Desktop", "Laptop", "Tablet"};
        int tipo = JOptionPane.showOptionDialog(null, "Selecciona el tipo de equipo", "Ver equipos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        switch (tipo) {
            case 0:
                verDesktops();
                break;
            case 1:
                verLaptops();
                break;
            case 2:
                verTablets();
                break;
            default:
                break;
        }
    }
    
    public static void verDesktops()
    {
        for(int i = 0; i< desktops.size(); i++)
        {
            //laptops.get(i);
            JOptionPane.showMessageDialog(null, desktops.get(i).mostarInformacionDesktop());
        }
    }
    
    public static void verLaptops()
    {
        for(int i = 0; i< laptops.size(); i++)
        {
            //laptops.get(i);
            JOptionPane.showMessageDialog(null, laptops.get(i).mostrarInformacionLaptop());
        } 
    }

    public static void verTablets()
    {
       for(int i = 0; i< tablets.size(); i++)
        {
            //laptops.get(i);
            JOptionPane.showMessageDialog(null, tablets.get(i).mostrarInformacionTablet());
        }  
    }
}

/*
FUNCIONAMIENTO:
La clase principal activa el menu de inicio, el usuario decide si registrar o ver la lista de dispositivos.
Al ingresar a "Registrar dispostivos" se elige el tipo de Equipo: Desktop, Laptop, Tablet
Se ingresa una por una los datos del  equipo

Al seleccionar la opcion de mostrar la lista de dispositivos, se muestra uno por uno hasta terminar la lista.

El programa incluye una opcion de termiar en el menu principal
*/