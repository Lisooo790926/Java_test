public class TestLimit {

    public static void main(String[] args) {
        long i = Long.MAX_VALUE;
        double d = i;
        System.out.println(i);
        System.out.println(d);
        // 所以喪失精度呈現
        int j = 0x11;
        System.out.println(j);
    }

}
