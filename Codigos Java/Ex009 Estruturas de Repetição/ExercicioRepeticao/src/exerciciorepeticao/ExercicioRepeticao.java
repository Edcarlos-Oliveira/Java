/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepeticao;
import javax.swing.JOptionPane; //Biblioteca de janelas prontas

/**
 *
 * @author heddy
 */
public class ExercicioRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //"Boas Vindas" é escrito no inicio da janela
        //"JOptionPane.INFORMATION_MESSAGE" para adicionar o botão "i" na janela
        //"JOptionPane.showMessageDialog" para escrever mensagem como exemplo "Olá Mundo"
        
       /* JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE); */
       
       //Nesse caso para solicitar que o usuário digite um número
       
       /*int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: ")); //Nesse caso a váriavel "n" recebe o número
       JOptionPane.showMessageDialog(null, "Você digitou o número: " + n); //para mostrar o valor digitado pelo usuário. */
       
       int n, s = 0;
       do {
           n = Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html>Informe um número: <br><em>(Valor 0 interrompe)</em> </html>"));
           //"br" quebra a linha e "em" coloca em italico o que está entre.
           
           s += n; //Para somar os números digitados
       }
       while (n!=0);
       JOptionPane.showMessageDialog(null, "<html>Resultado Final <hr>" + "<br> Somatório Vale: " + s + "</html>");
       // Utiliza "hr" para sublinhar 
        
    }
    
}
