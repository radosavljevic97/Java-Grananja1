//Napisati program koji proverava da li je uneti broj paran. Ukoliko jeste, program treba
// da ispise poruku: Broj je paran! Ukoliko nije, program treba da ispise poruku: Broj je neparan!

package Domaci3011;

import java.util.Scanner;

public class Grananja1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite neki broj ");

        int broj = s.nextInt();

        if(broj % 2 ==0) {
            System.out.print("Broj je paran.");
        }
        else {
            System.out.println("Broj je neparan.");
        }



    }
}

