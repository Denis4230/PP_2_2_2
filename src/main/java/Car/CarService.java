package Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    public static List<CarModel> returnAmountCar(List<CarModel> listCar, int number){
        return listCar.stream().limit(number).collect(Collectors.toList());
    }

}
