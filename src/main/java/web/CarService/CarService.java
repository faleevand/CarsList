package web.CarService;

import org.springframework.stereotype.Component;
import web.Car.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {

    private static int CarCount;
    private List<Car> cars;

    {
        cars = new ArrayList<Car>();
        cars.add(new Car(++CarCount, "Ford", 33));
        cars.add(new Car(++CarCount, "Kia", 55));
        cars.add(new Car(++CarCount, "BMW", 7));
        cars.add(new Car(++CarCount, "Toyota", 200));
        cars.add(new Car(++CarCount, "Nissan", 15));
    }

    public List<Car> getCarsByCount(int id) {
        return cars.stream().filter(car -> car.getId() <= id).toList();
    }

}



