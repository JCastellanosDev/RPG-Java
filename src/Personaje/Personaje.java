package Personaje;

public class Personaje {
    private String nombre;
    private int HP;
    private int ATK;
    private int DEF;
    private boolean vivo;

    public Personaje(){
        this.nombre="default";
        this.HP=100;
        this.ATK=10;
        this.DEF=5;
        this.vivo=true;
    }
    public Personaje(String nombre){
        this.nombre=nombre;
        this.HP=100;
        this.ATK=10;
        this.DEF=5;
        this.vivo=true;

    }
    public Personaje(String nombre, int HP, int ATK, int DEF, boolean vivo){
        this.nombre=nombre;
        this.HP=HP;
        this.ATK=ATK;
        this.DEF=DEF;
        this.vivo=vivo;
    }
    public Personaje(Personaje personaje){
        this.nombre=personaje.nombre;
        this.HP=personaje.HP;
        this.ATK=personaje.ATK;
        this.DEF=personaje.DEF;
        this.vivo=personaje.vivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public int getDEF() {
        return DEF;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void recibirDaño(int daño){
        this.HP = this.HP - daño;
        if (this.HP<=0){
            this.vivo=false;
        }
    }
    public void atacar(Personaje objetivo){
        objetivo.recibirDaño(this.ATK);
    }
}
