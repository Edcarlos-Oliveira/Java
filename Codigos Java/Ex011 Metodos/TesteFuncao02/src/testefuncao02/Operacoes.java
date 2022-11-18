/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testefuncao02;

/**
 *
 * @author heddy
 */
public class Operacoes {
    
    public static String contador(int i, int f){ //necessário manter o "public static" para ser chamado pela outra classe
        String s = "";
        for(int c = i; c <= f; c++) {
            s += c +" ";
        }
        return s;
    }
    
}
