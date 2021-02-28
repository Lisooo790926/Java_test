import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class EncodingTest {

    public static void main(String[] args) {

//        String test = "犇";
//        final byte[] bytes = test.getBytes();
//        System.out.println("UTF-8");
//        System.out.println(Arrays.toString(bytes));
//        System.out.println(bytes.length);
//        for (Byte each : bytes) {
//            System.out.println(Integer.toHexString(each));
//            System.out.println(each);
//        }

        String test2 = "犇";
        final String s = new String(test2.getBytes(), StandardCharsets.UTF_16);
        System.out.println(s.getBytes().length);

        String test = "犇";
        final byte[] bytes1 = test.getBytes(StandardCharsets.UTF_16);
        System.out.println("UTF-16 Big-endial");
        System.out.println(Arrays.toString(bytes1));
        System.out.println(bytes1.length);
        for (Byte each : bytes1) {
            System.out.println(Integer.toHexString(each));
        }
    }
}
