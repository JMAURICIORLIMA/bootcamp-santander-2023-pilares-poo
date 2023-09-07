package aulacinco.exemplo;

import aulacinco.exemplo.apps.FacebookMessenger;
import aulacinco.exemplo.apps.MSNMessenger;
import aulacinco.exemplo.apps.ServicoMensagemInstantanea;
import aulacinco.exemplo.apps.Telegram;

public class ComputadorDoPedrinho {

    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "1";

        switch (appEscolhido) {
            case "1":
                smi = new MSNMessenger();
                break;
            case "2":
                smi = new FacebookMessenger();
                break;
            case "3":
                smi = new Telegram();
                break;
            default:
                System.out.println("Erro... encerrando.");
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
