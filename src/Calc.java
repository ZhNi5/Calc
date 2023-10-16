public class Calc {
    public static String sum(String a, String b) {
        int numberA=Integer.parseInt(a);
        int numberB=Integer.parseInt(b);
        int resultInt=numberA+numberB;

        String result = Integer.toString(resultInt);
        return result;
    }
}
