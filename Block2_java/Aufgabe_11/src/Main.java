import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Es wurde eine Zahl von 1 bis 100 generiert. Kannst du erraten welche es ist? Du hast 5 Versuche!");

        int min = 1;
        int max = 100;
        Random random = new Random();
        int value = random.nextInt(max + min) + min;
        System.out.println(value);

        boolean check = true;
        boolean quit = true;

        while (check) {
            Scanner userInput = new Scanner(System.in);
            int userZahl = userInput.nextInt();
            if (userZahl > value) {
                System.out.println("Die Zahl die gesucht wird ist kleiner!");
            }

            if (userZahl < value) {
                System.out.println("Die Zahl die gesucht wird ist grösser!");
            }

            if (userZahl < 1) {
                System.out.println("Bitte wählen Sie eine Zahl zwischen 1-100");
            }

            if (userZahl > 100) {
                System.out.println("Bitte wählen Sie eine Zahl zwischen 1-100");
            }

            if (userZahl == value) {
                check = false;
                System.out.println("Du hast die richtige Zahl erraten!");

                System.out.println("Möchtest du ein neues Spiel starten? \"n\" / \"j\" ");
                Scanner scan2 = new Scanner(System.in);
                String falsch = scan2.nextLine();

                if (falsch.equals("n")) {
                   // quit = false;
                    System.exit(0);
                } else if (falsch.equals("j")) {
                    while (quit = true) {
                        logik(min, max, value);
                    }
                }
            }
        }
    }

    public static void logik(int min, int max, int value) {
        System.out.println("Es wurde eine Zahl von 1 bis 100 generiert. Kannst du erraten welche es ist? Du hast 5 Versuche!");

        min = 1;
        max = 100;
        Random random = new Random();
        value = random.nextInt(max + min) + min;
        System.out.println(value);


        boolean check = true;
        boolean quit = true;

        while (check) {
            Scanner userInput = new Scanner(System.in);
            int userZahl = userInput.nextInt();
            if (userZahl > value) {
                System.out.println("Die Zahl die gesucht wird ist kleiner!");
            }

            if (userZahl < value) {
                System.out.println("Die Zahl die gesucht wird ist grösser!");
            }

            if (userZahl < 1) {
                System.out.println("Bitte wählen Sie eine Zahl zwischen 1-100");
            }

            if (userZahl > 100) {
                System.out.println("Bitte wählen Sie eine Zahl zwischen 1-100");
            }

            if (userZahl == value) {
                check = false;
                System.out.println("Du hast die richtige Zahl erraten!");

                System.out.println("Möchtest du ein neues Spiel starten? \"n\" / \"j\" ");
                Scanner scan2 = new Scanner(System.in);
                String falsch = scan2.nextLine();

                if (falsch.equals("n")) {
                    quit = false;
                } else if (falsch.equals("j")) {
                    System.out.println("Raten sie nochmals: ");
                    break;
                }
            }
        }
    }
}


