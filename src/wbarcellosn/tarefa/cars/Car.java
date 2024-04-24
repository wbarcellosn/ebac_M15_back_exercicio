/**
 * @author winic
 */
package wbarcellosn.tarefa.cars;

public abstract class Car {

    private Integer horsePower;
    private Double fuelSource;
    private String color;
    private String model;
    private Integer modelYear;

    public Car(Integer horsePower, Double fuelSource, String color, String model, Integer modelYear) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
        this.model = model;
        this.modelYear = modelYear;
    }

    @Override
    public String toString() {
        return "VEÍCULO DISPONÍVEL:\n" +
                "\nModelo: " + model +
                "\nAno: " + modelYear +
                "\nPotência: " + horsePower + " cavalos de potência" +
                "\nTanque: " + fuelSource + " litros" +
                "\nCor: " + color + "\n";
    }

}
