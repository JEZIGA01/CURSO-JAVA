
package entities;

/**
 *
 * @author jejeziga
 */
public class Retangulo {
    
    
    public double largura;
   public double altura;
   
   
   
   public double Area(){
     
     
     
   return largura * altura;
   }
    
    public double Perimetro(){
        
    
        return  (2*largura)+(2*altura);
    }
     public double  Diagonal(){
         
         
        
        
    return  Math.sqrt((largura*largura)+(altura*altura));
    
    }

    
}
