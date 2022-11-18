/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author heddy
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar txtAA = new GregorianCalendar();
        int aa = txtAA.get(Calendar.YEAR);
        System.out.println("Ano é:" + aa);    
    }
    
}
