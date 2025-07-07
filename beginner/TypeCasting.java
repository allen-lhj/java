package beginner;

public class TypeCasting {
    // 强制类型转换
    public static void main(String[] args) {
        double d = 9.8;
        int i = (int) d;
        System.out.println("double: " + d + ", casted to int: " + i);

        int x = 50000;
        short s = (short) x;
        System.out.println("int: " + x + ", casted to short: " + s);
    }
}
