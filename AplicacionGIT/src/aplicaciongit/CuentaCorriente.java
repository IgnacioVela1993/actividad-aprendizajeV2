/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongit;

/**
 *
 * @author nachovelagomez
 */
public class CuentaCorriente {
    
    private double saldo; 
    private String nombre; 
    private String DNI; 
    private double limiteRojos;

    public CuentaCorriente(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.saldo = 0; 
        this.limiteRojos = -50; 
    }

    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
        this.limiteRojos = 0;
    }

    public CuentaCorriente(double saldo, String DNI, double limiteRojos) {
        this.saldo = saldo;
        this.DNI = DNI;
        this.limiteRojos = limiteRojos;
    }
    
   
    public boolean sacarDinero(int dineroaretirar){
        if (this.saldo - dineroaretirar > this.limiteRojos){
            this.saldo = this.saldo - dineroaretirar; 
            return true; 
        }
        return false; 
    }
    
    public void ingresarDinero(int dineroaingresar){
        this.saldo = this.saldo + dineroaingresar; 
    }

}
