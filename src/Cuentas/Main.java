/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas;

/**
 *
 * @author PedroEnc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.getSaldo();
        System.out.println("El saldo actual es "+ saldoActual );
        
        try{
            cuenta1.operativa_cuenta(250);
        }catch(Exception e){
            System.out.println("Fallo al operar con la cuenta");
        }
        
        
    }
}
