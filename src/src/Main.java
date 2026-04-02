import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        boolean continuarMenu = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Bem vindo ao menu de produtos!!");
            System.out.println("Digite a opção desejada: ");
            System.out.println("[1] - Cadastrar um produto");
            System.out.println("[2] - Listar um produto");
            System.out.println("[3] - Atualizar um produto");
            System.out.println("[4] - Deletar um produto");
            System.out.println("[5] - Sair");

            int opcaoUsuario = sc.nextInt();

            switch (opcaoUsuario){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }while (continuarMenu);



    }
}