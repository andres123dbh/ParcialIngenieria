public class PrincipesConcretos {}

class PrincipeBobo extends Principe{

    public PrincipeBobo(String nombre, String genero, int vida, int inteligencia, int fuerza, int agilidad, int aguante, int benevolencia, int malevolencia){
        super();
        setNombre(nombre);
        setGenero(genero);
        setImagen(5);
        String[] habilidades = {"hab1", "hab2", "hab3"};
        setHabilidades(habilidades);
        setVida(vida);
        setInteligencia(inteligencia);
        setFuerza(fuerza);
        setAgilidad(agilidad);
        setAguante(aguante);
        setBenevolencia(benevolencia);
        setMalevolencia(malevolencia);
        setClase("Principe Bobo");
    }

    @Override
    public Principe clone(){
        return new PrincipeBobo(getNombre(), getGenero(), getVida(),getInteligencia(),getFuerza(),getAgilidad(),getAguante(),getBenevolencia(),getMalevolencia());
    }
}

class PrincipeListo extends Principe{

    public PrincipeListo(String nombre, String genero, int vida, int inteligencia, int fuerza, int agilidad, int aguante, int benevolencia, int malevolencia){
        super();
        setNombre(nombre);
        setGenero(genero);
        setImagen(6);
        String[] habilidades = {"hab1", "hab2", "hab3"};
        setHabilidades(habilidades);
        setVida(vida);
        setInteligencia(inteligencia);
        setFuerza(fuerza);
        setAgilidad(agilidad);
        setAguante(aguante);
        setBenevolencia(benevolencia);
        setMalevolencia(malevolencia);
        setClase("Principe Listo");
    }

    @Override
    public Principe clone(){
        return new PrincipeListo(getNombre(), getGenero(), getVida(),getInteligencia(),getFuerza(),getAgilidad(),getAguante(),getBenevolencia(),getMalevolencia());
    }
}