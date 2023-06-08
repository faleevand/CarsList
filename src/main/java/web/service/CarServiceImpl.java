package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class CarServiceImpl implements CarService {

    private static int car_count;
    private List<Car> cars;

    {
        cars = new ArrayList<Car>();
        cars.add(new Car(++car_count, "Ford", 33));
        cars.add(new Car(++car_count, "Kia", 55));
        cars.add(new Car(++car_count, "BMW", 7));
        cars.add(new Car(++car_count, "Toyota", 200));
        cars.add(new Car(++car_count, "Nissan", 15));
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        return cars.stream().filter(car -> car.getId() <= count).toList();
    }

}



