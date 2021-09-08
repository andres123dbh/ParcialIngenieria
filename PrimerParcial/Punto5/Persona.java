public class Persona{
    private String nombre;
    private int edad;
    private int numDocumento;
    private static Persona instance;

    private Persona(String nombre, int edad, int numDocumento) {
        this.nombre = nombre;
        this.edad = edad;
        this.numDocumento = numDocumento;
    }
    
    public static String getInstance(String nombre, int edad, int numDocumento){
        if (Persona.instance == null) {
            Persona.instance = new Persona(nombre, edad, numDocumento);
        }
        return instance.toString();
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre = " + nombre +
                ", Edad =  " + edad +
                ", Numero Documetno = " + numDocumento +
                '}';
    }

}