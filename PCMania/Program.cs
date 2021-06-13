using System;
using System.Collections.Generic;

namespace PCMania
{
    class Program
    {
        static void Main(string[] args)
        {
            Cliente cliente = new("João", 12346579890);

            SistemaOperacional sistema1 = new("Linux Ubuntu", 32);
            SistemaOperacional sistema2 = new("Linux Ubuntu", 64);

            HardwareBasico hardware1 = new("Processador Core i3", 1200f);
            HardwareBasico hardware2 = new("Processador Core i5", 3400f);
            HardwareBasico hardware3 = new("Memória RAM", 8f);
            HardwareBasico hardware4 = new("Memória RAM", 16f);

            MemoriaUSB memoria = new("SSD Externo", 2);

            List<HardwareBasico> list1 = new();
            list1.Add(hardware1);
            list1.Add(hardware3);
            List<HardwareBasico> list2 = new();
            list2.Add(hardware2);
            list2.Add(hardware4);

            Computador pc1 = new("Dell", 5375f, sistema1, list1)
            {
                memoriaUSB = memoria
            };
            Computador pc2 = new("Dell", 3200f, sistema2, list2);

            List<Computador> listaComputadores = new();
            listaComputadores.Add(pc1);
            listaComputadores.Add(pc2);

            cliente.computadores.AddRange(listaComputadores);

            Console.WriteLine(
                "O preço da compra do cliente {0} ficou em R${1:0.00}.",
                cliente.nome,
                cliente.calculaTotalCompra());

            ;
        }
    }
}
