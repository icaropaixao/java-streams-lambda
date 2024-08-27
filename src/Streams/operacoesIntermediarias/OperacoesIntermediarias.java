package Streams.operacoesIntermediarias;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OperacoesIntermediarias{

    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Pedro", "Ana", "Marcos");

        // Usando a API Streams para filtrar, transformar, ordenar, limitar e coletar resultados
        List<String> limitedFilteredNames = nomes.stream()
                .filter(name -> name.contains("a")) // Filtrando nomes que possuem a letra 'a'
                .map(String::toUpperCase) // Convertendo para letras maiúsculas
                .sorted() // Ordenando os nomes por ordem alfabética
                .limit(2) // Limitando aos 2 primeiros nomes
                .collect(Collectors.toList()); // Coletando o resultado em uma nova lista

        System.out.println(limitedFilteredNames); // [ANA, MARCOS]
    }
}
