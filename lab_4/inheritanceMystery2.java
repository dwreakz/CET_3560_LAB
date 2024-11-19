package lab_4;

public class inheritanceMystery2 {
    public static class Brienne extends Oberyn {
        public void a() { System.out.print("Brienne-a   ");
        }
    }
    public static class Arya {
        public void a() { System.out.print("Arya-a   ");
        }
        public void b() { a();
            System.out.print("Arya-b   ");
        }
        public String toString() { return "Arya";
        }
    }
    public static class Tyrion extends Arya {
        public void a() { super.a();
            System.out.print("Tyrion-a   ");
        }
    }
    public static class Oberyn extends Arya {
        public void b() {
            System.out.print( "Oberyn-b   ");
            super.b();
        }
        public String toString() {
            return "Oberyn";
        }
    }
    public static void main(String[] args) {
        Arya[] thrones = { new Oberyn(), new Arya(), new Brienne(), new Tyrion() };
        for (int i = 0; i < thrones.length; i++) {
            thrones[i].a();
            System.out.println();
            System.out.println(thrones[i]);
            thrones[i].b();
            System.out.println();
            System.out.println();
        }
    }
}