package cinzodyagi;

import java.util.Scanner;

public class CinZodyagi {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. \n"
                + " Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır. \n"
                + " Yıldızlarla pek bir ilgisi yoktur.");
        
        System.out.print("Lütfen Doğum Yılını Girin : " );
        int yil = scanner.nextInt();
        
        if(yil%12 == 0){
            System.out.println("Çin Zodyağınız : Maymun ");
        }
        else if(yil%12 == 1){
            System.out.println("Çin Zodyağınız : Horoz ");
        }
        else if(yil%12 == 2){
            System.out.println("Çin Zodyağınız : Köpek ");
        }
        else if(yil%12 == 3){
            System.out.println("Çin Zodyağınız : Domuz ");
        }
        else if(yil%12 == 4){
            System.out.println("Çin Zodyağınız : Fare ");
        }
        else if(yil%12 == 5){
            System.out.println("Çin Zodyağınız : Öküz ");
        }
        else if(yil%12 == 6){
            System.out.println("Çin Zodyağınız : Kaplan ");
        }
        else if(yil%12 == 7){
            System.out.println("Çin Zodyağınız : Tavşan ");
        }
        else if(yil%12 == 8){
            System.out.println("Çin Zodyağınız : Ejderha ");
        }
        else if(yil%12 == 9){
            System.out.println("Çin Zodyağınız : Yılan");
        }
        else if(yil%12 == 10){
            System.out.println("Çin Zodyağınız : At ");
        }
        else if(yil%12 == 11){
            System.out.println("Çin Zodyağınız : Koyun ");
        }
        else if(yil < 0){
            System.out.println("Geçersiz Değer Girdiniz...");
            System.exit(0);
        }
        
    }
    
}
