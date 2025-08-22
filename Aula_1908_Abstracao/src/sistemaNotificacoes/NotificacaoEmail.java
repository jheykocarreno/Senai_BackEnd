package sistemaNotificacoes;

public class NotificacaoEmail implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Mensagem enviado Email " + mensagem);
    }
}
