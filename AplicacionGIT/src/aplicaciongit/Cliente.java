/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongit;

import java.util.Date;

/**
 *
 * @author nachovelagomez
 */
public class Cliente {
    private String nombre; 
    private String DNI; 
    private Date fe_nacimiento; 

    public Cliente(String nombre, String DNI, Date fe_nacimiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fe_nacimiento = fe_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getFe_nacimiento() {
        return fe_nacimiento;
    }

    public void setFe_nacimiento(Date fe_nacimiento) {
        this.fe_nacimiento = fe_nacimiento;
    }
    
   
}
