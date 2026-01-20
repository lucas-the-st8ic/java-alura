import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static void main(String[] args) {
        String aluno = "Lucas Silva";

        String curso = "Java e Programação Orientada a Objetos";
        String curriculo = """
                    Assistente Administrativo
                    Cursando análise e desenvolvimento de sistemas
                    na anhembi morumbi
                    """;

        String txt= String.format("Curso: %s %nAluno: %s ", curso, aluno);

        System.out.println(txt);
        System.out.println("=================");
        System.out.printf("Nome: %s %nCurso: %s \n", aluno, curso);

        System.out.println(curriculo);

        String texto = "Meu email é lucas@gmail.com";
        Pattern pattern = Pattern.compile("\\w+@\\w+.\\w+");
        Matcher matcher = pattern.matcher(texto);

        if(matcher.find()){
            System.out.println(matcher.group());
        }


        System.out.println(formatartelefone("11957387490"));
    }


    public static String formatartelefone(String telefone) {
        String regex = "(\\d{2})(\\d{4,5})(\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefone);

        if(matcher.matches()){
            return String.format("Telefone: (%s) %s-%s", matcher.group(1), matcher.group(2), matcher.group(3));
        }

        return "Número de telefone inválido!!";
    }
}
