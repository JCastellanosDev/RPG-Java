package Personaje;

public class Caballero extends Personaje{
    private double Fuerza;
    private double Escudo;
    private double Espada;


    public Caballero(){
        this.Fuerza=20;
        this.Escudo=30;
        this.Espada =10;
        this.setATK((int) (getATK()+((Fuerza*.1)+(Espada*.1))));
        this.setDEF((int) (getDEF()+(Escudo*.1)));

    }
    public Caballero(double Fuerza,double Escudo, double Espada){
    this.Fuerza=Fuerza;
    this.Escudo=Escudo;
    this.Espada=Espada;
        this.setATK((int) (getATK()+((Fuerza*.1)+(Espada*.1))));
        this.setDEF((int) (getDEF()+(Escudo*.1)));
    }
    public Caballero(Caballero c){
        this.Fuerza=c.Fuerza;
        this.Escudo=c.Escudo;
        this.Espada=c.Espada;
        this.setATK((int) (getATK()+((Fuerza*.1)+(Espada*.1))));
        this.setDEF((int) (getDEF()+(Escudo*.1)));
    }

    public double getFuerza() {
        return Fuerza;
    }

    public void setFuerza(double fuerza) {
        Fuerza = fuerza;
    }

    public double getEspada() {
        return Espada;
    }

    public void setEspada(double espada) {
        Espada = espada;
    }

    public double getEscudo() {
        return Escudo;
    }

    public void setEscudo(double escudo) {
        Escudo = escudo;
    }

    @Override
    public String toString() {
        return super.toString() + "Caballero: {" +
                "Fuerza=" + Fuerza +
                ", Escudo=" + Escudo +
                ", Espada=" + Espada +
                '}';
    }
}
