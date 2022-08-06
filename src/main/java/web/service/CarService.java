package web.service;

import org.springframework.stereotype.Component;
import web.model.CarModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {

    private final List<CarModel> listCar = new ArrayList<>();
    {
            listCar.add(new CarModel(1, "Audi", "Jon"));
            listCar.add(new CarModel(12, "BMW", "Tom"));
            listCar.add(new CarModel(123, "Mercedes", "Ethan"));
            listCar.add(new CarModel(1234, "Toyota", "Alexandr"));
            listCar.add(new CarModel(12345,"Bentley", "Michal"));
    }

    public List<CarModel> getAllCar() {
        return listCar;
    }

    public List<CarModel> returnAmountCar(int number){
        return listCar.stream().limit(number).collect(Collectors.toList());
    }

}
