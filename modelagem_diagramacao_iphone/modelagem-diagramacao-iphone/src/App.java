public class App {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando Reprodutor Musical
        meuIphone.selecionarMusica("Shake it off - Taylor Swift");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando Aparelho Telefônico
        meuIphone.ligar("+55 51 999-999-999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        meuIphone.exibirPagina("https://www.dio.me/");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
