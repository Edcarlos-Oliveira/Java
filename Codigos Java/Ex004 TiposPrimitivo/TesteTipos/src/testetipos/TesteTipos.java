/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author heddy
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);*/
        
        // Ao contrário do código acima ficaria assim:
        
        /*String valor = "46";
        int idade = Integer.parseInt(valor); //"parse" significa converter
        System.out.println(idade);*/ //nesse caso colocou "idade" ao invés de "valor"
        
        // Nesse caso utilizaria numeros reais
        
        String valor = "40";
        float idade = Float.parseFloat(valor); //"parse" significa converter
        System.out.println(idade);
        
    }
    
}
