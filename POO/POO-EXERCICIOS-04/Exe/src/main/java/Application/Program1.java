package Application;
 
import entities.Exe1;
  

public class Program1 {
    public static void main(String[] args) {
 
 
        String modelo="",marca="",tipo="",estado="";
 

        Exe1 produto = new Exe1(modelo, marca, tipo, estado); 
        
       produto.setModelo("XSDD");
       produto.setMarca("xuniL");
       produto.setTipo("44-w");
       produto.setEstado("desligado");
       

       System.out.println(" Modelo atualizado: "+produto.getModelo());
       
       System.out.println(" Marca atualizada: "+produto.getMarca());
       
       System.out.println(" Tipo atualizado: "+produto.getTipo());
       
       System.out.println(" Estado atualizado: "+produto.getEstado());



        

  

       
    }
}
