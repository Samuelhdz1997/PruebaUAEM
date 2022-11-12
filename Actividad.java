package pqtPedirDatos;

import java.util.Scanner;

public class PedirDatos {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String cadena=entrada.nextLine();
        int num=entrada.nextInt();
        double d=entrada.nextDouble();
        System.out.println(cadena);
        System.out.println(num);
        System.out.println(d);
    }

}