package br.com.Alura;

public class ArCondicionado implements Interruptor {

    boolean ligado = false;

    @Override
    public void ligar() {
        if (!ligado) {
            System.out.println("Ar-condicionado ligado.");
            ligado = true;
        } else {
            System.out.println("O ar-condicionado já está ligado");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            System.out.println("Ar-condicionado desligado");
            ligado = false;
        } else {
            System.out.println("O ar-condicionado já está desligado");
        }
    }
}
