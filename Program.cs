using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EX_1
{
    class Program
    {
        static void PrimeiroNome(ref string nome)
        {
            if (nome.IndexOf(" ") != -1)
            {
                nome = nome.Substring(0, nome.IndexOf(" "));
            }
            else
                return;
        }
        static void Main(string[] args)
        {
            /*1.	Primeiro Nome
           Faça um programa que tenha um método que receba um nome completo ou não.
           Retorne então apenas o primeiro nome.
           No programa principal vc deverá solicitar o nome de 2 pessoas e executar este método. */

            string nome;

            Console.WriteLine("Digite um nome : ");
            nome = Console.ReadLine();

            PrimeiroNome(ref nome);

            Console.WriteLine($"O primeiro nome é {nome}");

            Console.ReadLine();
        }
    }
}
