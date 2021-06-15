using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HouseSystem
{
    class Banheiro : Comodo
    {
        private bool temEspelho;
        private bool temChuveiro;
        private bool temVasoSanitario;

        public Banheiro(
            bool temEspelho, 
            bool temChuveiro, 
            bool temVasoSanitario, 
            float largura, 
            float comprimento)
        {
            this.temEspelho = temEspelho;
            this.temChuveiro = temChuveiro;
            this.temVasoSanitario = temVasoSanitario;
            base.largura = largura;
            base.comprimento = comprimento;
        }

        public override string ToString()
        {
            string stringDeRetorno = "Dimensões: " + base.largura.ToString("N2") + 
                " x " + base.comprimento.ToString("N2");
            if (this.temEspelho)
                stringDeRetorno += ". Possui espelho, ";
            else
                stringDeRetorno += ". Não possui espelho, ";
            if (this.temChuveiro)
                stringDeRetorno += "possui chuveiro e ";
            else
                stringDeRetorno += "não possui chuveiro e ";
            if (this.temVasoSanitario)
                stringDeRetorno += "possui vaso sanitário";
            else
                stringDeRetorno += "não possui vaso sanitário";
            return stringDeRetorno;
        }
    }
}
