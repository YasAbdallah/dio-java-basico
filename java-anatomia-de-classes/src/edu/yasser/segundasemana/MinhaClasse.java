package edu.yasser.segundasemana;
public class MinhaClasse {
    public static void main (String [] args){
        // Estrutura de declaração de variáveis.
        // Tipo nomeBemDefinido = atribuição de valor;
        //Lembre-se sempre do ; no final
        //Exemplos: 
        String meuNome = "Yasser Ibrahim"; // Tipo texto
        int anoFabricação = 2022; // Tipo Numerico
        boolean verdadeira = true; //Tipo booleano true || false

        String primeiroNome = "Yasser";
        String segundoNome = "Ibrahim";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    //Criação de metodos (funções)
    //TipoDeRetorno NomeObjetivoNoInfinitivo Parametro(s) 
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
