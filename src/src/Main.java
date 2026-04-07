import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        boolean continuarMenu = true;
        Scanner sc = new Scanner(System.in);
        Gerenciador info = new Gerenciador();

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
                    info.cadastrar();
                    break;
                case 2:
                    info.listar();
                    break;
                case 3:
                    info.atualizar();
                    break;
                case 4:
                    info.deletar();
                    break;
                case 5:
                    continuarMenu = false;
                    break;
            }
        }while (continuarMenu);



    }
}