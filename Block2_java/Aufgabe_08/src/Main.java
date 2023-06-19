import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String falsch;

        do {

            System.out.println("Bitte geben Sie eine ganze Zahl ein: ");
            Scanner scanner1 = new Scanner(System.in);
            int zahl = scanner1.nextInt();

            int sum = getCheckSum(zahl);
            if (zahl % 1 == 0) {
                //int sum = getCheckSum(zahl);
                System.out.println("Der Querdurchschnitt ist " + sum);
            } else {
                System.out.println("ungültige eingabe");
            }

            if (sum % 3 == 0) {
                System.out.println("Teilbar durch 3: Ja");
            } else {
                System.out.println("Teilbar durch 3: Nein");
            }

            if (sum % 9 == 0) {
                System.out.println("Teilbar durch 9: Ja");
            } else {
                System.out.println("Teilbar durch 9: Nein");
            }

            System.out.println("Möchtest du ein neues Spiel starten? \"n\" / \"j\" ");
            Scanner scan2 = new Scanner(System.in);
            falsch = scan2.nextLine();

        } while (falsch.equals("j"));
    }


    public static int getCheckSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
    }
}


