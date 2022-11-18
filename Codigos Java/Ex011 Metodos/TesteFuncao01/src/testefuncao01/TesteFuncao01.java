/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author heddy
 */
public class TesteFuncao01 {
    //Modelo de Procedimento
    //Declaração necessária para o metodo main "soma(5,2)" ser executado por ser static
    static void soma(int a, int b) {
        int s = a+b;
        System.out.println("A soma do Procedimento é: " + s);
    }
    
    static int total(int c, int d) {
        int t = c+d;
        return t; //Substitui o "System.out.println" do Procedimento
    }       

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Para Procedimento
        System.out.println("Começou o programa de Procedimento!"); //Executa primeiro que a "soma é"
        soma(5,2); //para ser executado será necessário a criação do "static void soma(int a, int b)"
        
        //Para Função
        System.out.println(" "); //Para pular uma linha
        System.out.println("Começou o programa Função!");
        int sm = total(5,2); //Criada a váriavel "sm" para receber o "total"
        System.out.println("A soma da Função vale: " + sm);
        
    }
    
}
