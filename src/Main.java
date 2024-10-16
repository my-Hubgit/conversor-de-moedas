import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu =new Menu(); //conecta o menu
        menu.exibirMenu(); // exibi o menu
        buscaApi api = new buscaApi(); //faz a busca na API
        Scanner scanner = new Scanner(System.in); //captura o que foi digitado pelo usuário
    }
}
