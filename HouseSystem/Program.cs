using System;
using System.Collections.Generic;

namespace HouseSystem
{
    class Program
    {
        static void Main(string[] args)
        {
            Cozinha cozinha = new(true, 4, 15.00f, 12.00f);

            Banheiro banheiro1 = new(true, true, true, 5.00f, 7.00f);
            Banheiro banheiro2 = new(true, false, true, 5.00f, 4.00f);
            List<Banheiro> banheiros = new();
            banheiros.Add(banheiro1);
            banheiros.Add(banheiro2);

            Sala sala = new(true, 17.00f, 15.00f);

            Quarto quarto1 = new(true, true, 10.00f, 7.00f);
            Quarto quarto2 = new(false, false, 8.00f, 5.00f);
            Quarto quarto3 = new(false, false, 8.00f, 5.00f);
            List<Quarto> quartos = new();
            quartos.Add(quarto1);
            quartos.Add(quarto2);
            quartos.Add(quarto3);

            Casa casa = new("Rua dos Bobos, Nº 0, Santa Rita do Sapucaí/MG - 37540-000",
                "Sr. João das Neves", 565000.00f, cozinha, banheiros, sala, quartos);

            casa.mostraInfos();
        }
    }
}
