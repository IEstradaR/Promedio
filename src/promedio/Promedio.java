/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package promedio;

import java.util.Scanner;

/**
 *
 * @author Starboy men
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int alumnos, reprob=0, aprob=0;
        double nota, prom=0, suma=0, max=0, min=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos");
        alumnos=sc.nextInt();
        
        for (int i = 0; i < alumnos; i++) {
            System.out.println("Ingrese la nota");
            nota=sc.nextDouble();
            
            if (nota>=4) {
                aprob++;
            } else {
                reprob++;
            }
            
            if (i==0) {
                max=nota;
                min=nota;
            } else {
                if (nota>=max) {
                    max=nota;
                } else {
                    min=nota;
                }
            }
          suma+=nota;
        }
        prom=suma/alumnos;
        System.out.println("Promedio: "+prom+"\n" 
                            +"Aprobados: "+aprob+"\n"
                            +"Reprobados: "+reprob+"\n"
                            +"Nota Máxima: "+max+"\n"
                            +"Nota Mínima: "+min+"\n");
        
    }  
}
