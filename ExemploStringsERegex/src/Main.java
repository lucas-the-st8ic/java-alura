public class Main {
    static void main(String[] args) {
        String aluno = "Lucas Silva";

        String curso = "Java e Programação Orientada a Objetos";
        String curriculo = """
                    Assistente Administrativo
                    Cursando análise e desenvolvimento de sistemas
                    na anhembi morumbi
                    """;

        String texto = String.format("Curso: %s %nAluno: %s ", curso, aluno);

        System.out.println(texto);
        System.out.println("=================");
        System.out.printf("Nome: %s %nCurso: %s \n", aluno, curso);

        System.out.println(curriculo);

    }
}
