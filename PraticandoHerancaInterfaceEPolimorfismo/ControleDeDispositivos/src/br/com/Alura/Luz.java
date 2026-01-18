package br.com.Alura;

public class Luz implements Interruptor {

    boolean ligado = false;

    @Override
    public void ligar() {
        if (!ligado) {
            System.out.println("Luz ligada.");
            ligado = true;
        } else {
            System.out.println("A Luz já está ligada");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            System.out.println("Luz desligada");
            ligado = false;
        } else {
            System.out.println("A luz já está desligada");
        }
    }
}
