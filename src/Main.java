import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int a,k;
        String b;



        idman idman1 = new idman(0,0,0,0);

        //hedefler
        //a surekli kullanılabilir
        System.out.print("Şınav hedefi :");
        a=scanner.nextInt();
        idman1.setSinav(a);
        System.out.print("Mekik hedefi :");
        a=scanner.nextInt();
        idman1.setMekik(a);
        System.out.print("Barfix hedefi :");
        a=scanner.nextInt();
        idman1.setBarfix(a);
        System.out.print("squat hedefi :");
        a=scanner.nextInt();
        idman1.setSquat(a);


        //greet'den oluşum
        greet greet1=new greet(idman1);     //bunu greet'e yollayıp yazdırcam ama burda tutuyorumki yedekleme amaçlı

        System.out.print("\n\n\nIdman programı(çıkış=-1)\nsinav\tmekik\nbarfix\tsquat\nseçim:");
        scanner.nextLine();     //dump tutucu  çok önemli yoksa sorun oluyor C'de de aynıydı
        b=scanner.nextLine();
        b=b.toLowerCase();      //kucuk aldım
        while(true){
            if(b.equals("-1")) break;
            switch (b){
                case "sinav":
                    System.out.print("Kaç şınav çektin :");
                    k=scanner.nextInt();
                    idman1.sinav_cek(k);
                    System.out.println("******");
                    break;
                case "mekik":
                    System.out.print("Kaç mekik çektin :");
                    k=scanner.nextInt();
                    idman1.mekik_cek(k);
                    System.out.println("******");
                    break;
                case "squat":
                    System.out.print("Kaç squat çektin :");
                    k=scanner.nextInt();
                    idman1.squat_yap(k);
                    System.out.println("******");
                    break;
                case "barfix":
                    System.out.print("Kaç barfix çektin :");
                    k=scanner.nextInt();
                    idman1.barfix_cek(k);
                    System.out.println("******");
                    break;
                default:
                    System.out.println("Belirtilen tür mevcut değil !");
                    break;
            }


            System.out.print("seçim :");
            scanner.nextLine();     //dump tutucu  çok önemli yoksa sorun oluyor C'de de aynıydı
            b=scanner.nextLine();
            b=b.toLowerCase();      //kucuk aldım
        }

        greet1.yazdir(idman1);
    }
}
