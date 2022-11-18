/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04busca;

import java.util.Arrays;

/**
 *
 * @author heddy
 */
public class Vetor04Busca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int v:vet) {
            System.out.print(v + " "); //" + " " "para dar espaço entre os números
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 1); //Localizar a posição do valor do "1"
        System.out.println("Encontrei o valor: 1  na " + p +"ª posição."); //Posição do indice "0,1,2,3,4,5,6"
        //caso não seja encontrada a posição o numero será retornado como negativo
    }
    
}
