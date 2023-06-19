import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int startZahl = 0;
        int endZahl = 0;

        System.out.println("Startzahl: ");
        Scanner scan1 = new Scanner(System.in);
        startZahl = scan1.nextInt();

        System.out.println("Endzahl: ");
        Scanner scan2 = new Scanner(System.in);
        endZahl = scan2.nextInt();

        int i = startZahl;
        while (i <= endZahl)
        {
            System.out.print(i);
            if ((i-startZahl+1) % 10 == 0)
                System.out.println();
            else
            if (i!=endZahl)
                System.out.print(", ");
            i++;
        }

    }
}