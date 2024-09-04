/*
 * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
 *    escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
 *    
 *    IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
 */

//num = 6
public class ex2 {
    public static String fibonacci(int num){
        int ant = 0, atu = 1, prox = 0;
        while (true){
            if (num < prox){
                return "Não pertence a sequencia";
            }
            if (num == prox){
                return "Pertence a sequencia";
            }

            prox = ant + atu;
            ant = atu;
            atu = prox;
        }
    }
    public static void main(String[] args) {
        String resultado = fibonacci(6);
        System.out.println(resultado);
    }
}
