/**
 * @author winic
 */
package wbarcellosn.tarefa.factories;

import wbarcellosn.tarefa.cars.JettaCar;
import wbarcellosn.tarefa.cars.SaveiroCar;
import wbarcellosn.tarefa.cars.Car;

public class VolkswagenFactory extends Factory {
    @Override
    Car retrieveCar(String carType) {
        if (carType.equals("1")){
            return new JettaCar(231, 50.00, "Preto", "Jetta GLi 2.0 TSi", 2024);
        } else if (carType.equals("2")){
            return new SaveiroCar(116, 55.00, "Branca", "Saveiro Extreme 1.6 16V", 2024);
        }
        return null;
    }
}
