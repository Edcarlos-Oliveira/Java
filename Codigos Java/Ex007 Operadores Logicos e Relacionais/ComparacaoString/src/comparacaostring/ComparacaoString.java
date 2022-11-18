/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author heddy
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Edcarlos";
        String nome2 = "Edcarlos";
        String nome3 = new String("Edcarlos");
        String res;
        // nesse caso abaixo mostra q o "n1 é igual a n2" porque está usando "nome1==nome2".
        //Para ser igual a "nome3" precisa usar "nome1.equals(nome3)" por ser um objeto em classe
        res = (nome1.equals(nome3))?"Igual":"Diferente";        
        System.out.println(res);
    }
    
}
