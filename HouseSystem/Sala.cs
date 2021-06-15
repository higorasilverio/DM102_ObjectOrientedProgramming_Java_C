using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HouseSystem
{
    class Sala : Comodo 
    {
        private bool temPainel;

        public Sala(bool temPainel, float comprimento, float largura)
        {
            this.temPainel = temPainel;
            base.comprimento = comprimento;
            base.largura = largura;
        }

        public override string ToString()
        {
            if (this.temPainel)
                return "Dimensões: " + base.largura.ToString("N2") + 
                    " x " + base.comprimento.ToString("N2") + ". Possui painel";
            else
                return "Dimensões: " + base.largura.ToString("N2") +
                    " x " + base.comprimento.ToString("N2") + ". Não possui painel";
        }
    }
}
