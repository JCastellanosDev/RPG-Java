package Personaje;

public class Mago extends Personaje {
    private double poder;
    private double varita;
    private double mana;

    public Mago() {
        this.poder = 20;
        this.varita = 40;
        this.mana = 20;
        this.setATK((int) (getATK() +(poder * .1) + (varita * .5)));
    }

    public Mago(double poder, double varita, double mana) {
        this.poder = poder;
        this.varita = varita;
        this.mana = mana;
        this.setATK((int) (getATK() +(poder * .1) + (varita * .5)));
    }

    public Mago(Mago m) {
        this.poder = m.poder;
        this.varita = m.varita;
        this.mana = m.mana;
        this.setATK((int) (getATK() +(poder * .1) + (varita * .5)));
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getVarita() {
        return varita;
    }

    public void setVarita(double varita) {
        this.varita = varita;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return super.toString() + "Mago: {"+
                " poder=" + poder +
                ", varita=" + varita +
                ", mana=" + mana +
                '}';
    }
}

