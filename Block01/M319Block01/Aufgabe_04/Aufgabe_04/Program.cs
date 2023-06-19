using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Aufgabe_04
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double x = 0;

            Console.WriteLine("Geben Sie eine Zahl ein: ");
            x = Convert.ToDouble(Console.ReadLine())/100;

            Console.WriteLine("Der nächste Hunderter von der eingegebenen Zahl ist " + Math.Round(x)*100);
            Console.WriteLine("");

            Console.Write("Drücken sie eine beliebige Taste zum verlassen des Programmes");
            Console.ReadKey(true);

        }
    }
}