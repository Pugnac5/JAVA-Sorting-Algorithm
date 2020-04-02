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
public class AulaPrimeiraFibonacci {
    
        public static void main(String[] args){
           Scanner sc = new Scanner(System.in);// solicitar o valor do usuario no console (scanf)
            int valor = sc.nextInt();
            fib(valor);
            int resposta = fib(valor);
            System.out.println(resposta);
        }
    
    public static int fib(int n){ // formar a entrada e a saida no escopo do main, em classe separada
        if(n==1 || n==2){ 
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
