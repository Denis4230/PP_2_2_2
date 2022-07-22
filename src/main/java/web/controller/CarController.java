package web.controller;

import Car.CarModel;
import Car.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int number,
                       Model model){
        List<CarModel> carModelList = new ArrayList<>();
        carModelList.add(new CarModel(1, "Audi", "Jon"));
        carModelList.add(new CarModel(12, "BMW", "Tom"));
        carModelList.add(new CarModel(123, "Mercedes", "Ethan"));
        carModelList.add(new CarModel(1234, "Toyota", "Alexandr"));
        carModelList.add(new CarModel(12345,"Bentley", "Michal"));
        model.addAttribute("count", CarService.returnAmountCar(carModelList, number));
        return "/cars";
    }

}
