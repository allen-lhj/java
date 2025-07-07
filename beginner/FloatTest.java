package beginner;

import java.math.BigDecimal;

public class FloatTest {
    public static void main(String[] args) {
        double x = 12.3;
        double y = 11.6;

        BigDecimal a = new BigDecimal("12.3");
        BigDecimal b = new BigDecimal("11.6");
        System.out.println(a.subtract(b)); // 0.7
        double c = x - y;
        System.out.println(c); // 0.7000000000000011
    }
}
