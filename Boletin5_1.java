/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_1;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	Conta cuenta1 = new Conta();
    	Conta cuenta2 = new Conta();
        //cuenta1.setSaldo(1000);
        //
            System.out.println("Cantidad a Ingresar:");
            Scanner sc= new Scanner(System.in);
            float cantidadIngresar = sc.nextFloat();   
      	cuenta1.setIngreso(cantidadIngresar);
        //
        
        System.out.println("Cantidad a retirar");
        Scanner sce= new Scanner(System.in);
        Double cantidadRetirar = sce.nextDouble();
       	cuenta1.setReintegro(cantidadRetirar);
   	//System.out.print("aqui->"+cuenta2);
        System.out.println("Cantidad a realizar transferencia");
        //
            Scanner scd= new Scanner(System.in);
            cantidadIngresar = scd.nextFloat();                   	 
            cuenta1.transferencia(cuenta2,cantidadIngresar);

             System.out.println(cuenta1.getSaldo());
             System.out.println(cuenta2.getSaldo());
        }
}
