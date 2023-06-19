import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Name des Spieler 1: ");
        Scanner scanner1 = new Scanner(System.in);
        String name1 = scanner1.nextLine();

        System.out.println("Name des Spieler 2: ");
        Scanner scanner2 = new Scanner(System.in);
        String name2 = scanner2.nextLine();

        System.out.println("Ihre Zielpunktzahl: ");
        Scanner scanner4 = new Scanner(System.in);
        String zielPunktzahl = scanner4.nextLine();

        System.out.println("Name Spieler 1: " + name1);
        System.out.println("Name Spieler 2 " + name2);
        System.out.println("Ihre Zielpunktzahl " + zielPunktzahl);

      //System.out.println((Math. random()*6+1));

        System.out.println("Spieler 1: Für Würfeln j schreiben und für sichern der Punkt n.");
        Scanner scanner3 = new Scanner(System.in);
        String entscheidung = scanner3.nextLine();
    }
}