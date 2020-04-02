
package pota;

import java.util.Scanner;



public class AulaPrimeira {

   
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
        return n + sum(n-1); // passo recursivo
    }
    
   
    //public int fat(int n){ aplicar o fatorial em class separada 
        
    
    }
  
    

     

