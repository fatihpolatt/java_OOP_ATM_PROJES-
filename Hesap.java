
public class Hesap {
    
    private String Kullanici_adi;
    private String Parola;
    private int Bakiye;

    public Hesap(String Kullanici_adi, String Parola, int Bakiye) {
        this.Kullanici_adi = Kullanici_adi;
        this.Parola = Parola;
        this.Bakiye = Bakiye;
    }

    public String getKullanici_adi() {
        return Kullanici_adi;
    }

    public void setKullanici_adi(String Kullanici_adi) {
        this.Kullanici_adi = Kullanici_adi;
    }

    public String getParola() {
        return Parola;
    }

    public void setParola(String Parola) {
        this.Parola = Parola;
    }

    public int getBakiye() {
        return Bakiye;
    }

    public void setBakiye(int Bakiye) {
        this.Bakiye = Bakiye;
    }
    
    public void paraYatir(int tutar){
        Bakiye += tutar;
        System.out.println("Yeni bakiye"+Bakiye);
    }
    
     public void paraCek(int tutar){
        if((Bakiye - tutar) < 0){     
            System.out.println("Yeterli bakiyen yok");
            }
        else {
          Bakiye -= tutar;
            System.out.println("Yeni bakiyen" +Bakiye);
        }
     }
     
}
