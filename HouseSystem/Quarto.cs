using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HouseSystem
{
    class Quarto : Comodo
    {
        private bool temArmarioEmbutido;
        private bool temSuite;

        public Quarto(
            bool temArmarioEmbutido, 
            bool temSuite, 
            float largura, 
            float comprimento)
        {
            this.temArmarioEmbutido = temArmarioEmbutido;
            this.temSuite = temSuite;
            base.comprimento = comprimento;
            base.largura = largura;
        }

        public override string ToString()
        {
            string stringDeRetorno = "Dimensões: " + base.largura.ToString("N2") +
                " x " + base.comprimento.ToString("N2");
            if (this.temArmarioEmbutido)
                stringDeRetorno += ". Possui armário embutido e ";
            else
                stringDeRetorno += ". Não possui armário embutido e ";
            if (this.temSuite)
                stringDeRetorno += "possui suíte";
            else
                stringDeRetorno += "não possui suíte";
            return stringDeRetorno;
        }
    }
}
