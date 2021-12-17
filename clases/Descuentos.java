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
public class Descuentos {
    private static Descuentos instancia;//Agregar clase privada para mostrar en consola los descuentos.    

    //Pedir datos para mostrar los descuentos.
    public void estado(String descuentos, int precio1, int precio2, String fecha){//Disponible para el cliente
        String resultado = Descuentos.consultardescuentos(descuentos, precio1, precio2, fecha);
        JOptionPane.showMessageDialog(null, "Hola los descuentos de hoy Son los siguientes  "
                + descuentos + "Con un precio de " + precio1+ "\nObten un descuento de"+
                 + precio2 + "Pagando solo un total de" + (precio1 - precio2)+"\nSolo el dia de hoy " +resultado + "Fecha: " + 
                fecha+ "\nGracias por hacer tus compras en farmacia Ocampo" + "\nVuelVa pronto.");
        }
    //Función que permite mostrar los descuentos.
 
    private static String consultardescuentos(String descuentos, int precio1, int precio2, String fecha) {
        String[] dia = {"Lunes", "Martes", "Miercoles", "jueves", "Viernes", "Sabado", "Domingo"};
        int indice;
        if(fecha.startsWith("25"))
            indice = numeroAleatorio(0, dia.length -5);
        else
            indice = numeroAleatorio(0, dia.length -1);
        return null;
    }
    
    //Esta funcion nos permite mostrar los dias de manera aleatoria
    public static int numeroAleatorio(int minimo, int maximo){
        return ThreadLocalRandom.current().nextInt(minimo, maximo);
    }
    
    //Uso del Patron de diseño singleton para mostrar a consola si se mostraron todos los decuentos
    public static Descuentos getInstancia(){
        //Comprobación de que el objeto se ha o no creado
        if( instancia == null)
            instancia = new Descuentos();
        else
            System.out.println("Se estan buscando los descuentos");
        
        return instancia;
        }
    
    public void conectar() {
        System.out.println("Se esta(n) mostrando todos los descuentos del dia. Por favor espere...");
        
    }
    
    public void desconectar() {
        System.out.println("Se mostraron los descuentos con éxito");
        System.out.println("Operación finalizada");
    }
    

   
  }
