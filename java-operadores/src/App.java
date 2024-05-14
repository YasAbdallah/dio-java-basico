public class App {
    public static void main(String[] args) throws Exception {
        //Operador de atribuição =
        String nome = "Yasser";
        System.out.printf("Atribuição String, Nome: %s \n", nome);
        int idade = 27;
        System.out.printf("Atribuição int, Idade: %d \n", idade);

        //Operadores aritméticos
        // + (adição ou concatenação entre variaveis)
        double soma = 10.5 + 15.7;
        // Cuidado !!! Quando usado o sinal de adição em Strings ela sera feito concatenação!
        System.out.printf("Soma: 10.5 + 15.7 = %f \n", soma);
        // - (subtração)
        int subtracao = 113 - 25;
        System.out.printf("Subtração: 113 - 25 = %d \n", subtracao);
        // * (multiplicação)
        int multiplicacao = 20 * 7;
        System.out.printf("Multiplicação: 20 * 7 = %d \n", multiplicacao);
        // /(divisão)
        int divisao = 15 / 3;
        System.out.printf("Divisão: 15 / 3 = %d \n", divisao);
        // % (modulo ou resto da divisão)
        int modulo = 18 % 3;
        System.out.println(modulo);
        //System.out.printf("Módulo: 18 % 3 = %f \n", modulo);
        // () (usado para afirmar a orden de precedencia.) 
        double resultado = (10 * 7) + (20 / 4);
        System.out.printf("Order De Precedencia: (10 * 7) + (20 / 4) = %f", resultado);
        
        int incremento = 1;
        System.out.println(incremento++); // = 2 apos uma repetição
        System.out.println(incremento); // valor após o incremento++
        incremento = 1;
        System.out.println(++incremento);
        
        int decremento = 1;
        System.out.println(decremento--); // = 0 apos uma repetição
        System.out.println(decremento); // valor apos o decremento--
        decremento = 1;
        System.out.println(--decremento);

        //Negação lógica
        boolean falso = false;
        System.out.println(!falso); //"Pode parecer mentira mas isso é verdade...."

        //Operador ternário
        int a, b;
        a = 5;
        b = 6;
        /*
        String resultado2 = ""; 
        if(a==b){
            resultado2 = "Verdade";
        }else{
            resultado2 = "Falso";
        }
        */
        String resultado2 = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultado2);


        //Operadores Relacionais
        /**
         * == IGUAL A;
         * != Diferente;
         * < Menor que;
         * > Maior que;
         * <= Menor ou igual a;
         * >= Maior ou igual a;
        */

        String nomeUm = "Yasser";
        String nomeDois = "Yasser";
        System.out.println(nomeUm.equals(nomeDois));


        //Igual 
        System.out.println(a==b);

        // Diferente
        System.out.println(a!=b);

        // Menor que 
        System.out.println(a<b);

        //Maior que
        System.out.println(a>b);

        //Menor ou igual
        System.out.println(a<=b);

        //Maior ou igual
        System.out.println(a>=b);


        //Expressões Lógicas
        /**
         * && - E lógico;
         * || - OU lógico;
         */

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras.");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das duas condições é verdadeira.");
        }
        
    }
}
