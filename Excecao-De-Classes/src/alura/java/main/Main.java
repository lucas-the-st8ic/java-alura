package alura.java.main;

import alura.java.classes.Animais;
import alura.java.classes.Cachorros;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        ArrayList<String> listaDeCompras = new ArrayList<String>();

        listaDeCompras.add("Arroz");
        listaDeCompras.add("Feijão");
        listaDeCompras.add("Carne");
        listaDeCompras.add(0,"Frango");

        for(String item: listaDeCompras){
            System.out.println(item);
        }

        Cachorros novaRaca_01 = new Cachorros();
        Animais novaRaca_001 = (Animais) novaRaca_01;

        Animais animal = new Cachorros();

        if(novaRaca_001 instanceof Cachorros){
            Cachorros novaRaca_002 = (Cachorros)novaRaca_001;
        } else {
            System.out.println("Nova raça não está no sistema");
        }
    }
}
