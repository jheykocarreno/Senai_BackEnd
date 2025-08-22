package sistemaNotificacoes;

public class NotificacaoPush implements Notificacao{

    @Override
    public void enviar(String mensagem) {
        System.out.println("Mensagem enviado Push " + mensagem);
    }
}
