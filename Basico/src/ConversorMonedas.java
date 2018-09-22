import java.util.InputMismatchException;
import java.util.Scanner;
/*Nota: según como toma la internacionalización, los numeros decimales los va a tomar válidos con , o con .
en Argentina debería usarse con , pero a veces los toma con .
Se puede arreglar con formato de número, tipo forzar que ambas alternativas funcionen y que sean tomadas como .
pero no viene al caso ahora. Bah, si, pero paja XD*/
public class ConversorMonedas {
    private double arsUsd=38.46;
    private double arsEur=45.79;
    Scanner leer = new Scanner(System.in);
    //Setters and Getters
    public double getArsUsd() {return arsUsd;}
    public void setArsUsd(double arsUsd) {this.arsUsd = arsUsd;}
    public double getArsEur() {return arsEur;    }
    public void setArsEur(double arsEur) {this.arsEur = arsEur;}
    public void mostrarResultados(double pesos){
        double dolares = pesos*this.getArsUsd();
        double euros = pesos*this.getArsEur();
        System.out.println("$"+pesos+" argentinos = "+dolares+" USD = "+euros+" EUR.");
    }
    public void cambiarCotizacion(){
        boolean valido=false;
        System.out.println("Inserte valor de ARS/DOLAR:");
        do {
            try {
                this.setArsUsd(leer.nextDouble());
                valido=true;
            } catch (InputMismatchException e) {
                leer.nextLine();
                System.out.println("Ingrese un número válido");
            }
        }
        while(!valido);
        valido=false;
        System.out.println("Inserte valor de ARS/EURO:");
        do {
            try {
                this.setArsEur(leer.nextDouble());
                valido=true;
            } catch (InputMismatchException e) {
                leer.nextLine();
                System.out.println("Ingrese un número válido");
            }
        }
        while(!valido);
        System.out.println("**COTIZACIONES ACTUALIZADAS**");
    }

    public static void main(String[] args) {
        ConversorMonedas cm = new ConversorMonedas();
        String tecla;
        System.out.println("La cotización guardada es:\n1 DOLAR = "+cm.arsUsd+" ARS\n1 EURO = " + cm.arsEur + " ARS"
                            +"\n¿Desea cambiarla? S/N");
        do {
            tecla = cm.leer.nextLine();
            if (tecla.equals("s")|| tecla.equals("S")){
                cm.cambiarCotizacion();
            }
        }
        while (!(tecla.equals("s")||tecla.equals("S")||tecla.equals("n")||tecla.equals("N")));
        System.out.println("Inserte pesos argentinos:");
        double pesos = cm.leer.nextDouble();
        cm.mostrarResultados(pesos);
    }
}