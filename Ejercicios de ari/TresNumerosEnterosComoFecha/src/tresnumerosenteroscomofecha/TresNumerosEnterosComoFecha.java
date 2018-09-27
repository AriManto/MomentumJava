package tresnumerosenteroscomofecha;

import java.util.Scanner;


public class TresNumerosEnterosComoFecha {
    
    /*Quiero un programa que lea tres números enteros y lo muestre como una fecha
    
    (Día, Mes, Año).
    *Comprobar que es una fecha válida. (El año debe ser mayor a 0)
    *Si no es válida mostrar un mensaje de error y terminar el programa.
    *Si es válida escribir la fecha cambiando el número del mes por su nombre 
    x Ej: si se introduce 1 2 2006, se deberá imprimir “1 de febrero de 2006”.
    */
    


    public static void main(String[] args) {
        //que fecha es?
        Fecha estaFecha = new Fecha();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el dia");
        estaFecha.dia = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Ingrese el mes");
        estaFecha.mes = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Ingrese el año");
        estaFecha.año = entrada.nextInt();
        entrada.nextLine();
    
        
        
        
        

        if(!(estaFecha.año <= 0)){

            
            
            String mostrarFecha = convertirMeses(estaFecha);
         
            System.out.println(mostrarFecha);
            
        } else{
            
            System.out.println("El año debe ser mayor que 0");
        }
        
        
    }
        

    public static String convertirMeses(Fecha nuevaFecha) { 

        //la fecha que ingreso ahora es la nueva fecha
        
            String nuevoMes = "inicializo sin fecha";
            
            if(nuevaFecha.mes == 2){
                nuevoMes = (nuevaFecha.dia + " de Febrero del " + nuevaFecha.año);
            }
        

        
        return nuevoMes;
    }
    

}
