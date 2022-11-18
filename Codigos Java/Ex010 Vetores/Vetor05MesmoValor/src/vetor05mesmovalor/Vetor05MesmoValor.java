/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor05mesmovalor;

import java.util.Arrays;

/**
 *
 * @author heddy
 */
public class Vetor05MesmoValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = new int[20];
        Arrays.fill(v, 0); //Escreve na tela 20 vezes o número "0"
        for (int valor: v){
        System.out.print(valor + " ");
        }
    }
    
}
