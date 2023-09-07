package aulaseis.exemplo.estabelecimento;

import aulaseis.exemplo.equipamento.copiadora.Copiadora;
import aulaseis.exemplo.equipamento.copiadora.Xerox;
import aulaseis.exemplo.equipamento.digitalizadora.Digitalizadora;
import aulaseis.exemplo.equipamento.digitalizadora.Scan;
import aulaseis.exemplo.equipamento.impressora.Deskjet;
import aulaseis.exemplo.equipamento.impressora.Impressora;
import aulaseis.exemplo.equipamento.impressora.Laserjet;
import aulaseis.exemplo.equipamento.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        Impressora impressoraDeskjet = new Deskjet();
        impressoraDeskjet.imprimir();

        Impressora impressoraLaserjet = new Laserjet();
        impressoraLaserjet.imprimir();

        Digitalizadora digitalizadoraScan = new Scan();
        digitalizadoraScan.digitalizar();

        Copiadora copiadoraXerox = new Xerox();
        copiadoraXerox.copiar();

        EquipamentoMultifuncional equipamentoMultifuncional = new EquipamentoMultifuncional();

        Impressora impressora = equipamentoMultifuncional;
        Digitalizadora digitalizadora = equipamentoMultifuncional;
        Copiadora copiadora = equipamentoMultifuncional;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}
