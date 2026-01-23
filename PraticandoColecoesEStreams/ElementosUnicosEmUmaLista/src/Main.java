import java.util.*;

public class Main {
    static void main(String[] args) {
        Set<String> listaDeeventos = new LinkedHashSet<>();
        listaDeeventos.add("IA Conference Brasil");
        listaDeeventos.add("AI Summit");
        listaDeeventos.add("DevFest");
        listaDeeventos.add("Cloud Expo");
        listaDeeventos.add("IA Conference Brasil");
        listaDeeventos.add("AI Summit");
        listaDeeventos.add("DevFest");
        System.out.println(listaDeeventos);

        //==========OU=============

        List<String> eventos = new ArrayList<>();

        eventos.add("IA Conference Brasil");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");

        Set<String> eventosUnicos = new HashSet<>(eventos);

        System.out.println("Lista de eventos: " + eventosUnicos);
    }
}