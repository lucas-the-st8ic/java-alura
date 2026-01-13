import br.com.Alura.Aluno;
import br.com.Alura.Bolsista;

public class Main {
    static void main(String[] args) {

        Aluno aluno1 = new Aluno("Lucas", "Regular");
        Bolsista aluno2 = new Bolsista("João");

        aluno1.identificar();
        aluno2.identificar();

    }
}
