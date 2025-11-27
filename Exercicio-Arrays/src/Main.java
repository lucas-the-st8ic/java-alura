import classes.JavaAlura.Pessoas;

void main(String[] args) {
    Pessoas pessoaIndice0 = new Pessoas();
    pessoaIndice0.setNome("Lucas");
    pessoaIndice0.setIdade(27);

    Pessoas pessoaIndice1 = new Pessoas();
    pessoaIndice1.setNome("Jhonatan");
    pessoaIndice1.setIdade(18);

    Pessoas pessoaIndice2 = new Pessoas();
    pessoaIndice2.setNome("Juan");
    pessoaIndice2.setIdade(23);

    Pessoas pessoaIndice3 = new Pessoas();
    pessoaIndice3.setNome("Maria");
    pessoaIndice3.setIdade(21);

    ArrayList<Pessoas> listaDePessoas = new ArrayList<>();

    listaDePessoas.add(pessoaIndice0);
    listaDePessoas.add(pessoaIndice1);
    listaDePessoas.add(pessoaIndice2);
    listaDePessoas.add(pessoaIndice3);

    System.out.println(listaDePessoas.get(0).toString());
    System.out.println("Quantidade de pessoas na lista: " +listaDePessoas.size());
    System.out.println(listaDePessoas);
}
