/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockproductos;

/**
 *
 * @author Us
 */
public class Productos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Productos miPrincipal = new Productos();
      
        System.out.println("**************************************");
        System.out.println("\n******Stock actual en el sistema******");
        System.out.println("**************************************");
        miPrincipal.mostrarStockActual();
        //miPrincipal.mostrarStock();
        System.out.println("**************************************\n");
        System.out.println("******Stock Adaptader webService********");
        miPrincipal.mostrarStockDisponible();
        System.out.println("**************************************\n"); 
        System.out.println("**************************************\n");
    }

    private void mostrarStockActual(){
        Producto stock = new ProductoStockActual();
        
        stock.enviarPeticion();
        //stock.actualizar();
        stock.mostrar();
        //stock.desconectar();
    }
    
     private void mostrarStockDisponible(){
        Producto stock = new ProductoStockWebServiceAdapter();
        stock.enviarPeticionService();
        stock.actualizar();
        stock.mostrarService();
        stock.desconectar();
    }
     
    
    
}