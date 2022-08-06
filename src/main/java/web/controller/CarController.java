package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import web.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

    @Autowired
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int number,
                       Model model){
        if(number >= 5) {
            model.addAttribute("count", carService.getAllCar());
        } else {
            model.addAttribute("count", carService.returnAmountCar(number));
        }
        return "cars";
    }

}
