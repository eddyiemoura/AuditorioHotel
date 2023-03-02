/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package auditoriohotel;

/**
 *
 * @author Heysemberg
 */
import java.util.Scanner;
public class AuditorioHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int convidados;
    Scanner leia = new Scanner(System.in);
    System.out.print("Digite a quantidade de convidados: ");
    convidados = leia.nextInt();
    
    if(convidados > 350 || convidados < 0){
        System.out.print("Número de convidados inválido!");
    }
    else if(convidados > 220){
        System.out.print("Use o Auditório Beta.");
    }
    else if(convidados <= 150){
        System.out.println("Use o Auditório Alfa");
        System.out.println("Não são necessária cadeiras adicionais");
    }
    else{
        int cadeiras = convidados-150;
        System.out.println("Use o Auditório Alfa");
        System.out.println("Adicione mais "+cadeiras+" cadeiras.");
    }
    }
}
