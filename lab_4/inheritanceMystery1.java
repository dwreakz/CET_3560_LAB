package lab_4;
public class inheritanceMystery1 {
    public static class A extends B {
        public void method2() {
            System.out.print("a 2  ");
            method1();
        }
    }
    public static class B extends C {
        public String toString() {
            return "b";
        }

        public void method2() {
            System.out.print("b 2  ");
            super.method2();
        }
    }
    public static class C {
        public String toString() {
            return "c";
        }
        public void method1() {
            System.out.print("c 1  ");
        }
        public void method2() {
            System.out.print("c 2  ");
        }
    }
    public static class D extends B {
        public void method1() {
            System.out.print("d 1  ");
            method2();
        }
    }
    public static void main(String[] args) {
        C[] elements = {new A(), new B(), new C(), new D()};
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
            elements[i].method1();
            System.out.println();
            elements[i].method2();
            System.out.println();
            System.out.println();
        }
    }
}