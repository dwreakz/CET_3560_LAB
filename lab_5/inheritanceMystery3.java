package lab_5;

public class inheritanceMystery3 {
    public static class George extends Elaine {
        public void method1() { System.out.print("George 1 ");
        }
    }
    public static class Jerry {
        public void method1() { System.out.print("Jerry 1 ");
        }
        public void method2() { System.out.print("Jerry 2 ");
        }
        public String toString() { return "Jerry";
        }
    }
    public static class Elaine extends Kramer {
        public String toString() { return "Elaine " + super.toString();
        }
    }
    public static class Kramer extends Jerry {
        public void method1() { super.method1();
            System.out.print("Kramer 1 ");
        }
        public void method2() { System.out.print("Kramer 2 ");
            method1();
        }
        public String toString() { return "Kramer";
        }
    }
    public static void main(String[] args) {
        Jerry[] seinfeld = { new George(), new Kramer(), new Jerry(), new Elaine() };
        for (int i = 0; i < seinfeld.length; i++) {
            seinfeld[i].method1();
            System.out.println();
            seinfeld[i].method2();
            System.out.println();
            System.out.println(seinfeld[i]);
            System.out.println();
        }
    }
}
