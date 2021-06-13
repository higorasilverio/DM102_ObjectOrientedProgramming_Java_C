using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PCMania
{
    class Computador
    {
        public string marca;
        public float preco;

        public MemoriaUSB memoriaUSB;

        public SistemaOperacional sistemaOperacional;
        public List<HardwareBasico> hardwareBasico = new List<HardwareBasico>();

        public Computador(
            string marca, 
            float preco, 
            SistemaOperacional sistema, 
            List<HardwareBasico> lista)
        {
            this.marca = marca;
            this.preco = preco;
            this.sistemaOperacional = sistema;
            this.hardwareBasico.AddRange(lista);
        }
    }
}
