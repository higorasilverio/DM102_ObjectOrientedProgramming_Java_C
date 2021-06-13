using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PCMania
{
    class Cliente
    {
        public string nome;
        public long cpf;

        public List<Computador> computadores = new List<Computador>();

        public Cliente(string nome, long cpf)
        {
            this.nome = nome;
            this.cpf = cpf;
        }

        public float calculaTotalCompra()
        {
            float total = 0f;
            foreach (Computador computador in computadores)
                total += computador.preco;
            return total;
        }
    }
}
