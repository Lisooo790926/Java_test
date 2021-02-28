public class TestPromoWhenContinousAdd {

    /**
     * Prove this WRONG!!
     * a=a+b與a+=b的區別為何?
     * a+=b會先將資料型別提升至少至int型別，而a=a+b則不會，因此如果今天將a與b都宣告為byte型別 --> wrong
     * a = a+b 會提升到int, a += b 不會提升!!
     *
     * 相加超過127時就會產生錯誤 --> wrong 只要轉型就不會錯誤
     */

    public static void main(String[] args) {

        byte a = Byte.MAX_VALUE;  //127
        System.out.println(a);
        byte b = Byte.parseByte("1");
        byte c = 0;
        a = (byte) (a + b);
        System.out.println(c); // -128
        a += b;
        System.out.println(a); // -128
    }
}
