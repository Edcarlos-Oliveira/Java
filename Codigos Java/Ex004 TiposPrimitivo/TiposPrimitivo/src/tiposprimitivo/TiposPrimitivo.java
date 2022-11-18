/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivo;

import java.util.Scanner; //Biblioteca importada para Scanner

/**
 *
 * @author heddy
 */
public class TiposPrimitivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome = "Edcarlos";
        float nota = 8.5f; //Utiliza o "f" para indicar que o número é flutuante
        System.out.println("A nota é:\n" + nota);//o "+ nota" mostra a nota digitada
        System.out.printf("A nota de %s é:\n %.2f\n", nome, nota);/*Nesse caso a nota vem formatada, utiliza 
         "%s" para escrever o nome, "." entre o "%" e "f" para separar e o "2" representa o numero de casas decimais "\n" para 
quebrar uma linha*/
        System.out.format("A nota de %s é:\n %.2f\n", nome, nota); /*Pode ser utilizado "format" para
        substituir "printf".
        */      
           
    }
    
}
