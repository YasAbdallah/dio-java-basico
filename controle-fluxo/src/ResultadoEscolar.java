public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 3;

        if (nota >= 7) {
            System.out.println("\nAprovado! Laço 1");
        }else if (nota >= 5 && nota < 7) {
            System.out.println("\nRecuperação! Laço 1");
        }else{
            System.out.println("\nReprovado. Laço 1");
        }

        //Ternário simples
        String resultado = nota >= 7 ? "Aprvado! Laço ternário simples." : "Reprovado Laço ternário simples.";
        System.out.println(resultado);
        //Tenário composto
        String resultado2 = nota >= 7 ? "Aprovado! Laço ternário Composto." : nota >= 5 && nota < 7 ? "Recuperação! Laço ternário Composto" : "Reprovado! Laço ternário Composto";
        System.out.println(resultado2);
    }
}
