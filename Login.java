import java.util.Scanner;


    public class Login {
    
    public boolean login(Hesap hesap){
        
        Scanner scan = new Scanner(System.in);
        String Kullanici_adi;
        String Parola;
        
                System.out.println("Kullanıcı adı : ");
                Kullanici_adi = scan.nextLine();
                System.out.println("Parola : ");
                Parola = scan.nextLine();
                
                if(hesap.getKullanici_adi().equals(Kullanici_adi)&& hesap.getParola().equals(Parola)){
                    return true;
                }else {
                    return false;
                }
        
    }
    
    
    
    
    
}
