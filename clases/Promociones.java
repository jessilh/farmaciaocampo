/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author jessi
 */
public class Promociones {
    private static Promociones instancia; //Agregar clase privada para mostrar en consola las promociones

    public Promociones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//Pedir datos para mostrar las promociones
public void estado(String promociones, int precio1, int precio2, String fecha){
        String resultado = Promociones.consultarpromociones(promociones, precio1, precio2, fecha);
        JOptionPane.showMessageDialog(null, "Hola las promociones del dia de hoy Son los siguientes  "
                + promociones + "Con un precio de " + precio1+ "\nCompra el segundo a mitad de precio"+
                 + precio2 + "\nSolo el dia de hoy " +resultado + "ahorrando asi" + (precio1 -precio2)+"\nFecha: " + 
                fecha+ "\nGracias por hacer tus compras en farmacia Ocampo" + "\nVuelVa pronto.");
        }
    //Función que permite mostrar las promociones.
    public static String consultarpromociones(String descuentos, int precio1, int precio2, String fecha){//Funcion del static que permite hacer el proceso de mostrar las promociones
        String[] dia = {"Lunes", "Martes", "Miercoles", "jueves", "Viernes", "Sabado", "Domingo"}; //Dias
        int indice;
        if(fecha.startsWith("25"))//Funcion else if de indice del periodo startsWith
            indice = numeroAleatorio(0, dia.length -5);
        else
            indice = numeroAleatorio(0, dia.length -1);
        return null;
    }
     
    //Esta funcion nos permite mostrar el dia de manera aleatoria 
    public static int numeroAleatorio(int minimo, int maximo){
        return ThreadLocalRandom.current().nextInt(minimo, maximo);
    }
    
//Uso del Patron de diseño singleton para mostrar a consola si las promociones se encontraron
    public static Promociones getInstancia(){
        //Comprobación de que el objeto se ha o no creado
        if( instancia == null)
            instancia = new Promociones();
        else
            System.out.println("Se estan buscando las promociones");
        
        return instancia;
    }
    
    public void conectar() {
        System.out.println("Se esta(n) mostrando todas las promociones del dia. Por favor espere...");
        
    }
    
    public void desconectar() {
        System.out.println("Se mostraron las promociones con éxito");
        System.out.println("Operación finalizada");
    }   
    
}
