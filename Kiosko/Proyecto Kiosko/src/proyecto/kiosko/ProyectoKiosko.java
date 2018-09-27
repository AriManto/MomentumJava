package proyecto.kiosko;

import java.util.Scanner;


public class ProyectoKiosko {


    public static void main(String[] args) {
        
        
        
    }
    
    public ListaDeProductos cargarLista(){
        Producto nuevaLista = new Producto();
        ListaDeProductos ingresados = new ListaDeProductos();
        
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Ingrese nombre");
        nuevaLista.nombre = ent.nextLine();
        
        System.out.println("Ingrese marca");
        nuevaLista.marca = ent.nextLine();
        
        System.out.println("Ingrese precio");
        nuevaLista.precio = ent.nextDouble();
        ent.nextLine();
        
        System.out.println("Ingrese stock");
        nuevaLista.stock = ent.nextInt();
        ent.nextLine();
        
        ingresados.lista.add(nuevaLista);
        
        
    return ingresados;
            }

}
