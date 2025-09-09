package Trab_LOO_Parte2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

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

        /*
         * ArrayList<Integer> lista1 = new ArrayList<>(
         * Arrays.asList(5, 12, 3, 7, 5, 9, 1, 12, 8, 3, 15, 7, 20, 2, 9, 4, 6, 11, 2,
         * 14));
         */

        ArrayList<Integer> lista1 = new ArrayList<>();

        int i = 0;
        while (i < 20) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            Integer num = scan.nextInt();
            lista1.add(num);
            i++;
        }

        System.out.println("Lista 1: " + lista1);

        TreeSet<Integer> conjunto = new TreeSet<>(lista1);
        ArrayList<Integer> lista2 = new ArrayList<>(conjunto);

        System.out.println("Lista 2 " + lista2); // essa dlc ja vem ordenada e sem ta duplicada slc brabissima

        int tamanho = lista2.size();
        int metade = tamanho / 2;
        Collections.reverse(lista2.subList(metade, tamanho));

        System.out.println("Lista 2 depois que o pai aq inverteu a segunda metade: " + lista2);

        scan.close();
    }

}
