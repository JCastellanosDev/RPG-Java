package pelea;

import Personaje.Personaje;
import UI.CrearPersonaje;


public class Arena {

    public void inicarPelea(){
        CrearPersonaje nuevo = new CrearPersonaje();
        System.out.println("Crear Personaje 1: ");
        Personaje p1 = nuevo.iniciarPersonaje();
        System.out.println("Crear Personaje 2: ");
        Personaje p2 = nuevo.iniciarPersonaje();

        System.out.println("\nQue comience la pelea: ");
        System.out.println(p1.getNombre() +" vs "+p2.getNombre()+"\n");
    }
}
