package Trab_LOO_Parte2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_Numeros {
    /*
     * (1,0) 2 – Crie uma lista com 20 números inteiros. Crie uma segunda lista,
     * retirando os números iguais e ordenando, em seguida, inverta a ordem dos
     * elementos da segunda metade da segunda lista, como no exemplo abaixo:
     * Lista 1 = 1 6 3 5 4 1 3 8
     * Lista 2 = 1 3 4 8 6 5
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> lista1 = new ArrayList<>(
                Arrays.asList(5, 12, 3, 7, 5, 9, 1, 12, 8, 3, 15, 7, 20, 2, 9, 4, 6, 11, 2, 14));
        ArrayList<Integer> lista2 = new ArrayList<>();

        System.out.println(lista1);

        for (Integer num : lista1) {
            if (!(lista1.contains(num))) { // se já tiver o número não adiciona na lista 2
                lista2.add(num);
            }
        }

        System.out.println(lista2);

        Collections.sort(lista2); // ordena lista 2

        System.out.println();
        System.out.println(lista2);

        scan.close();
    }

}
