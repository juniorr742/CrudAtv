import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciador {
    Scanner sc = new Scanner(System.in);

    public void Produto () {
        int quantidade = sc.nextInt();
        String nomeProduto = sc.nextLine();
        double preco = sc.nextDouble();
    }

    ArrayList<String> produtos = new ArrayList<String>();

    public void cadastrar () {

    }

    public void listar () {
        int i = 0;
       for (String p : produtos){
           System.out.printf("Produto de número: %d", i);
           System.out.println(p);
           i++;
       }
    }

    public void atualizar () {
        System.out.print("Em qual posição está o item que deseja substituir?: ");
        int indexSub = sc.nextInt();
        System.out.print("Digite o nome do produto que quer substituir");
        String nomeProduto = sc.nextLine();
        System.out.print("Digite o preço:");
        double preco = sc.nextDouble();
        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();
        ArrayList<String> substituicao = new ArrayList<>();
        produtos.set(indexSub, substituicao.toString());
    }

    public void deletar () {
        System.out.print("Digite o número do produto que quer deletar: ");
        int numProduto = sc.nextInt();
        produtos.remove(numProduto);
    }
}
