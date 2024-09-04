/*
 * 1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;
 * Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
 * Imprimir(SOMA);
 * Ao final do processamento, qual será o valor da variável SOMA?
 */

class ex1{
    public static void main(String[] args) {
        int i = 13;
        int soma = 0, k = 0;
        while (k < i){
            k += 1;
            soma += k;
        }
        System.out.println(soma);
    }
} 

//o resultado impresso será 91