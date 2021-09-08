public class Carro {

    private String modelo;
    private String marca;
    private String cilindraje;
    private String potencia;
    private String combustible;
    private int numPuertas;

    public Carro(String marca){
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCilindraje() {
        return this.cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getPotencia() {
        return this.potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getCombustible() {
        return this.combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getNumPuertas() {
        return this.numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo = " + modelo +
                ", marca =  " + marca +
                ", cilindraje = " + cilindraje +
                ", potencia = " + potencia +
                ", combustible = " + combustible +
                ", Puertas = " + numPuertas +
                '}';
    }
}