using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HouseSystem
{
    class Casa : IContabil, IDivulga
    {
        private string endereco;
        private string proprietario;
        private float valor;

        Cozinha cozinha;
        List<Banheiro> banheiros;
        Sala sala;
        List<Quarto> quartos;

        public Casa(
            string endereco,
            string proprietario,
            float valor,
            Cozinha cozinha,
            List<Banheiro> banheiros,
            Sala sala,
            List<Quarto> quartos)
        {
            this.endereco = endereco;
            this.proprietario = proprietario;
            this.valor = valor;
            this.cozinha = cozinha;
            this.banheiros = banheiros;
            this.sala = sala;
            this.quartos = quartos;
        }

        public float calculaIPTU()
        {
            return (this.valor * 0.01f) + 300.00f;
        }

        public void mostraInfos()
        {
            Console.WriteLine("Informações da casa: ");
            Console.WriteLine("Endereço: {0}", this.endereco);
            Console.WriteLine("Proprietário: {0}", this.proprietario);
            Console.WriteLine("Valor: {0:C2}", this.valor);
            Console.WriteLine("Cozinha: {0}", this.cozinha.ToString());
            int contador = 1;
            foreach (Banheiro banheiro in this.banheiros)
            {
                Console.WriteLine("Banheiro({0}): {1}", contador, banheiro.ToString());
                contador++;
            }
            Console.WriteLine("Sala: {0}", this.sala.ToString());
            contador = 1;
            foreach (Quarto quarto in this.quartos)
            {
                Console.WriteLine("Quarto({0}): {1}", contador, quarto.ToString());
                contador++;
            }
            Console.WriteLine("Valor do IPTU: {0:C2}", this.calculaIPTU());
        }
    }
}
