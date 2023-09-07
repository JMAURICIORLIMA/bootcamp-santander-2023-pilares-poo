package aulaseis.exemplo.equipamento.impressora;

import aulaseis.exemplo.equipamento.impressora.Impressora;

public class Laserjet implements Impressora {
    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA LASERJET");
    }
}
