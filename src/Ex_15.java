import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ex_15 {
//    Exercicio 15: Crie uma lista de strings e transforme em Set usando collect().
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Caixa de Som JBL", 249.90, "Eletronicos"),
                new Produto("Shampoo", 49.90, "Cosmetico"),
                new Produto("Blusa", 869.90, "Vestuario"),
                new Produto("Vestido", 29.99, "Vestuario"),
                new Produto("Teclado Mecanico", 199.90, "Eletronicos")
        );

        Optional<Produto> maisCaro = produtos.stream().max(Comparator.comparingDouble(Produto::getPreco));

        if (maisCaro.isPresent()){
            System.out.println(maisCaro.get().getNome());
        }

    }
}
