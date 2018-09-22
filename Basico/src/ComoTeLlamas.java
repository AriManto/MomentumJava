//import javax.swing.*;
//public class ComoTeLlamas {
//    public static void main (String[] args) {
//
//        String nombre = JOptionPane.showInputDialog(null,"Nombre:", "Inserte nombre", JOptionPane.QUESTION_MESSAGE);
//        String apellido = JOptionPane.showInputDialog(null,"Apellido:", "Inserte apellido", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, apellido + ", " + nombre);
//    }
//}

import java.util.Scanner;

public class ComoTeLlamas{
    public static void main(String[]args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Ingrese un nombre:");
        String nombre = tecla.nextLine();
        System.out.println("Ingrese un apellido:");
        String apellido = tecla.nextLine();
        StringBuilder resultado = new StringBuilder(apellido+", "+nombre);
        System.out.println(resultado.toString());
    }
}
