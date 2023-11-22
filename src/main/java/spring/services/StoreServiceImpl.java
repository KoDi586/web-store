package spring.services;

import Object.Basket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    private Basket basket;

    @Autowired
    public StoreServiceImpl() {
        this.basket = new Basket();
    }

    public int addNums(List<Integer> integerList) {
        return this.basket.addInts(integerList);
    }

    public String getBusket() {
        StringBuilder sb = new StringBuilder();
        for (Integer number : this.basket.getInts()) {
            sb.append(number.toString());
            sb.append(", ");
        }
        return sb.toString();
    }
}
