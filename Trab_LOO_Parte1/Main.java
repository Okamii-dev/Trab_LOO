package Trab_LOO_Parte1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;

        PilhaPaginas pg = new PilhaPaginas();

        do {
            System.out.print("1. Acessar nova pagina\n" // :D
                    + "2. Voltar para página anterior\n"
                    + "3. Ver página atual\n"
                    + "4. Exibir historico de navegação\n"
                    + "5. Sair\n"
                    + "Digite a opção: ");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite a URL da página: ");
                    String url = scan.next();

                    System.out.print("Digite o título da página: ");
                    String titulo = scan.next();

                    pg.push(new Pagina(url, titulo));

                    break;

                case 2:
                    Pagina remoPagina = pg.pop();
                    if (remoPagina != null) {
                        System.out.println("Voltande de: " + remoPagina);
                    } else {
                        System.out.println("Nenhuma página para voltar");
                    }
                    break;

                case 3:
                    Pagina pgAtual = pg.peek();
                    if (pgAtual != null) {
                        System.out.println("Título da página atual: " + pgAtual.getTitulo()
                                + "\nURL: " + pgAtual.getUrl());
                    }
                    break;

                case 4:
                    System.out.println(pg.mostrarHistorico());

                    break;

                case 5:
                    System.out.println("Fim do progama! :D");

                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }
        } while (opcao != 5);

        scan.close();
    }

}
