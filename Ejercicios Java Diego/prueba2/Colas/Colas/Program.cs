using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Colas
{
    internal class Colas
    {
        class Nodo 
        {
            public int info;
            public Nodo sig;
        }
        private Nodo raiz, fondo;
        public Colas() 
        {
            raiz = null;
            fondo = null;
        }
        public bool Vacia() 
        {
            if (raiz == null)
            {
                return true;
            }
            else
                return false;
        }
        static void Main(string[] args)
        {
        }
    }
}
