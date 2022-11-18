/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos2;

import java.util.Scanner; //Biblioteca importada para Scanner

/**
 *
 * @author heddy
 */
public class TiposPrimitivos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Para esse modelo abaixo, o usuário digita o nome e a nota
        /* Nessa declaração "System.in" monitora as entradas digitadas*/
        Scanner teclado = new Scanner(System.in); 
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.1f \n", nome, nota); 
    }    
}
