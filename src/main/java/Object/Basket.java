package Object;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SessionScope
@Component
public class Basket {
    private Set<Integer> ints;
    private static int iteration = 1;

    public Basket() {
        this.ints = new HashSet<>(List.of());
    }


    public int addInts(List<Integer> ints) {
        this.ints.addAll(ints);
        return iteration++;
    }
    public Set<Integer> getInts() {
        return ints;
    }

    public int getIteration() {
        return iteration;
    }

}
