
package entities;

/**
 *
 * @author jessi
 */
public class Salario {

   
    
  
    public double taxa;
    public double bruto;
    public String nome;
   

    public double SalarioLiquido(){
        return bruto - taxa;
    }
    
    
    
    
    public void Acrescimo(double porcentagem){
    bruto += bruto * porcentagem /100;
    
    }
    
    public String toString() {
        
        return "Nome: "+nome + ", $ "+ String.format("%.2f",SalarioLiquido());
    
    }
}


