/*  5) Escreva um programa que inverta os caracteres de um string.

 * IMPORTANTE:
 * a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
 * b) Evite usar funções prontas, como, por exemplo, reverse; */
public class ex5 {
    public static void main(String[] args) {
        String string = "ABACAXI";
        String nova_string = "";

        //indice da ultima palavra da string = string.length() - 1 - i, no caso i = 0, string = "ABACAXI": indice = 7 - 1 - 0 => string[6]
        for (int i = 0; i < string.length(); i++){
            int indice = string.length() - 1 - i;
            nova_string += string.charAt(indice);
        }

        System.out.println(nova_string);
    }
}
