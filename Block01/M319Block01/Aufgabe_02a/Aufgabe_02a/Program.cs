using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Aufgabe_02a
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int schritte = 0;
            double kontostand = 0;
            double xAchse = 0;
            String adresse = "";

            Console.Write("Anzahl Schritte: ");
            schritte = Convert.ToInt32(Console.ReadLine());

            Console.Write("Kontostand: ");
            kontostand = Convert.ToDouble(Console.ReadLine());

            Console.Write("Position der X-Achse: ");
            xAchse = Convert.ToDouble(Console.ReadLine());

            Console.Write("Ihre Adresse: ");
            adresse = Console.ReadLine();

            Console.WriteLine("");
            Console.WriteLine("Ihre Eingaben:");
            Console.WriteLine(" ");
            Console.WriteLine("Anzahl Schritte: " + schritte);
            Console.WriteLine("Ihr Kontostand: " + kontostand);
            Console.WriteLine("Position der X-Achse: " + xAchse);
            Console.WriteLine("Ihre Adresse: " + adresse);
            Console.ReadLine();
        }
    }
}
