package Lab_3;

import java.util.Random;

public class Student {
	private String name;
	private int id;
	private int units;
	public Student(String studentName, int studentID) {
		name = studentName;
		id = studentID;
		units = 0;
	}
	public String getName() {
		return name;
	}
	public int getID() {
		return id;
	}
	public int getUnits() {
		return units;
	}
	public int incrementUnits(int units) {
		return this.units += units;
	}
	public boolean hasEnoughUnits() {
		return units >= 180;
	}
	public String toString() {
		return name + " (#" + id + ")";
	}
}

class StudentTest {
	public static void main(String[] args) {
		Random random = new Random();
		String[] firstNames = {"John", "Jane", "Michael", "Sarah", "David", "Emily", "Chris", "Anna", "James", "Laura"};
        String[] lastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor"};

	    // Loop to create and test 50 random students
        for (int i = 1; i <= 50; i++) {
            // Generate a random name 
            String randomName = firstNames[random.nextInt(firstNames.length)] + " " + lastNames[random.nextInt(lastNames.length)];

            // Generate a random student ID between 10000 and 99999
            int randomID = random.nextInt(90000) + 10000;

            // Create a new Student object with the random name and ID
            Student student = new Student(randomName, randomID);

            // Increment units by a random number between 0 and 200 to simulate different progress levels
            int randomUnits = random.nextInt(201);
            student.incrementUnits(randomUnits);

            // Print out the student's details and whether they have enough units to graduate
            System.out.println(student.toString() + " - Units: " + student.getUnits() + " - Can graduate: " + student.hasEnoughUnits());
        }
	}
}
