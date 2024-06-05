public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado =  formatarCep("23123012");
        } catch (CapInvalidoException e) {
            e.printStackTrace();
        }
    }

    static String formatarCep(String cep) throws CapInvalidoException{
        if(cep.length() != 8){
            throw new CapInvalidoException();
        }
        //simulando um cep formatado
        return "23.123-012";
    }
}
