public class test2 {

    public static void makeNoise(){
        Walrus a = new Walrus(1000, 8.3);
        Walrus b;
        b = a;
        b.weight = 5;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args){
        makeNoise()
    }
}
