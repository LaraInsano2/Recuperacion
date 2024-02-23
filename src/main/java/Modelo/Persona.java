/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Dilan Lara
 */
public class Persona {
   private int id_Persona;
    private String autorNombre;
   private String autorAppelido;
   
   public Persona(){}

    public Persona(int id_Persona, String autorNombre, String autorAppelido) {
        this.id_Persona = id_Persona;
        this.autorNombre = autorNombre;
        this.autorAppelido = autorAppelido;
    }

    public int getId_Persona() {
        return id_Persona;
    }

    public void setId_Persona(int id_Persona) {
        this.id_Persona = id_Persona;
    }

    public String getAutorNombre() {
        return autorNombre;
    }

    public void setAutorNombre(String autorNombre) {
        this.autorNombre = autorNombre;
    }

    public String getAutorAppelido() {
        return autorAppelido;
    }

    public void setAutorAppelido(String autorAppelido) {
        this.autorAppelido = autorAppelido;
    }

   


   
   
    
    
}
