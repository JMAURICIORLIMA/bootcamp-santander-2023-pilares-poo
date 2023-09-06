package aulatres.exemplo;

import auladois.exemplo.MSNMessenger;

public class ComputadorPedrinho {

    public static void main(String[] args) {

        System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("\nFacebook");
        FacebookMessenger facebook = new FacebookMessenger();
        facebook.enviarMensagem();
        facebook.receberMensagem();

        System.out.println("\nTelegram");
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();

    }
}

