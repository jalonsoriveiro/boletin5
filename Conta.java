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
public class Conta {
    private String nombreCliente;
    private String conta;
    private double interese;
    private double saldo;
    Scanner sc= new Scanner(System.in);
public Conta(){
saldo =1;
}

public Conta(String m,String x,double i,double y){

    nombreCliente =m;
    conta =x;
    interese = i;
    saldo = y;
}
    //Métodos setters/ getters para asignar e obter os datos da conta.
    public void setCombre (String NuevoNombre){    
        nombreCliente = NuevoNombre;
        System.out.println("Nuevo Nombre de cliente "+nombreCliente);    
    }
    public String getCombre (){        
        return nombreCliente;
    }
    public void setConta (String NuevaCuenta){    
        conta = NuevaCuenta;
        System.out.println("Nuevo Nombre de cliente "+conta);    
    }
   
    
    public String getConta (){        
        return conta;
        
    }
    public void setInterese (double nuevoInteres){    
        
        if(nuevoInteres>=0 && nuevoInteres<=100){
        
        interese = nuevoInteres;
        }else
           System.out.println("Interes incorrecto");
    }    
    public double getInterese (){
        return interese;
    }
    public void setSaldo (double nuevoSaldo){    
        saldo = nuevoSaldo;
       // System.out.println("Nuevo Saldo "+saldo);    
    }     
     public void setIngreso (double nuevoIngreso){  
        //Un ingreso consiste en aumentar o saldo na cantidade que se indique
       if (nuevoIngreso <0){
           System.out.println("La cantidad es negativa realizar"
            + "+ ingreso en positivo(Escribe S(SI)o N(NO)):");
           String respuesta = sc.next();
                if ("S".equals(respuesta)){
                    saldo +=Math.abs(nuevoIngreso);  
                    System.out.println("Ingreso realizado"+saldo);
                }else{
                    System.out.println("Cancelar Operacion");
                }
          }
        else{
            saldo +=nuevoIngreso;  
               System.out.println("Saldo despues del ingreso :"+saldo); 
           }
       
       }
       // System.out.println("Nuevo Saldo despues del ingreso de "+NuevoIngreso+",Actual= "+saldo);    
      
    public void setReintegro (double NuevoReintegro){  
        //Un reintegro consiste en diminuír o saldo nunha cantidade  A cantidade non pode ser negativa.         
        
        if(NuevoReintegro > saldo){
            System.out.println("Reintegro superior al Saldo");                  
            }  
        else if (NuevoReintegro < 0){ 
            System.out.println("Cantidad Negativa");
        }                
        else {
            saldo = saldo -NuevoReintegro;
            System.out.println("Nuevo Saldo despues del reintegro"+NuevoReintegro+",Saldo ="+saldo);                  
         }}
    public double getSaldo (){
        return saldo;
    }
        public void transferencia (Conta cuenta2,float cantidad){  
    	
            if (cantidad <0)
                System.out.println("Cantidad Incorrecta, es negativa");
            else if (saldo < cantidad)
                System.out.println("La cantidad a transferir es superior al saldo de la cuenta");
            else
            saldo -=cantidad;
            //cuenta1.setSaldo(cuenta1.getSaldo()-cantidad);
            cuenta2.setSaldo(cuenta2.getSaldo()+cantidad);
            
       //System.out.println("transferencia de la cuenta con saldo"+cuenta1+"<> a la cuenta con saldo"+cuenta2);             	 
   	 
	}
    
    
    
    //Método transferencia que permita pasar diñeiro dunha conta a outra  Exemplo de uso do método transferencia:
//cuentaOrigen.transferencia( cuentaDestino, importe); que indica que queremos facer unha transferencia desde cuentaOrigen a cuentaDestino do importe indicado. 
//Proba o funcionamento da clase Conta  na clase principal.
    
    
    
    
    
}

