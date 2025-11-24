import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ex_20 {
//    Exercicio 20: Crie uma Stream de objetos Aluno e calcule a média das notas.
    public static void main(String[] args) {

        List<Aluno> alunos = Arrays.asList(
                new Aluno("Bob"),
                new Aluno("Rose"),
                new Aluno("Joca"),
                new Aluno("Maria")
                );


       for(int i = 1; i < 6; i++){
           for (Aluno aluno : alunos){
               aluno.addNota(Math.round((1.0 + Math.random() * 9.0) * 100)/100.0);
           }
       }

       alunos.stream().forEach(a -> {
           double media = a.getNotas().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

           System.out.printf("%s Média %.2f \n", a.getName(), media);
       });


    }
}
