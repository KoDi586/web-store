package controlls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;
import services.StoreService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/store")
public class StoreController {
    private static StoreService storeService;


    @GetMapping
    public static String check() {
        return "check";
    }

    @GetMapping(path = "/order/add")
    public static String addThings(@RequestParam int id, @RequestParam(required = false) int id1) {
        List<Integer> arr = new ArrayList<>(List.of());

        arr.add(id);
        if (id1 != 0) {
            arr.add(id1);
        }
        return storeService.addNums(arr) + " - итерация. id добавлен";
    }

    @GetMapping(path = "/order/get")
    public static String getThings() {
        return storeService.getBusket();
    }
}
