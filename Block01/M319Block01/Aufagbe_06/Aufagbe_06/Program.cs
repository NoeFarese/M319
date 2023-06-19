using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Aufagbe_06
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int stunden = 0;
            ushort minuten = 0;
            byte sekunden = 0;

            Console.Write("Stunden: ");
            stunden = Convert.ToInt32(Console.ReadLine());

            Console.Write("Minuten: ");
            minuten = Convert.ToInt16(Console.ReadLine()); //Wie konventiert man ein ushort?

            Console.Write("Sekunden: ");
            sekunden = Convert.ToByte(Console.ReadLine()); 

            //nicht fertig!!!
        }
    }
}
