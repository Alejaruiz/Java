import java.util.Scanner;

public class ContarPrimos {

    public static void main (String[] args) {

        Scanner lectura = new Scanner(System.in);

        System.out.println("¿Cuántos números primos deseas ver? ");

        int cantidad = lectura.nextInt();

        int contador = 0;

        int numero = 2;

        while (contador < cantidad){
            for (int i = 2; i < numero; i++) {
                if( numero % i == 0){

                    break;
                }
                if (i == numero -1) {
                    contador ++;

                    System.out.println(numero + " ");
                }
            }
            if (numero == 2) {
                contador ++;
                
                System.out.println(numero + " " );

            }
            numero++;
            //System.out.println(contador);
            
        }

        lectura.close();
    }

}