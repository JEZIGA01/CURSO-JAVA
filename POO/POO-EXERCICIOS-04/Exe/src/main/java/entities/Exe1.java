package entities;

public class Exe1 {

    private String tipo;
    private String marca;
    private String modelo;
    private String estado;

    public Exe1(String tipo, String marca, String modelo, String estado){

        this.tipo = tipo; 
        this.marca = marca;
        this.modelo = modelo; 
        this.estado = estado;
    }
      
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public void setEstado(String estado) {
        this.estado = estado ;
    }

    
    public String getTipo() {
        return tipo;
    }
    

    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }

    public String getEstado() {
       
        return estado;
    }

}
