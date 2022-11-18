/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exresultfinal;
import javax.swing.JOptionPane;


/**
 *
 * @author heddy
 */
public class ExResultFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;                            
               
                     
        do {            
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "<html>Informe um Valor: <br><em>(0 Interrompe)</em> </html>", "Entrada de Dados", JOptionPane.INFORMATION_MESSAGE));
            s += n;                                  
        }         
        while (n!=0);                   
                                
                
        JOptionPane.showMessageDialog(null, "<html>Resultado: <hr>" + "<br> Total de Valores: " + s 
            + "<br> Total de Pares: " 
                +"<br> Total de Impares: " 
                    +"<br> Acima de 100: " 
                        +"<br> Média dos Valores: "  
                            + "</html>", "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
        
   }
    
}
