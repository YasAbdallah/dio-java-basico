package principiosPoo.msnmesseger;

import principiosPoo.msnmesseger.apps.FacebookMessenger;
import principiosPoo.msnmesseger.apps.MSNMessenger;
import principiosPoo.msnmesseger.apps.ServicoMensagemInstantanea;
import principiosPoo.msnmesseger.apps.TelegramMessenger;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="???"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new TelegramMessenger();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
