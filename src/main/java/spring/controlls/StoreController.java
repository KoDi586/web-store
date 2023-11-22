package spring.controlls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.services.StoreService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/store")
public class StoreController {
    private final StoreService storeService;

    @Autowired
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping
    public String check() {
        return "check";
    }

    @GetMapping(path = "/order/add")
    public String addThings(@RequestParam int id, @RequestParam(required = false) Integer id1) {
        List<Integer> arr = new ArrayList<>(List.of());

        arr.add(id);
        if (id1 != null) {
            arr.add(id1);
        }
        return storeService.addNums(arr) + " - итерация. id добавлен";
    }

    @GetMapping(path = "/order/get")
    public String getThings() {
        return storeService.getBusket();
    }
}
