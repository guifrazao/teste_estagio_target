/*
 * 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
 * • O menor valor de faturamento ocorrido em um dia do mês;
 * • O maior valor de faturamento ocorrido em um dia do mês;
 * • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

 * IMPORTANTE:
 * a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
 * b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;
 */

import java.text.DecimalFormat;

public class ex3 {
    //Os dias sem faturamento já estão sendo ignorados pelo fato de seu faturamento ser 0
    public static void main(String[] args) {      
        double[] valores = {
            22174.1664,
            24537.6698,
            26139.6134,
            0.0,
            0.0,
            26742.6612,
            0.0,
            42889.2258,
            46251.174,
            11191.4722,
            0.0,
            0.0,
            3847.4823,
            373.7838,
            2659.7563,
            48924.2448,
            18419.2614,
            0.0,
            0.0,
            35240.1826,
            43829.1667,
            18235.6852,
            4355.0662,
            13327.1025,
            0.0,
            0.0,
            25681.8318,
            1718.1221,
            13220.495,
            8414.61
        };
        double media_mensal = 0.0, menor_valor = 999999.0, maior_valor = 0.0;
        int n_dias_fat_sup = 0;
        DecimalFormat formatador = new DecimalFormat("#0.00");

        for (int i = 0; i < valores.length; i++){         
            media_mensal += valores[i];
        }
        media_mensal /= valores.length;

        //Parece estar pressuposto no exercício que, para o calculo do menor valor de faturamento, é necessário que haja faturamento no dia para que ele seja considerado
        for (int i = 0; i < valores.length; i++){
            if (valores[i] < menor_valor && valores[i] != 0){
                menor_valor = valores[i];
            }
            if (valores[i] > maior_valor){
                maior_valor = valores[i];
            }
            if (valores[i] > media_mensal){
                n_dias_fat_sup += 1;
            }
        }
        System.out.println("Menor valor de faturamento em um dia do mes: R$" + formatador.format(menor_valor) + "\n");
        System.out.println("Maior valor de faturamento em um dia do mes: R$" + formatador.format(maior_valor) + "\n");
        System.out.println("Numero de dias do mes em que o valor de faturamento diario foi superior a media mensal: " + n_dias_fat_sup);
    }
}
