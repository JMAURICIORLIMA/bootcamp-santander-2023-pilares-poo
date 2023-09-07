package aulacinco.exemplo.apps;

public class MSNMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem através do MSN Messenger");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem através do MSN Messenger");
    }
}
