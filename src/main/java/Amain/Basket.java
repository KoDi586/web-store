package Amain;

import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@SessionScope
public class Basket {
    private List<Integer> ints;
    private static int iteration = 1;

    public Basket() {
        this.ints = new ArrayList<>(List.of());
    }


    public int addInts(List<Integer> ints) {
        this.ints.addAll(ints);
        return iteration++;
    }
    public List<Integer> getInts() {
        return ints;
    }

    public int getIteration() {
        return iteration;
    }

}
