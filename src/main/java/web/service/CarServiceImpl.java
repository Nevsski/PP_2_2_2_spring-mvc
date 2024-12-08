package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars;
    private static int counter;


    @Override
    public List<Car> getCars(Integer count) {
        System.out.println(counter);
        System.out.println(count);
        List<Car> res = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            res.add(cars.get(i));
        }
        return res;
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    {
        cars = new ArrayList<>();
        cars.add(new Car("bmw", 11, ++counter));
        cars.add(new Car("mersedes", 12, ++counter));
        cars.add(new Car("audi", 13, ++counter));
        cars.add(new Car("Reno", 14, ++counter));
        cars.add(new Car("Autovaz", 15, ++counter));
    }
}
