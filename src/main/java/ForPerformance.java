import java.util.stream.IntStream;

public class ForPerformance {

    private static int ITERATOR_NUM= Integer.MAX_VALUE;

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        int start_num = 0;
        for (int i=0;i<ITERATOR_NUM; i++){
            start_num ++;
        }

        long end = System.currentTimeMillis();
        System.out.println( "for loop : " + (end-start));  // 3

// ------------------------為什麼JAVA 8 Stream 比較慢!!!!!--------------------------------

        start = System.currentTimeMillis();

        IntStream.range(0, ITERATOR_NUM).forEach(num -> num++);

        end = System.currentTimeMillis();
        System.out.println( "Stream : " + (end-start)); // 5

    }

}
