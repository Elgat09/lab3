package lab3;

import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner numar= new Scanner(System.in);
        int nr= numar.nextInt();
        System.out.println("Introduceti numar"+nr);

        if(nr%2==0){
            System.out.println("nr este prim");

        }else
            System.out.println("nr nu este prim");
    }
}
