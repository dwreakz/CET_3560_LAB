package lab_5;

public class inheritanceMystery4 {
    public static class Poe extends Kylo {
        public void method2() { super.method2();
            System.out.print("Poe 2   ");
        }

        public String toString() { return "Poe " + super.toString();
        }
    }
    public static class Kylo extends Finn {
        public void method1() { System.out.print("Kylo 1   ");
        }
        public String toString() {
            return "Kylo";
        }
    }
    public static class Finn extends Rey {
        public void method2() {
            System.out.print("Finn 2   ");
            method1();
        }
    }
    public static class Rey {
        public String toString() { return "Rey";
        }
        public void method1() { System.out.print("Rey 1   ");
        }
        public void method2() { System.out.print("Rey 2   ");
        }
    }
    public static void main(String[] args) {
        Rey[] elements = { new Finn(), new Rey(), new Poe(), new Kylo() };
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
