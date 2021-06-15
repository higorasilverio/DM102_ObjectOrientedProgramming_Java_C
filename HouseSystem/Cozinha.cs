using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HouseSystem
{
    class Cozinha : Comodo
    {
        private bool temGeladeira;
        private int numArmarios;

        public Cozinha(bool temGeladeira, int numArmarios, float largura, float comprimento)
        {
            this.temGeladeira = temGeladeira;
            this.numArmarios = numArmarios;
            base.comprimento = comprimento;
            base.largura = largura;
        }

        public override string ToString()
        {
            if (this.temGeladeira)
                return "Dimensões: " + base.largura.ToString("N2") + " x " + 
                    base.comprimento.ToString("N2") + ". Tem geladeira e " + 
                    this.numArmarios + " armário(s)";
            else
                return "Dimensões: " + this.largura.ToString("N2") + " x " + 
                    this.comprimento.ToString("N2") + ". Não possui geladeira e " + 
                    this.numArmarios + " armário(s)";
        }
    }
}
