/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package descubrir;

import clases.Descuentos;
import clases.Promociones;

/**
 *
 * @author jessi
 */
public class Promos {

    
    private Promociones farmacia; // Función privada para consultar las promociones
    private Descuentos farmacia1; //Función privada para consultar los descuentos
    
   public Promos(){ //vincular las funciones con las clases e importarlas a la consulta
       farmacia = new Promociones();
       farmacia1 = new Descuentos();
       
   }
   //Función que permite al cliente consultar los descuentos
   public void descuentos_del_dia(String descuentos, int precio1, int precio2, String fecha){
       farmacia1.estado(descuentos, precio1, precio2, fecha);

   }
   //Función que permite al cliente consultar las promociones
   public void promociones_del_dia(String descuentos, int precio1, int precio2, String fecha){
       farmacia.estado(descuentos, precio1, precio2, fecha);

   }
   
}
