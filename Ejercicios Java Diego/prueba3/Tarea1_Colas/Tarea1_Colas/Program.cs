using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// Creado por Diego Campos Borbón

namespace Tarea1_Colas
{
    internal class Program
    {
        // Método principal
        static void Main(string[] args)
        {
            // Crear una cola
            Queue colas = new Queue();

            // Crear y agregar nodos a la cola
            AgregarNodos(colas);

            // Imprimir el número de nodos en la cola
            Console.WriteLine("Nodos en la cola actual: " + colas.Count);

            // Imprimir personas que se agregaron a la fila
            Console.WriteLine("\nPersonas que se agregaron a la cola:");
            MostrarNodos(colas);

            // Número de nodos a eliminar
            int extraerNodos = 3;

            // Eliminar nodos de la cola
            EliminarNodos(colas, extraerNodos);

            // Imprimir el número de nodos restantes en la cola
            Console.WriteLine("\nNúmero de nodos restantes en la cola: " + colas.Count);
        }

        // Método para agregar nodos a la cola
        static void AgregarNodos(Queue cola)
        {
            cola.Enqueue("Luis");
            cola.Enqueue("Ana");
            cola.Enqueue("Carlos");
            cola.Enqueue("Daniela");
            cola.Enqueue("Mario");
            cola.Enqueue("Karla");
        }

        // Método para eliminar nodos de la cola
        static void EliminarNodos(Queue cola, int cantidad)
        {
            Console.WriteLine("\nPersonas que se eliminaron de la cola:");
            for (int contador = 0; contador < cantidad && cola.Count > 0; contador++)
            {
                string persona = (string)cola.Dequeue();
                Console.WriteLine(persona);
            }
        }

        // Método para mostrar los nodos en la cola
        static void MostrarNodos(Queue cola)
        {
            foreach (var persona in cola)
            {
                Console.WriteLine(persona);
            }
        }
    }
}