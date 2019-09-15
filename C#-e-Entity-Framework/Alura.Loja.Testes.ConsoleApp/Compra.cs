﻿namespace Alura.Loja.Testes.ConsoleApp
{
    public class Compra
    {
        public int Id { get; set; }
        public int Quantidade { get; internal set; }
        public int ProdutoId { get; set; }
        public Produto Produto { get; internal set; }
        public double Preco { get; internal set; }

        public override string ToString()
        {
            return $"Compra de {this.Quantidade} {this.Produto.Unidade} do produto {this.Produto.Nome} a R$ {this.Preco}";
        }
    }
}