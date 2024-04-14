package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> carList;

    public CarServiceImpl() {
        carList = createFiveCars();
    }

    private List<Car> createFiveCars() {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Lada Kalina", 2190, 180));
        carsList.add(new Car("Patriot", 2356, 165));
        carsList.add(new Car("BMV", 300, 120));
        carsList.add(new Car("Toyota Land Cruiser", 500, 225));
        carsList.add(new Car("Range Rover", 150, 214));
        return carsList;
    }
    public List<Car> getAllCars(int init) {
        return carList.stream().limit(init).collect(Collectors.toList());
    }
}
