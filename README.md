# Java-Exercicio-1

  Perguntei a um amigo que já usou java qual era IDE ele recomendava usar, ele disse NetBeans então é a que experimentei.
  Baixei e instalei o NetBeans e ocorreu tudo normal, exceto que não conseguia criar projetos, então fui em Activate Features e la achei um Java SE, após ativalo consegui criar o projeto.
  Dando início a conversão do código encontrei algumas diferenças pro C#:
  
  1: A primeira letra do tipo da variável a ser declarada tem que ser Maiúscula;
  2: Métodos começam com letra minúscula e não maiúscula;
  3: Não fazia ideia de como pegar dados digitados pelo usuário, procurei e encontrei um tal de Scanner;
  4: Não existe ref no Java igual existe no C#;
  5: Não entrei uma equivalência do $ do C# aplicado em Strings, pro outro lado descobri o %s do java;
  
  
  O código a ser traduzido foi o seguinte: 
  
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
