import java.util.List;

public class TestReduce {

    public static void main(String[] args) {

        List<Double> list = List.of(1d, 2d, 3d);
        final Double aDouble = list.stream().reduce((price, value) -> price - value).get();
        System.out.println(aDouble);

    }
}
