using System;
using System.Collections.Generic;
using System.Collections.Specialized;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Quicksort
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n;
            Console.WriteLine("Metodo  de Quick Sort");
            Console.WriteLine("Cuanto es la longitud del vector");
            n = Int32.Parse(Console.ReadLine());
            llenar b = new llenar(n);

        }
    }
    class llenar
    {
        int valor = 0;
        int[] vector;
        public llenar(int n) 
        {
            valor = n;
            vector = new int[valor];
            for (int 1 = 0; 1 < valor; 1++)
            {
                Console.WriteLine("Ingrese valor {0}: ", 1 + 1);
                vector[i] = Int32.Parse(Console.ReadLine());
            }
            Quicksort(vector, 0, valor - 1);
            mostrar();
        }
        private void quicksort(int[] vector, int primero, int ultimo)
        {
            int i, j, central;
            double pivote;
            central = (primero + ultimo) / 2;
            i = primero;
            j = ultimo;
        }
    }
}
