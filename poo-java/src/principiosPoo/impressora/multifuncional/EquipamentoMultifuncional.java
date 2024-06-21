package principiosPoo.impressora.multifuncional;

import principiosPoo.impressora.equipamentos.copiadora.Copiadora;
import principiosPoo.impressora.equipamentos.digitalizadora.Digitalizadora;
import principiosPoo.impressora.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
	@Override
	public void copiar() {
		System.out.println("Copiando via equipamento multifuncional");
		
	}
	@Override
	public void digitalizar() {
		System.out.println("Digitalizando via equipamento multifuncional");
		
	}
	@Override
	public void imprimir() {
		System.out.println("Imprimindo via equipamento multifuncional");
		
	}
}
