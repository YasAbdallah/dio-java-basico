package principiosPoo.impressora.estabelecimento;

import principiosPoo.impressora.equipamentos.copiadora.Copiadora;
import principiosPoo.impressora.equipamentos.digitalizadora.Digitalizadora;
import principiosPoo.impressora.equipamentos.impressora.Deskjet;
import principiosPoo.impressora.equipamentos.impressora.Impressora;
import principiosPoo.impressora.equipamentos.impressora.Laserjet;
import principiosPoo.impressora.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		Impressora impressoraD =  new Deskjet();
		Impressora impressoraL =  new Laserjet();
		EquipamentoMultifuncional impressoraM =  new EquipamentoMultifuncional();
		
		Digitalizadora digitalizadora = impressoraM;
		Copiadora copiadora = impressoraM;
		
		impressoraD.imprimir();
		impressoraL.imprimir();
		
		impressoraM.imprimir();
		impressoraM.digitalizar();
		impressoraM.copiar();
	}
}
