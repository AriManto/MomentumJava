package proyecto.kiosko;

import java.util.Scanner;


public class ProyectoKiosko {


    public static void main(String[] args) {
        ListaDeProductos estaLista = new ListaDeProductos();
        Producto esteProducto = new Producto();
        Scanner ent = new Scanner(System.in);
        
        // cargar nueva lista de productos por parte del usuario a traves del subprograma cargarLista
        boolean denuevo = true;
        String questioner;
        
        while(denuevo == true){
            cargarLista();
            
            System.out.println("Desea cargar otra lista más si/no?");
            questioner = ent.nextLine();
            
            if(questioner.equalsIgnoreCase("no")){
                
                denuevo = false;
            }
            
        }
        
    }
    
    
    
    //crear un subprograma para cargar una lista de productos
    public static ListaDeProductos cargarLista(){
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
    
    
    //Crear un subprograma que muestre todos los productos de la lista
    
    public void productosDeLaLista(ListaDeProductos lista){
        int i = 0;
        while (i < lista.lista.size()) {
            System.out.println(lista.lista.get(i));
              i++;
        }
    }
    
    //Crear un subprograma que muestre todos los productos de la lista
    
    //Crear un subprograma que muestre el producto mas caro

    
      //Crear un subprograma que muestre el producto mas barato
    
    // Crear un subprograma que muestre todos los productos de los cuáles no hay stock en el momento.
}
