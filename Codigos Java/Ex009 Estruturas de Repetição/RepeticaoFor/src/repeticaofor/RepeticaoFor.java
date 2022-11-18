/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaofor;

/**
 *
 * @author heddy
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //pode usar "c<=3" ou "c<4" para efetuar 4 cabalhotas.
        //"for" é a mesma coisa que enquanto simplificado
        for (int c=0; c<=3; c++) { 
        System.out.println("Cabalhotas");
        }
        /* a estrutura acima poderia ser escrita dessa forma abaixo:
        int c = 0;
        while (c<4) {
       System.out.println("Cabalhotas");
        c++;
        }
        */
        //Nesse caso conta de 1 até 100 de 10 em 10
        for (int a=1; a<=100; a+=10) {
            System.out.println(a);
        }
        
        //Nesse caso começa a contagem decrescente de 15 até 5, tirando de 2 em 2
        
        for (int b=15; b>=5; b-=2) {
            System.out.println(b);
        }
    }
    
}
