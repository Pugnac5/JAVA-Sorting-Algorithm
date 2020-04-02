/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pota;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class AulaPrimeiraFatorial {
        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);   // solicitar o valor do usuario no console (scanf)
         int valor = sc.nextInt(); 
         sum(valor);
         int Resposta = sum(valor);
         System.out.println(Resposta);
    }       
    public static int sum(int n){
        if(n==1) // caso base                                                                                                         (condição de parada)    
               return 1;
        return n * sum(n-1); // passo recursivo
    }
}
