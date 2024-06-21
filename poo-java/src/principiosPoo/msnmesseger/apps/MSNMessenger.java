package principiosPoo.msnmesseger.apps;

public class MSNMessenger extends ServicoMensagemInstantanea{
	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
		
	}
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
		
	}
	@Override
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando Histórico pelo MSN Messenger.");
		
	}
}
