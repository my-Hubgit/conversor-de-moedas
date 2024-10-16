<img src="https://sicredipioneira.com.br/images/blog/post/esta-com-viagem-internacional-marcada-veja-como-e-facil-adquirir-o-papelmoeda-na-sua-agencia-sicredi-pioneira.png" alt="Converso de Moedas - By Claudemir Sewald">

# Conversor de Moedas

## Descrição
Este projeto é uma aplicação de conversão de moedas que permite ao usuário calcular a taxa de câmbio entre diferentes moedas em tempo real, utilizando dados fornecidos pela API ExchangeRate-API. A aplicação permite a conversão entre diversas moedas como Real, Dólar, Euro, Libra Esterlina e Iene Japonês.

O usuário pode selecionar a conversão desejada no menu interativo e receber a taxa de câmbio atual, além do valor convertido com base na entrada fornecida.

## Funcionalidades
Conversão de moedas entre várias opções disponíveis.
Busca de taxas de câmbio em tempo real através de uma API.
Interface interativa no console para facilitar a navegação.
Exibe o valor convertido com base no valor e na taxa de câmbio selecionada.

## Pré-requisitos
Antes de executar a aplicação, certifique-se de que seu ambiente possui as seguintes ferramentas instaladas:

**Java 8 ou superior**
Biblioteca Gson (necessária para o parsing do JSON)
Conexão com a internet para fazer requisições à API
Instalação
Clonar o repositório:

bash
**Copiar código**
git clone [https://github.com/ClaudemirSewald/conversor-de-moedas.git](https://github.com/my-Hubgit/conversor-de-moedas.git)
Instalar as dependências:

Você precisa baixar e adicionar a biblioteca Gson ao seu projeto. Caso esteja usando uma IDE como IntelliJ ou Eclipse, siga os passos para adicionar a dependência:

Para IntelliJ: Vá em File > Project Structure > Modules > Dependencies > + > JARs or directories e selecione o arquivo Gson JAR.
Para Eclipse: Clique com o botão direito no projeto, vá em Build Path > Configure Build Path > Libraries > Add External JARs e adicione o arquivo Gson.
Obter a chave da API:

Para que a aplicação funcione corretamente, você precisa de uma chave de API da ExchangeRate-API. Siga os passos:

Crie uma conta no site da API e obtenha sua chave de API.
Substitua a chave no código buscaApi.java pela sua chave pessoal:
java
Copiar código
String url = "https://v6.exchangerate-api.com/v6/SUA_CHAVE_API/latest/" + moedaBase;
Compilar e executar a aplicação:

No diretório raiz do projeto, compile e execute o código:

bash
Copiar código
### Main.java
java Main
Uso da Aplicação
Ao iniciar a aplicação, o menu interativo será exibido no console.
Selecione a conversão desejada digitando o número correspondente à opção no menu:
1: Real para Dólar
2: Dólar para Real
3: Dólar para Euro
4: Euro para Dólar
5: Euro para Real
6: Real para Euro
7: Libra Esterlina para Dólar
8: Dólar para Libra Esterlina
9: Dólar para Iene Japonês
10: Sair
Após escolher a conversão, digite o valor a ser convertido.
A aplicação retornará a taxa de câmbio atual entre as duas moedas e o valor convertido.
Após a conversão, um submenu será exibido perguntando se deseja realizar uma nova conversão ou sair.
Estrutura do Projeto
Abaixo está uma descrição da estrutura de arquivos:

### Main.java:
 O ponto de entrada da aplicação. Inicia o menu e conecta com a classe buscaApi.
### buscaApi.java: 
 Realiza a requisição HTTP para a API de câmbio e retorna as taxas de câmbio em tempo real.
### Dados.java: 
 Representa a estrutura dos dados recebidos da API, utilizando o Gson para mapear os dados JSON.
### Menu.java:
 Exibe o menu de opções, captura a escolha do usuário, processa a conversão e faz chamadas à API.
**Exemplo de Execução**
Aqui está um exemplo de como a aplicação funciona no terminal:


Copiar código
========= MENU =========
1. Real para Dólar
2. Dólar para Real
3. Dólar para Euro
4. Euro para Dólar
5. Euro para Real
6. Real para Euro
7. Libra Esterlina para Dólar
8. Dólar para Libra Esterlina
9. Dólar para Iene Japonês
10. Sair

**Escolha uma opção:**  1 
'''Real para Dólar.
Digite o valor a ser convertido: 100
A taxa de câmbio entre BRL e USD é $0.19
O valor convertido para USD é: $19.00'''
Melhorias Futuras
Algumas ideias para melhorar o projeto incluem:

Adicionar suporte para mais moedas.
Implementar tratamento de erros mais robusto, como manipulação de falhas na requisição HTTP.
Interface gráfica para tornar a interação mais intuitiva.
Licença
Este projeto é de uso livre para fins educacionais. Sinta-se à vontade para modificá-lo e adaptá-lo conforme suas necessidades.
