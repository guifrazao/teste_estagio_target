/*
 * 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
 * • SP – R$67.836,43
 * • RJ – R$36.678,66
 * • MG – R$29.229,88
 * • ES – R$27.165,48
 * • Outros – R$19.849,53

 * Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora. 
 */

import java.text.DecimalFormat;

public class ex4 {
    public static void main(String[] args) {
        double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, outros = 19849.53;
        DecimalFormat formatador = new DecimalFormat("#0.00%");
        double total = sp + rj + mg + es + outros;
        System.out.println("Percentual de representação de São Paulo: " + formatador.format((sp/total)));
        System.out.println("Percentual de representação de Rio de Janeiro: " + formatador.format((rj/total)));
        System.out.println("Percentual de representação de Minas Gerais: " + formatador.format((mg/total)));
        System.out.println("Percentual de representação de Espírito Santo: " + formatador.format((es/total)));
        System.out.println("Percentual de representação de outros estados: " + formatador.format((outros/total)));
        
    }
}
