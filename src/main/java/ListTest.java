import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>(List.of(1, 2, 3, 4));
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.add(222);
        System.out.println(list);
    }
}
