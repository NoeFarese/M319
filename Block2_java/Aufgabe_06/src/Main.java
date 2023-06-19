import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        short tag = 0;
        short monat = 0;
        short jahr = 0;

        System.out.println("Tag: ");
        Scanner scan1 = new Scanner(System.in);
        tag = scan1.nextShort();

        System.out.println("Monat: ");
        Scanner scan2 = new Scanner(System.in);
        monat = scan2.nextShort();

        System.out.println("Jahr: ");
        Scanner scan3 = new Scanner(System.in);
        jahr = scan3.nextShort();

        System.out.println("Ihre Eingaben: ");
        System.out.println("Tag: " + tag);
        System.out.println("Monat: " + monat);
        System.out.println("Jahr: " + jahr);

    }
}