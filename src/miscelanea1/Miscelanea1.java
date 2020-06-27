package miscelanea1;

import java.util.Scanner;

public class Miscelanea1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número (n), mayor que cuatro");
        // se lee el número que va a ser el limite superior del conjunto de multiplos de 4
        int numero = scanner.nextInt();
        int multiplo = 0;
        int i = 2;
        boolean seguir = true;
        // se verifica que el valor ingresado sea mayor que 4, si es menor o igual no se realiza ningun calculo
        if(numero <= 4){
            System.out.println("El número debe ser mayor que 4, intentelo de nuevo");
        }else if (numero <9){//si el número es menor que 9, no se realiza ningun calculo, ya que no se 
            // toman los limites 4 y n como multiplos de 4
            System.out.println("No hay ningun multiplo de 4 entre 4 y "+numero);
        }else{
            System.out.println("Multiplos de 4 entre 4 y "+numero);
            //se emplea el ciclo while para generar los multiplos de 4
            while(seguir){
                multiplo = i * 4;
                i++;
                //si el multiplo generado es mayor o igual que el número ingresado, se sale del ciclo while
                //y no se generan más multiplos
                if(multiplo >= numero){
                    seguir = false;
                }else{
                    System.out.println(multiplo);
                }
            }
        }
    }
    
}
