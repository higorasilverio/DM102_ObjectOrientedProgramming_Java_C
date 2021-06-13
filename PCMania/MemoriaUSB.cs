using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PCMania
{
    class MemoriaUSB
    {
        public string nome;
        public int capacidade;

        public MemoriaUSB(string nome, int capacidade)
        {
            this.nome = nome;
            this.capacidade = capacidade;
        }
    }
}
