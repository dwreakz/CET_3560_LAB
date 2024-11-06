package Lab_3;

// Question
// For the program below, trace through its execution by hand to show what output is produced when it runs.
public class Halloween {
    public static void main(String[] args) {
        int halloweenTown = 10;
        Skeleton bones = new Skeleton("bones");
        Pumpkin king = new Pumpkin(halloweenTown, bones);
        Skeleton skellington = bones;
        skellington.setName("skellington");
        halloweenTown = 5;
        System.out.println(king.toString());
    }
}
class Pumpkin {
    private int x;
    private Skeleton y;

    public Pumpkin(int z, Skeleton w) {
        x = z;
        y = w;
    }

    public String toString() {
        return y.getName() + " " + x;
    }
}
class Skeleton {
    private String name;

    public Skeleton(String n) {
        name = n;
    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String newName) {
	        name = newName;
	    }
	}
// Output : skellington 10 