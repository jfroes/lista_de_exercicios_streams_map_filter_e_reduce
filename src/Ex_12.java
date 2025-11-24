import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Ex_12 {
//    Exercicio 12: Crie uma lista de palavras e conte quantas começam com vogal
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Ingresso", "Faca", "Cutelo", "Arame",  "Martelo", "Escada" ,"Serra", "Estojo", "Vaso", "Cadeira");

        long qtdPalavrasVogais = palavras.stream().filter(p -> "aeiouAEIOU".contains(p.substring(0, 1))).count();

        System.out.println(qtdPalavrasVogais);
    }
}
