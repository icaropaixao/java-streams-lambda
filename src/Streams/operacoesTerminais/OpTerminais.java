package Streams.operacoesTerminais;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class OpTerminais {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 3, 5, 7, 9);

        


        int soma = numeros.stream()
                .filter(number -> number >= 5) // Filtrando os números maiores ou iguais a 5
                .mapToInt(number -> number * 2) // Multiplicando cada elemento por 2
                .reduce(0, Integer::sum); // Combinando os elementos do stream em um único resultado

        System.out.println(soma); // 42
    }
}
