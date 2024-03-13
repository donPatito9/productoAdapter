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

public class ProductoStockWebServiceAdapter extends Producto {
    private ProductoStockDisponible productoStock;
   
   public ProductoStockWebServiceAdapter(){
   super();
   this.productoStock = new ProductoStockDisponible();
   System.out.println("*****restProductoStock******....");
   
  }
       @Override
        public void enviarPeticion(){
        System.out.println("enviando peticion Stock");
        this.productoStock.enviarPeticion();
       
}
        @Override
        public void enviarPeticionService(){
        System.out.println("enviando peticion a WebService");
        this.productoStock.enviarPeticion();
       
}
       @Override
        public void actualizar(){
        System.out.println("Actualizando Informacion...");
        this.productoStock.actualizar();
        }
        @Override
        public void mostrarService(){
        System.out.println("Mostrando Informacion stockService");
        this.productoStock.mostrarService();
        }  
         @Override
        public void mostrar(){
        System.out.println("Mostrando Informacion Stock Actual");
        this.productoStock.mostrarService();
        

        }
         @Override
        public void desconectar(){
        System.out.println("Desconectando servicio");
        this.productoStock.desconectar();

        }
 }

