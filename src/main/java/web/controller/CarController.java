package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import model.Car;
import service.Service;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCar(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int init) {
        List<String> messages = new ArrayList<>();
        Service service = new Service();
        List<Car> carList = service.createFiveCars(
                "Lada Kalina", 2190, 180,
                "Patriot", 2356, 165,
                "BMV", 300, 120,
                "Toyota Land Cruiser", 500, 225,
                "Range Rover", 150, 214);
        if (init >= 5) {
            messages.add(service.gerAllCar(carList).toString());
            model.addAttribute("messages", messages);
        } else if (init == 1) {
            messages.add(service.getOneCar(carList).toString());
            model.addAttribute("messages", messages);
        } else if (init == 2) {
            messages.add(service.getTwoCar(carList).toString());
            model.addAttribute("messages", messages);
        } else if (init == 3) {
            messages.add(service.getThreeCar(carList).toString());
            model.addAttribute("messages", messages);
        } else if (init == 4) {
            messages.add(service.getFourCar(carList).toString());
            model.addAttribute("messages", messages);
        }
        return "cars";
    }
}
