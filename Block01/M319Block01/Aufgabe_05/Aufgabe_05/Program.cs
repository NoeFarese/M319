using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Aufgabe_05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double gewicht = 0;
            double groesse = 0;

            Console.Write("Körpergewicht in kg: ");
            gewicht = Convert.ToDouble(Console.ReadLine());

            Console.Write("Körpergrösse in m: ");
            groesse = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Ihr Bodymassindex (BMI) ist: " + gewicht / (groesse * groesse));

            Console.Write("Drücken sie eine beliebige Taste zum verlassen des Programmes");
            Console.ReadKey(true);
        }
    }
}
