/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorrepeticao;

/**
 *
 * @author heddy
 */
public class ContadorRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0; //CONTA APARTIR DE 1
        //"While" é ENQUANTO.
        while (cc<10) { 
            
            /*System.out.println("Cambalhotas " + cc);
            cc++; //CC RECE +1*/
            
         //Nesse caso usa o "CONTINUE" para interromper determinados números(5,7,9) a serem mostrados.
         
         cc++;
        /* if (cc==5 || cc==7 || cc==9) {
             continue;
         }
            System.out.println("Cabalhotas "+cc);*/
            
        //Nesse caso usa o "BREAK" para interroper e ir direto para o final do programa.
        
        if (cc==7 || cc==8){
            break;
        }
            System.out.println("Cabalhotas "+cc);
        
        }
    }
    
}
