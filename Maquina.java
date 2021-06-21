/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador;

import ico.fes.accesorios.Computadora;
import ico.fes.componentes.Cpu;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author sebas
 */
public class Maquina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Computadora compuNueva= new Computadora();
        compuNueva.setMarca("Apple");
        compuNueva.setModelo(2020);
        Monitor pantallaNueva= new Monitor();
        pantallaNueva.setMarca("Samsung");
        pantallaNueva.setModelo("C24F390FH");
        pantallaNueva.setPulgadas(24);
        Mouse ratonNuevo= new Mouse();
        ratonNuevo.setMarca("Logitech");
        ratonNuevo.setModelo("Hero 16K");
        ratonNuevo.setTipo("De juego");
        Teclado tecladoNuevo= new Teclado();
        tecladoNuevo.setMarca("HyperX");
        tecladoNuevo.setModelo("HX-KB5ME23");
        tecladoNuevo.setNumeroDeTeclas(105);
        tecladoNuevo.setMultimedia(10);
        Cpu cpuNuevo= new Cpu();
        cpuNuevo.setMarca("Intel");
        cpuNuevo.setModelo("Core(TM) i5-8257U CPU");
        cpuNuevo.setVelocidadProcesador(2);
        
        System.out.println(compuNueva);
        System.out.println(pantallaNueva);
        System.out.println(ratonNuevo);
        System.out.println(tecladoNuevo);
        System.out.println(cpuNuevo);
        
    }
    
}
