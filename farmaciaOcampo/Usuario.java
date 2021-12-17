/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmaciaOcampo;

import clases.Descuentos;
import clases.Promociones;
import descubrir.Promos;

/**
 *
 * @author jessi
 */
public class Usuario {
   public static void main(String[] args) {
       
        //Patrón de Diseño Singletón 
        Descuentos farmacia1 = Descuentos.getInstancia();
        farmacia1.conectar();
        
        // Se muestran todos los usarios que van a consultar
        Promos usuario1 = new Promos(); //Nombre, No. Cuenta a depositar, Periodo, Saldo actual y Depósito 
        usuario1.descuentos_del_dia("Compra un shampoo", 90, 15, "05/12/2021");
        
        Promos usuario4 = new Promos();
        usuario1.descuentos_del_dia("Compra un litro de alcohol", 120, 15,"15/12/2021");
        farmacia1.conectar();
        
        //Comprobar que se muestren las promociones
        Promociones farmacia = Promociones.getInstancia();
        farmacia.conectar();
        Promos usuario2 = new Promos(); //Nombre, No. Cuenta a depositar, Periodo, Saldo actual y Retiro
        usuario1.promociones_del_dia("Compra 1 paquete de pañales", 180, 90,"15/12/2021");
        
        Promos usuario3 = new Promos();
        usuario1.promociones_del_dia("Compra una coca de litro", 22, 12,"15/12/2021");
        farmacia.desconectar();   
        
    }

    
    }