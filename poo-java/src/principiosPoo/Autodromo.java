package principiosPoo;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("897458");
		jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("445252");
		z400.ligar();
		
		Veiculo corringa = jeep;
		
		corringa.ligar();
	}
}
