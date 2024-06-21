package principiosPoo;

public class Carro extends Veiculo{
	
	@Override
	public void ligar() {
		conferirCambio();
		conferirCombustivel();
		System.out.println("Carro ligado");
	}
	private void conferirCombustivel() {
		System.out.println("CONFERINDO COMBUSTIVEL");
	}
	private void conferirCambio() {
		System.out.println("CONFERINDO CAMBIO EM P");
	}
}
