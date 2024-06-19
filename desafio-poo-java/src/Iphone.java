public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    @Override
    public void tocar() {
        System.out.println("Música tocando.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Testando funcionalidades de ReprodutorMusical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Minha Música Favorita");

        // Testando funcionalidades de AparelhoTelefonico
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando funcionalidades do NavegadorInternet
        iphone.exibirPagina("www.exemplo.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }

}
