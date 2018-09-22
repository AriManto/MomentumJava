package divisiblesdelunoalcien;


public class DivisiblesDelUnoAlCien {


    /*Quiero un programa que muestre cuales números enteros del 1 al 100 son divisibles por 3 y cuales son divisibles por 5.*/
    
    
    
    public static void main(String[] args) {

        int i;
        int tres = 3;
        int cinco = 5;
        int k;
        
        for(i=0; i<100; i++){
           
            System.out.println("i es " + i);
                    
            k = i % tres;
            
            
            
            if(k == 0){

                System.out.println("El número " + i + " es divisible por tres");
                
            }
            
            k = i % cinco;
            if(k == 0){
                
                System.out.println("El número " + i + " es divisible por cinco");
                
            }
            
            
            
        
        }
        
    }

}
