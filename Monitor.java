/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author sebas
 */
public class Monitor {
    private String marca;
    private String modelo;
    private float pulgadas;

    public Monitor() {
    }

    public Monitor(String marca, String modelo, float pulgadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + ", modelo=" + modelo + ", pulgadas=" + pulgadas + '}';
    }
    
       public void encender(){
       System.out.println("Encendido");

   }
    
   public void apagar(){
       System.out.println("Apagado");
   
   }
   
   
}
