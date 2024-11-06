package lab_4;

public class TimeSpan {
	public int hours;
	public int minutes;

	//Constructor
	public TimeSpan(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
		convert();
	}
	// Convert more than 60 MIN to HRS
	public void convert(){
		if (minutes >= 60) {
			hours += minutes / 60;
			minutes = minutes % 60;
		}
	}
	// getHours() returns hours in Time Span
	public int getHours(){
		return hours;
	}
	// getHours() returns minutes in Time Span
	public int getMinutes() {
		return minutes;
	}
	public void add(int addHours, int addMinutes) {
		this.hours += addHours;
		this.minutes += addMinutes;
		convert();
	}
	public void add (TimeSpan timespan) {
		add(timespan.getHours(), timespan.getMinutes());
	}
	public double getTotalHours() {
		return hours + minutes / 60.0;
	}
	@Override
	public String toString() {
		return hours + "h" + minutes + "m";
	}
	public static void main(String[] args) {
		// Creating TimeSpan instances
		TimeSpan span1 = new TimeSpan(2, 90); // 2h 90m -> should normalize to 3h 30m
		TimeSpan span2 = new TimeSpan(1, 45); // 1h 45m

		// Print initial values
		System.out.println("Initial Span 1: " + span1); // Expected: "3h30m"
		System.out.println("Initial Span 2: " + span2); // Expected: "1h45m"

		// Test getHours and getMinutes
		System.out.println("Span 1 Hours: " + span1.getHours()); // Expected: 3
		System.out.println("Span 1 Minutes: " + span1.getMinutes()); // Expected: 30

		// Test add(int, int) method
		span1.add(2, 45); // Adding 2 hours, 45 minutes
		System.out.println("After adding 2h45m to Span 1: " + span1); // Expected: "6h15m"

		// Test add(TimeSpan) method
		span1.add(span2); // Adding span2 (1h45m) to span1
		System.out.println("After adding Span 2 to Span 1: " + span1); // Expected: "8h0m"

		// Test getTotalHours
		System.out.println("Total hours in Span 1: " + span1.getTotalHours()); // Expected: 8.0

		// Test toString method
		System.out.println("Final Span 1: " + span1.toString()); // Expected: "8h0m"
	}
}