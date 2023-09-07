package aulacinco.exemplo.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem através do Facebook Messenger");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem através do Facebook Messenger");
    }
}
