package beginner;

public class Break1 {
    public static void main(String[] args) {
        int num;
        num = 100;
        for (int i = 0; i < num; i++) {
            if (i == 10) break;;
            System.out.println(i + " ");
        }
        System.out.println("Loop complete");
    }
}
