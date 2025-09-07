package Trab_LOO_Parte2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class oi {
    /*
     * (1,0) 2 – Crie uma lista com 20 números inteiros. Crie uma segunda lista,
     * retirando os números iguais e ordenando, em seguida, inverta a ordem dos
     * elementos da segunda metade da segunda lista, como no exemplo abaixo:
     * Lista 1 = 1 6 3 5 4 1 3 8
     * Lista 2 = 1 3 4 8 6 5
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int num = (int) (Math.random() * 100);
            lista1.add(num);
        }
        System.out.println(lista1);

        scan.close();
    }

}
