public class MonstuosConcretos {}

class MonstruoBueno extends Monstruo{

    public MonstruoBueno(String nombre, String genero, int vida, int inteligencia, int fuerza, int agilidad, int aguante, int benevolencia, int malevolencia){
        super();
        setNombre(nombre);
        setGenero(genero);
        setImagen(3);
        String[] habilidades = {"hab1", "hab2", "hab3"};
        setHabilidades(habilidades);
        setVida(vida);
        setInteligencia(inteligencia);
        setFuerza(fuerza);
        setAgilidad(agilidad);
        setAguante(aguante);
        setBenevolencia(benevolencia);
        setMalevolencia(malevolencia);
        setClase("Monstuo Bueno");
    }

    @Override
    public Monstruo clone(){
        return new MonstruoBueno(getNombre(), getGenero(), getVida(),getInteligencia(),getFuerza(),getAgilidad(),getAguante(),getBenevolencia(),getMalevolencia());
    }
}

class MonstruoMalo extends Monstruo{

    public MonstruoMalo(String nombre, String genero, int vida, int inteligencia, int fuerza, int agilidad, int aguante, int benevolencia, int malevolencia){
        super();
        setNombre(nombre);
        setGenero(genero);
        setImagen(4);
        String[] habilidades = {"hab1", "hab2", "hab3"};
        setHabilidades(habilidades);
        setVida(vida);
        setInteligencia(inteligencia);
        setFuerza(fuerza);
        setAgilidad(agilidad);
        setAguante(aguante);
        setBenevolencia(benevolencia);
        setMalevolencia(malevolencia);
        setClase("Monstuo Malo");
    }

    @Override
    public Monstruo clone(){
        return new MonstruoMalo(getNombre(), getGenero(), getVida(),getInteligencia(),getFuerza(),getAgilidad(),getAguante(),getBenevolencia(),getMalevolencia());
    }
}
