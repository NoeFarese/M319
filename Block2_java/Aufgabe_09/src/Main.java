import java.util.Random;
public class Main {
    public static void main(String[] args) {

        System.out.print("Ausgaben: ");
        for (int i = 0; i <= 5 ; i++) {
            int min = 1;
            int max = 42;
            Random random = new Random();
            int value = random.nextInt(max + min) + min;
            System.out.print(value + ",");

        }

        int min = 1;
        int max = 6;

        Random random1 = new Random();
        int value1 = random1.nextInt(max + min) + min;
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Glückszahl: " + value1);
    }
}