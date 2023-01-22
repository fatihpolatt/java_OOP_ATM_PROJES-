
import java.util.Scanner;


public class ATM {
    
    public void calis(Hesap hesap){
         
        Login login = new Login();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bankamza HOŞgeldiniz");
        
        System.out.println("*********************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("*********************");
        int giris_hakkı = 3;
         while(true){
             if(login.login(hesap)){
                 System.out.println("Giriş başarılı");
                 break;
             }
             else {
                 System.out.println("Giriş başarısız");
                 giris_hakkı -= 1;
                 System.out.println("Kalan giriş hakkı"+giris_hakkı);
             }
             if(giris_hakkı == 0){
                 System.out.println("Giriş Hakkınız bitti");
                 return;
             }
                 
         }
        System.out.println("*********************");
        String islemler = "1. Bakiye görüntüle\n"
                        + "2. Para yatır\n"
                        + "3. Para cek\n"
                        + "Çıkış için q'ya basınız\n";
        System.out.println(islemler);
        System.out.println("*********************");
    
        while(true){
            System.out.println("İşlemi Seçiniz : ");
            String islem = scan.nextLine();
            if (islem.equals("q")){
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz"+hesap.getBakiye());
                
            }
            else if(islem.equals("2")){
                System.out.println("Yatırmak istediğiniz tutarı girinzi : ");
                int tutar = scan.nextInt();
                scan.nextLine();
                hesap.paraYatir(tutar);
            }
            else if (islem.equals("3")){
                System.out.println("Çekmek istediğiniz tutar : ");
                int tutar = scan.nextInt();
                scan.nextLine();
                hesap.paraCek(tutar);
            }
            else {
                System.out.println("Geçersiz işlem");
            }
        }
        
        
        
        
    }
    
}
