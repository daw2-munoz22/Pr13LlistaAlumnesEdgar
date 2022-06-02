/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pr13llistaalumnesedgar;

/**
 *
 * @author Jupiter
 */
public class Alumne{
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int nota;

    public Alumne(){

    }
    public Alumne(String Nom, String Ap1, String Ap2, int Qualificacio){
      nombre = Nom;
      apellido1 = Ap1;
      apellido2 = Ap2;
      nota = Qualificacio;

    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido1(){
        return apellido1;
    }
    public String getApellido2(){
        return apellido2;
    }
    public int getNota(){
        return nota;
    }
}
