import java.util.InputMismatchException;
import java.util.Scanner;

public class PromedioNotas {
    public static double validarNota(){
        Scanner leer = new Scanner(System.in);
        double nota=0;
        boolean valido = false;
        do {
            try{
                nota=leer.nextDouble();
                if (nota>0&&nota<=10){
                    valido = true;
                }
                else {
                    System.out.println("Ingrese una nota del 1 al 10");
                }
            }
            catch(InputMismatchException e){
                System.out.println("Ingrese una nota del 1 al 10");
                leer.nextLine();
            }
        }
        while (!valido);
       return nota;
    }
    public static double promedio(double nota1, double nota2, double nota3){
        return (nota1 + nota2 + nota3) / 3;
    }
    public static void main(String[] args) {
        System.out.println("Nota 1:");
        double nota1=validarNota();
        System.out.println("Nota 2:");
        double nota2=validarNota();
        System.out.println("Nota 3:");
        double nota3=validarNota();
        double prom = promedio(nota1,nota2,nota3);
        System.out.printf("El promedio es %.2f",prom); //Le da formato de 2 decimales
    }
}