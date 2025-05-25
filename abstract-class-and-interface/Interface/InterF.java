interface I1 {
    int x = 6;
    void f1();
    static void f2() {
        System.out.println(x); // prints 6
    }
}

interface I2 extends I1 {
    int x = 9;
    int y = 2;
    static void f2() {
        System.out.println(x); // prints 9
    }
    void f3();
}

class C1 implements I2 {
    public void f1() {
        // implementation
    }

    public void f3() {
        // implementation
    }

    static void f2() {
        System.out.println(x); // prints 9
    }
}

public class InterF {
    public static void main(String[] args) {
        I2.f2();          // prints 9
        //I2.f2();          // prints 9
        //C1 c1 = new C1();
        //c1.f2();          // => Compile-time error: static method not inherited
        //System.out.println(c1.y); // prints 2
        //I1.f2();          // prints 6
    }
}
