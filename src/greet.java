public class greet {

    private int a,b,c,d;

    public greet(idman idman1) {
        this.a = idman1.getSinav();
        this.b = idman1.getBarfix();
        this.c = idman1.getMekik();
        this.d = idman1.getSquat();
    }

    //sadece getterler lazım

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public void yazdir(idman idman2){
        //Şınav
        if(idman2.getSinav()<0){
            System.out.println(getA()+" hedefinden "+((-1)*idman2.getSinav()+getA())+" kadar çekerek tamamladın.");
        }else{
            System.out.println(getA()+" hedefinden "+(getA()-idman2.getSinav())+" kadar çekerek tamamlayamadın.");
        }
        //mekik
        if(idman2.getBarfix()<0){
            System.out.println(getB()+" hedefinden "+((-1)*idman2.getBarfix()+getB())+" kadar çekerek tamamladın.");
        }else{
            System.out.println(getB()+" hedefinden "+(getB()-idman2.getBarfix())+" kadar çekerek tamamlayamadın.");
        }
        //barfix
        if(idman2.getMekik()<0){
            System.out.println(getC()+" hedefinden "+((-1)*idman2.getMekik()+getC())+" kadar çekerek tamamladın.");
        }else{
            System.out.println(getC()+" hedefinden "+(getC()-idman2.getMekik())+" kadar çekerek tamamlayamadın.");
        }
        //squat
        if(idman2.getSquat()<0){
            System.out.println(getD()+" hedefinden "+((-1)*idman2.getSquat()+getD())+" kadar çekerek tamamladın.");
        }else{
            System.out.println(getD()+" hedefinden "+(getD()-idman2.getSquat())+" kadar çekerek tamamlayamadın.");
        }
    }
}
