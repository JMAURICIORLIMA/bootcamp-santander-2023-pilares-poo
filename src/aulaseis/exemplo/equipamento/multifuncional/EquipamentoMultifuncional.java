package aulaseis.exemplo.equipamento.multifuncional;

import aulaseis.exemplo.equipamento.copiadora.Copiadora;
import aulaseis.exemplo.equipamento.digitalizadora.Digitalizadora;
import aulaseis.exemplo.equipamento.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA MULTIFUNCIONAL");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA MULTIFUNCIONAL");
    }
}
