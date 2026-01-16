package package2;

import package1.*;

public class Asub extends A {
    public static void main(String[] args) {
        Asub he = new Asub();
        System.out.println(he.protectedMessage);
    }
}
