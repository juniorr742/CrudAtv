import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciador {
    Scanner sc = new Scanner(System.in);




    ArrayList<Produto> produtos = new ArrayList<Produto>();


    public void cadastrar () {
        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Valor do produto: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantia = sc.nextInt();

        Produto prod1 = new Produto(nome, preco, quantia);
        produtos.add(prod1);
    }

    public void listar () {
        int i = 0;
       for (Produto p : produtos){
           System.out.printf("Produto de número: %d", i);
           System.out.println(p);
           i++;
       }

    }

    public void atualizar () {
        System.out.print("Digite o índice do produto: ");
        int indice = sc.nextInt();
        Produto p = produtos.get(indice);

        System.out.print("Digite o nome do produto que quer substituir");
        String nomeProduto = sc.nextLine();
        System.out.print("Digite o preço:");
        double preco = sc.nextDouble();
        System.out.print("Digite a quantidade: ");
        int quantia = sc.nextInt();

        Produto prod2 = new Produto(nomeProduto, preco, quantia);
        produtos.add(prod2);

        produtos.set(indice, prod2);
    }

    public void deletar () {
        System.out.print("Digite o número do produto que quer deletar: ");
        int numProduto = sc.nextInt();
        produtos.remove(numProduto);
    }
}
