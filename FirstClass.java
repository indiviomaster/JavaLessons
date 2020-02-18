public class FirstClass {
    public static void main(String[] args) {
        byte bt = 1;
        short st = 12;
        int it = 3232;
        long lng = 322315654;

        double db = mCalc(1,2,3,4);
        System.out.println(db);
        boolean bl = isTru1020(20,5);
        System.out.println(bl);
        boolean bl2 = isPlus(5);
        System.out.println(bl2);
        sayHi("Билл");
        isViYear(2020);
    }
    static double mCalc(double a, double b, double c, double d){
        return (a*(b+c/d));
    }

    static boolean isTru1020(int a, int b){
        if ((a+b)>10 && (a+b)<20) {
            return true;
        } else {
            return false;
        }
     }
    static boolean isPlus(int a){
        return a>=0?true:false;
    }
    static void sayHi(String name){
        System.out.println("Привет, "+ name+"!");
        //System.out.printf("Привет, %s!",name);
    }
    static void isViYear(int y){
        boolean fl = (y%400==0)||(y%4 ==0 && y%100!=0);
        if(fl){
            System.out.println("Год "+ y+" високосный!");
        }else{
            System.out.println("Год "+ y+" не високосный!");
        }

    }


}
