/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pr13llistaalumnesedgar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jupiter
 */
public class Pr13LlistaAlumnesEdgar {

    public static void main(String[] args) {
        List<Alumne> Student = new ArrayList<Alumne>(3);
        int i = 0;
        try(Scanner sc = new Scanner (System.in)){
            
            while(i!=-1){
                System.out.println("Dime el nombre del alumno");
                String nombre = sc.next();
                
                System.out.println("Dime el primer apellido del alumno");
                String apellido1 = sc.next();
                
                System.out.println("Dime el segundo apellido del alumno");
                String apellido2 = sc.next();
                
                System.out.println("Dime la nota del alumno");
                int nota = sc.nextInt();
                
                Alumne paco = new Alumne (nombre, apellido1, apellido2, nota);
                Student.add(paco);
                
                for(Alumne pi : Student){
                    System.out.println("El alumno " +  pi.getNombre() + " " + pi.getApellido1() + "  " + pi.getApellido2() + " ha sacado una nota de " +  pi.getNota());
                }
            }
        }
    }
}
