package aulaquatro.exemplo;

public class Telegram extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem através do Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem através do Telegram");
    }
}
