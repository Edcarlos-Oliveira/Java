/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcao01;

/**
 *
 * @author heddy
 */
public class Funcao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fatorial f = new Fatorial();
        f.setValor(5); //Calcula o fatorial de "5"
        System.out.print(f.getFormula()); //Mostra a formula "X"
        System.out.println(f.getFatorial()); //Mostra o resultado do fatorial
    }
    
}
