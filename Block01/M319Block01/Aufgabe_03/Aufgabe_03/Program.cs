using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Aufgabe_03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double geschwindigkeit = 0;
            double distanz = 0;
            double verbrauch = 0;

            Console.Write("Geschwindigkeit in Km/h: ");
            geschwindigkeit = Convert.ToDouble(Console.ReadLine());

            Console.Write("Distanz in Km: ");
            distanz = Convert.ToDouble(Console.ReadLine());

            Console.Write("Verbrauch in Liter pro 100Km: ");
            verbrauch = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Die Fahrzeit beträgt " + distanz / geschwindigkeit * 60 + " Minuten");
            Console.WriteLine("");
            Console.WriteLine("Verbrauch in Liter: " + (distanz / 100) * verbrauch);
            Console.ReadLine();
        }
    }
}
