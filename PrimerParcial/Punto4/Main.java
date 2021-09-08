public class Main {
    public static void main(String [] args){
        Builder b = new carroToyota();

        Director director = new Director(b);
        Carro carroToyota = director.builder();

        System.out.println(carroToyota.toString());
    }
}
