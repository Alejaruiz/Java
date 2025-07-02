import java.util.Scanner;

public class CountPrime {
    public static int askNumber() {
        Scanner readKeyb = new Scanner(System.in);        
        System.out.print("\rQué cantidad de primos deseas?: ");
        int resp = readKeyb.nextInt();
        // readKeyb.close();
        return resp;
    }

    public static boolean esPrimo(int usrNum) {
        float reminder = -1;
        boolean resp = false;

        for (int i = 2; i < usrNum; i++){
            reminder = usrNum % i;
            if (reminder == 0) {                
                // System.out.println(usrNum + " NO es primo");
                resp = false;
                break;
            }
        }
        if (reminder != 0 ){
            // System.out.println(usrNum + " es PRIMO");
            resp = true;
        }

        return resp;
    }
    public static void main(String[] args) {
    Scanner keybRead = new Scanner(System.in);
    int usrNumber = 0;
    int counter = 0, number = 2;
    usrNumber = askNumber();
    do {
        if (esPrimo(number)) { 
            counter += 1;
            System.out.print(number+", ");
        }        
        number ++;
    } while(counter < usrNumber);
    keybRead.close();
    }
}
