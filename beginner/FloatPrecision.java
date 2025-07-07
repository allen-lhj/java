package beginner;

import java.math.BigDecimal;

public class FloatPrecision {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        System.out.println("a + b =" + (a + b));

        BigDecimal dbA = new BigDecimal("0.1");
        BigDecimal dbB = new BigDecimal("0.2");
        System.out.println("dbA + dbB =" + dbA.add(dbB));
    }
    
}
