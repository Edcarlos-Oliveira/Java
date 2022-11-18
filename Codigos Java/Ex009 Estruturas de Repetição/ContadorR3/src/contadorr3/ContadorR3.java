/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorr3;

import java.util.Scanner;

/**
 *
 * @author heddy
 */
public class ContadorR3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in); //para o usuário digitar os números
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s += n; //é a mesma coisa que s = s + n
            System.out.print("Quer continuar? [S/N] ");
            resp = teclado.next();
        }
        while (resp.equals("S")); //resposta é igual "equals"
        System.out.println("A soma de todos os valores são: " + s);        
    }
    
}
