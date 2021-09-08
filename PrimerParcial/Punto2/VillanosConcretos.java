public class VillanosConcretos {}

class GranVillano extends Villano{

    public GranVillano(String nombre, String genero, int vida, int inteligencia, int fuerza, int agilidad, int aguante, int benevolencia, int malevolencia){
        super();
        setNombre(nombre);
        setGenero(genero);
        setImagen(7);
        String[] habilidades = {"hab1", "hab2", "hab3"};
        setHabilidades(habilidades);
        setVida(vida);
        setInteligencia(inteligencia);
        setFuerza(fuerza);
        setAgilidad(agilidad);
        setAguante(aguante);
        setBenevolencia(benevolencia);
        setMalevolencia(malevolencia);
        setClase("Gran Villano");
    }

    @Override
    public Villano clone(){
        return new GranVillano(getNombre(), getGenero(), getVida(),getInteligencia(),getFuerza(),getAgilidad(),getAguante(),getBenevolencia(),getMalevolencia());
    }
}

class PequeñoVillano extends Villano{

    public PequeñoVillano(String nombre, String genero, int vida, int inteligencia, int fuerza, int agilidad, int aguante, int benevolencia, int malevolencia){
        super();
        setNombre(nombre);
        setGenero(genero);
        setImagen(8);
        String[] habilidades = {"hab1", "hab2", "hab3"};
        setHabilidades(habilidades);
        setVida(vida);
        setInteligencia(inteligencia);
        setFuerza(fuerza);
        setAgilidad(agilidad);
        setAguante(aguante);
        setBenevolencia(benevolencia);
        setMalevolencia(malevolencia);
        setClase("Pequeño Villano");
    }

    @Override
    public Villano clone(){
        return new PequeñoVillano(getNombre(), getGenero(), getVida(),getInteligencia(),getFuerza(),getAgilidad(),getAguante(),getBenevolencia(),getMalevolencia());
    }
}
