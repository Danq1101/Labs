package lab2; // 1

public class Main1 {
    public static void main(String[] args) {
        Krug rez = new Krug(1,1,5);
        rez.show();
        rez.plusXY(1,1);
        rez.plusR(1);
        rez.show();
        rez.s();
        rez.p();
    }
}

class Krug{
    int r, x, y;
    Krug() {
    }
    Krug(int r){
        this.r = r;
    }
    Krug(int x, int y){
        this.x = x; this.y = y;
    }
    Krug(int x, int y, int r){
        this.x = x; this.y = y; this.r = r;
    }

    public void show(){
        System.out.println("R = " + r + " y = " + y + " x = " + x);
    }

    public void plusXY(int a, int b){
        x += a; y += b;
    }

    public  void plusR(int c){
        r += c;
    }

    public void s(){
        System.out.println((3.14 * r * r));
    }

    public void p(){
        System.out.println((2 * 3.14 * r));
    }
}
