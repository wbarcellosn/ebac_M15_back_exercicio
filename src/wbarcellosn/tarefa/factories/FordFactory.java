/**
 * @author winic
 */
package wbarcellosn.tarefa.factories;

import wbarcellosn.tarefa.cars.FordKaCar;
import wbarcellosn.tarefa.cars.RangerCar;
import wbarcellosn.tarefa.cars.Car;

public class FordFactory extends Factory {

    @Override
    Car retrieveCar(String carType) {
        if (carType.equals("1")){
            return new FordKaCar(136, 51.00, "Preto", "Ford Ka Sedan SE Plus 1.5", 2021);
        } else if (carType.equals("2")){
            return new RangerCar(397, 82.00, "Vermelho", "Ford Ranger Raptor 3.0 v6", 2024);
        }
        return null;
    }
}
