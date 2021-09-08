public class Director {

    private final Builder builderCarro;

    public Director(Builder bulderOrdenador){
        this.builderCarro = bulderOrdenador;
    }
    public Carro builder(){
        builderCarro.buildModelo();
        builderCarro.buildCilindraje();
        builderCarro.buildPotencia();
        builderCarro.buildCombustible();
        builderCarro.buildNumPuertas();
        return builderCarro.getObject();
    }

}