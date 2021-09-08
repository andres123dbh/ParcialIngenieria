public class CarroBuilder{}

class carroToyota implements Builder{
    private final Carro carroToyota = new Carro("toyota");

    @Override
    public void buildModelo() {
        carroToyota.setModelo("Yaris");;
    }

    @Override
    public void buildCilindraje() {
        carroToyota.setCilindraje("996 cm3");;
    }

    @Override
    public void buildPotencia() {
        carroToyota.setPotencia("1.0 / 69 CV (51kW)");;
    }

    @Override
    public void buildCombustible() {
        carroToyota.setCombustible("1.5 litros");;
    }

    @Override
    public void buildNumPuertas() {
        carroToyota.setNumPuertas(4);;
    }

    @Override
    public Carro getObject() {
        return carroToyota;
    }
}