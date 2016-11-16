/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author gaby
 */
public class Array {
    private static int[] arreglo = {1,2,3,4,5,6,7,8,9,10};
    private static int suma =0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        for(int i=0; i<arreglo.length; i++){
            suma += arreglo[i];
        }
        System.out.println("La suma total es: "+ suma);
        suma=0;
        for(int i=(arreglo.length-1); i>=0; i--){
            suma += arreglo[i];
        }
        System.out.println("La suma total es: "+ suma);

    }
    
}
