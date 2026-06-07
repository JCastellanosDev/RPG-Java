package UI;

import Personaje.Personaje;

import static Interface.separadores.SEPARADOR;

public class CrearPersonaje {

    public CrearPersonaje(){}
    public Personaje iniciarPersonaje(){
        System.out.println(SEPARADOR);
        System.out.println("Bienvenido al crear personaje");
        System.out.println(SEPARADOR);
        String nombre  = IO.readln("Como se llamara tu personaje");

        Personaje nuevo = new Personaje(nombre);
        return nuevo;
    }

}
