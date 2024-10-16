import java.util.Scanner;
// A classe Menu herda da classe Main, e gerencia o menu de conversão de moedas
public class Menu extends Main {

    // Criar um metodo para exibir o menu
    public void exibirMenu() {
        buscaApi api = new buscaApi(); // Busca na API
        Scanner scanner = new Scanner(System.in); // Captura a resposta digitada do usuário
        int opcao = 0;

        //-----------MENU-------------------------
        while (opcao != 10) {  // Menu ficará ativo até o usuário escolher a opção de sair (10)
            System.out.println("========= MENU =========");
            System.out.println("1. Real para Dólar");
            System.out.println("2. Dólar para Real");
            System.out.println("3. Dólar para Euro");
            System.out.println("4. Euro para Dólar");
            System.out.println("5. Euro para Real");
            System.out.println("6. Real para Euro");
            System.out.println("7. Libra Esterlina para Dólar");
            System.out.println("8. Dólar para Libra Esterlina");
            System.out.println("9. Dólar para Iene Japonês");
            System.out.println("10. Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt(); // captura a opção do usuário

            if (opcao == 10) {
                System.out.println("Saindo...");
                break;
            }
            // Metodo que processa a conversão de acordo com a opção escolhida
            processarConversao(opcao, api, scanner);

                                                        // SubMenu
            int opcaoSubmenu = exibirSubmenu(scanner); // Após a conversão, exibe o submenu

            if (opcaoSubmenu == 0) {
                System.out.println("Saindo...");
                break;
            }
        }
        scanner.close();
    }

    // Metodo para processar a conversão de moeda
    private void processarConversao(int opcao, buscaApi api, Scanner scanner) {
        String moedaBase = "";
        String moedaDestino = "";
        switch (opcao) {
            case 1:
                System.out.println("⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜");
                System.out.println("Real para Dólar.");
                moedaBase = "BRL";
                moedaDestino = "USD";
                break;
            case 2:
                System.out.println("⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜");
                System.out.println("Dólar para Real.");
                moedaBase = "USD";
                moedaDestino = "BRL";
                break;
            case 3:
                System.out.println("⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜");
                System.out.println("Dólar para Euro.");
                moedaBase = "USD";
                moedaDestino = "EUR";
                break;
            case 4:
                System.out.println("⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜");
                System.out.println("Euro para Dólar.");
                moedaBase = "EUR";
                moedaDestino = "USD";
                break;
            case 5:
                System.out.println("⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜");
                System.out.println("Euro para Real.");
                moedaBase = "EUR";
                moedaDestino = "BRL";
                break;
            case 6:
                System.out.println("⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜");
                System.out.println("Real para Euro.");
                moedaBase = "BRL";
                moedaDestino = "EUR";
                break;
            case 7:
                System.out.println("⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜");
                System.out.println("Libra Esterlina para Dólar.");
                moedaBase = "GBP";
                moedaDestino = "USD";
                break;
            case 8:
                System.out.println("⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜");
                System.out.println("Dólar para Libra Esterlina.");
                moedaBase = "USD";
                moedaDestino = "GBP";
                break;
            case 9:
                System.out.println("⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜");
                System.out.println("Dólar para Iene Japonês.");
                moedaBase = "USD";
                moedaDestino = "JPY";
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }
        Dados dados = api.buscaMoeda(moedaBase); // Chama a API para buscar a taxa de câmbio para a moeda base
        System.out.println("Digite o valor a ser convertido:");
        double valor = scanner.nextDouble();
        double taxa = dados.conversion_rates().get(moedaDestino); // Busca a taxa de conversão da moeda destino


        System.out.printf("A taxa de câmbio entre %s e %s é $%.2f\n", moedaBase, moedaDestino, taxa);
        // Calcula e exibe o valor convertido para a moeda destino
        System.out.printf("O valor convertido para %s é: $%.2f\n", moedaDestino, (taxa * valor));
        System.out.println();
        System.out.println("⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜");
    }

    // Metodo para exibir o submenu após a conversão
    private int exibirSubmenu(Scanner scanner) {
        System.out.println();
        System.out.println("======== Escolha uma opção ========");
        System.out.println("\n1. Digite 1 para uma nova conversão.");
        System.out.println("0. Sair.");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt(); // Retorna a opção escolhida
    }
}

