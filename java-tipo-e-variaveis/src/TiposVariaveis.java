public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Regras de declaração de variáveis
        // <tipo> <nomeVariavel> = <atribuição de valor>;

        // Tipos primitivos do Tipo inteiro
        byte numeroByte = 127; // Memória: 1 byte | Valor Mínimo: -128 | Valor Maximo: 127
        System.out.println("byte: "+numeroByte);
        short numeroShort = 32767;// Memória: 2 bytes | Valor Mínimo: -32.768 | Valor Maximo: 32.767
        System.out.println("Short: "+numeroShort);
        int numeroInt = 2147483647;// Memória: 4 bytes | Valor Mínimo: -2.147.483.648 | Valor Maximo: 2.147.483.647
        System.out.println("Int: "+numeroInt);
        long numeroLong = 9223372036854775807L;// Memória: 8 bytes | Valor Mínimo: -9.223.372.036.854.775.808 | Valor Maximo: 9.223.372.036.854.775.807
        System.out.println("Long: "+numeroLong);

        // Tipos primitivos do Tipo decimal (Com ponto Flutuante)
        float numeroFloat = 1.5F; // Memória: 4 bytes | Valor Mínimo: -3,4028E + 38 | Valor Maximo: 3,4028E + 38 | Precisão: 6 - 7 dígitos
        System.out.println("Float: "+numeroFloat);
        double numeroDouble = 1.5;// Memória: 8 bytes | Valor Mínimo: -1,7976E + 308 | Valor Maximo: 1,7976E + 308 | Precisãi: 15 dígitos
        System.out.println("Double: "+numeroDouble);
        
        // Tipos primitivos do Tipo lógico (true ou false)
        boolean verdadeiro = true;
        System.out.println("Boolean: "+verdadeiro);

        // Tipos primitivos do Tipo Literais (Apenas um caracter)
        char caracter = 'c';
        System.out.println("Char: "+caracter);

        // Variável e constantes
        final double PI = 3.14;
        System.out.println("Variável constante: "+PI);
    }
}
