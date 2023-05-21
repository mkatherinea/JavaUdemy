/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaudemy;

/**
 *
 * @author katherine.alvarez
 */
public class JavaUdemy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10, b=10;
        int c;
        
        c=(a>b)?a/b:b/a;
        
        if(a>b){
            System.out.println("El numer a "+a+" es mayor al numero b "+b);
        }else if (a<b){
            System.out.println("El numer b "+b+" es mayor al numero a "+a);
        }else{
                System.out.println("a es igual a b");
                }
        
        
        System.out.println("C vale: "+c);
        
        int nota = 12;
     
        switch (nota) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
                break;
              
            case 5:
            case 6:
                System.out.println("Aprobado");
                break;
                
            case 7:
            case 8 :
                System.out.println("Notable");
                break;
                
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                
            default: System.out.println("Ingrese una nota entre 1 y 10");

        }
                
    }
    
}
