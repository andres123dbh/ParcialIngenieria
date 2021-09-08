public class HeroesConcretos {}


class HeroeVeterano extends Heroe{

    public HeroeVeterano(String nombre, String genero, int vida, int inteligencia, int fuerza, int agilidad, int aguante, int benevolencia, int malevolencia){
        super();
        setNombre(nombre);
        setGenero(genero);
        setImagen(1);
        String[] habilidades = {"hab1", "hab2", "hab3"};
        setHabilidades(habilidades);
        setVida(vida);
        setInteligencia(inteligencia);
        setFuerza(fuerza);
        setAgilidad(agilidad);
        setAguante(aguante);
        setBenevolencia(benevolencia);
        setMalevolencia(malevolencia);
        setClase("Heroe Veterano");
    }

    @Override
    public Heroe clone(){
        return new HeroeVeterano(getNombre(), getGenero(), getVida(),getInteligencia(),getFuerza(),getAgilidad(),getAguante(),getBenevolencia(),getMalevolencia());
    }
}

class HeroeNovato extends Heroe{

    public HeroeNovato(String nombre, String genero, int vida, int inteligencia, int fuerza, int agilidad, int aguante, int benevolencia, int malevolencia){
        super();
        setNombre(nombre);
        setGenero(genero);
        setImagen(2);
        String[] habilidades = {"hab1", "hab2", "hab3"};
        setHabilidades(habilidades);
        setVida(vida);
        setInteligencia(inteligencia);
        setFuerza(fuerza);
        setAgilidad(agilidad);
        setAguante(aguante);
        setBenevolencia(benevolencia);
        setMalevolencia(malevolencia);
        setClase("Heroe Novato");
    }

    @Override
    public Heroe clone(){
        return new HeroeNovato(getNombre(), getGenero(), getVida(),getInteligencia(),getFuerza(),getAgilidad(),getAguante(),getBenevolencia(),getMalevolencia());
    }
}