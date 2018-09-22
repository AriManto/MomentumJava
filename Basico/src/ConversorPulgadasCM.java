import java.util.InputMismatchException;
import java.util.Scanner;
public class ConversorPulgadasCM {
    private double pulg =0;
    public double pulgAcm(double pulg){
     return pulg*2.54;
    }
    public static void main(String[] args) {
        boolean continuar=true;
        Scanner leer = new Scanner(System.in);
        ConversorPulgadasCM conversor = new ConversorPulgadasCM();
        System.out.println("Ingrese medida en pulgadas:");
        do {
            try {
                conversor.pulg = leer.nextDouble();
                System.out.println(conversor.pulg + " pulgadas = " + conversor.pulgAcm(conversor.pulg) + " cm.");
                continuar = false;
            } catch (InputMismatchException e){
                leer.nextLine(); //Consume el caracter para poder volver a leer
                System.out.println("Error, ingrese un número válido");
            }
        }
        while (continuar==true);
    }
}
