/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author heddy
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,2,8,7,5,4}; //coloca os valores nas posições de 0 a 5
        System.out.println("Total de casas de N: " + n.length); //"length" mostra o total de casas do vetor, nesse caso "6"
        for (int c=0; c<=5; c++) {
            /*for (int c=0; c<=n.length-1; c++);*///Pode ser usado dessa forma para substituir a sintaxe acima.
            
            System.out.println("Na Posição " + c + " temos o valor: " +n[c]); //Escreve na tela os valores em cada posição.
        }
    }
    
}
