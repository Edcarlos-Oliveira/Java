/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritimeticos;

/**
 *
 * @author heddy
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
        int n2 = 5;
        float n = (n1 + n2)/2;
        System.out.println("A média é igual a: " + n);*/
        
       /* int numero = 5;
        numero ++;  //soma o valor do "int" mais 1; "--" diminui menos 1.
        System.out.println(numero);*/
        
        //Nesse caso utiliza o decremento "--" diminui menos 1, "++" soma mais 1.
        /*int numero = 10;
        int valor = 4 + numero --;
        System.out.println(valor);//mostra o valor somado do "int valor"
        System.out.println(numero);*/ //mostra o valor do decremento "int numero"
        
        /*int x = 4;
        x += 2; //x = x + 2 
        System.out.println(x);*/
        
        //USANDO MATH
        
       /* int n1 = 3;
        int n2 = 25;
        float n = (float) Math.sqrt(n2); //"Math.sqrt" para achar a raiz quadrada e "(float)" type quest
        System.out.println(n); //exibe a raiz de "int n2"
        System.out.println(n1); //exibe o número 3 da "int n1"*/
       
       //ARREDONDAMENTO
       
      /* float v = 8.9f;
       int ar = (int) Math.ceil(v); //"ceil" aredonda para cima "floor" para baixo
        System.out.println(ar);*/
      
      //GERAR NÚMERO ALEATÓRIO
      
      double ale = Math.random(); //Gera numeros de 0 até 1.
      int n = (int) (5 + ale * (10-5)); // Gera numeros de 5 até 10
        System.out.println(ale);
        System.out.println(n);
    }    
}
