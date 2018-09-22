import java.util.Scanner;

//Dividir dos números
public class Calculadora {
    public double leer(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        return teclado.nextDouble();
    }
    public double dividir(double a, double b){
        return a/b;
    }
    public static void main(String[] args) {
        //Se puede poner métodos static, ya que la clase no tiene atributos.
        // Pero igual lo hice así para mantener la buena costumbre de usar las clases xd
        Calculadora calc = new Calculadora();
        double a = calc.leer();
        double b = calc.leer();
        System.out.println(a + " / " + b + " = " + calc.dividir(a,b));
    }
}
