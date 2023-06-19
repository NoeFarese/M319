using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Einstieg
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string vorname = "";
            Console.WriteLine("Wie ist dein Name? ");
            vorname= Console.ReadLine();

            Console.WriteLine("Hallo " + vorname);

            Console.ReadLine();
        }
    }
}
