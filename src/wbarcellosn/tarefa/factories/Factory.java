/**
 * @author winic
 */
package wbarcellosn.tarefa.factories;

import wbarcellosn.tarefa.cars.Car;

public abstract class Factory {

    public Car create(String carType) {
        return retrieveCar(carType);
    }

    abstract Car retrieveCar(String carType);
}
