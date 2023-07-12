public class idman
{
    private int sinav;
    private int squat;
    private int mekik;
    private int barfix;

    //constractor()
    public idman(int sinav, int squat, int mekik, int barfix) {
        this.sinav = sinav;
        this.squat = squat;
        this.mekik = mekik;
        this.barfix = barfix;
    }

    public void  hareket_yap(String hareket,int sayi){
        if(sayi<0){
            System.out.println("Geçerli sayı gir !");
        }
        else{
            if(hareket.equals("sinav")){
                sinav_cek(sayi);
            }else if(hareket.equals("")){
                squat_yap(sayi);
            }
            else if(hareket.equals("sinav")){
                mekik_cek(sayi);
            }
            else if(hareket.equals("sinav")){
                barfix_cek(sayi);
            }else System.out.println("Seçersiz hareket ...");
        }
    }

    //değerleri alıyor
    public void sinav_cek(int k){
        this.sinav-=k;
        if(this.sinav<0){
            System.out.println("Hedefe ulaşıldı .");
        }else System.out.println("kalan şınav :"+this.sinav);
    }
    public void squat_yap(int k){
        this.squat-=k;
        if(this.squat<0) {
            System.out.println("Hedefe ulaşıldı .");
        }else System.out.println("****\nkalan squat :"+this.squat);
    }
    public void mekik_cek(int k){
        this.mekik-=k;
        if(this.mekik<0) System.out.println("Hedefe ulaşıldı .");
        else System.out.println("****\nkalan mekik :"+this.mekik);
    }
    public void barfix_cek(int k){
        this.barfix-=k;
        if(this.barfix<0) System.out.println("Hedefe ulaşıldı .");
        else System.out.println("****\nkalan barfix :"+this.barfix);
    }


    public int getSinav() {
        return sinav;
    }

    public void setSinav(int sinav) {
        this.sinav = sinav;
    }

    public int getSquat() {
        return squat;
    }

    public void setSquat(int squat) {
        this.squat = squat;
    }

    public int getMekik() {
        return mekik;
    }

    public void setMekik(int mekik) {
        this.mekik = mekik;
    }

    public int getBarfix() {
        return barfix;
    }

    public void setBarfix(int barfix) {
        this.barfix = barfix;
    }
}
