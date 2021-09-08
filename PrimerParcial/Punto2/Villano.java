public abstract class Villano {
    private String nombre;
    private String genero;
    private int imagen;
    private String[] habilidades;
    private int vida;
    private int inteligencia;
    private int fuerza;
    private int agilidad;
    private int aguante;
    private int benevolencia;
    private int malevolencia;
    private String clase;

    public Villano(){}

    public Villano(String nombre, String genero, int imagen, String[] habilidades, int vida, int inteligencia, int fuerza, int agilidad, int aguante, int benevolencia, int malevolencia) {
        this.nombre = nombre;
        this.genero = genero;
        this.imagen = imagen;
        this.habilidades = habilidades;
        this.vida = vida;
        this.inteligencia = inteligencia;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.aguante = aguante;
        this.benevolencia = benevolencia;
        this.malevolencia = malevolencia;
    }

    public abstract Villano clone();

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getImagen() {
        return this.imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String[] getHabilidades() {
        return this.habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getInteligencia() {
        return this.inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getFuerza() {
        return this.fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return this.agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getAguante() {
        return this.aguante;
    }

    public void setAguante(int aguante) {
        this.aguante = aguante;
    }

    public int getBenevolencia() {
        return this.benevolencia;
    }

    public void setBenevolencia(int benevolencia) {
        this.benevolencia = benevolencia;
    }

    public int getMalevolencia() {
        return this.malevolencia;
    }

    public void setMalevolencia(int malevolencia) {
        this.malevolencia = malevolencia;
    }

    public String getClase() {
        return this.clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
}