public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitacao = 17.0;

        if(valorSolicitacao < saldo){
            saldo -= valorSolicitacao;
            System.out.println("Saldo atual: "+saldo);
        }else{
            System.out.println("Saldo Insuficiente.");
        }
    }
}
