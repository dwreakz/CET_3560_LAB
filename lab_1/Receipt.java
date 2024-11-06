package lab_1;

public class Receipt {
	public static void main(String[] args)  {
		int item1 = 38;
		int item2 = 40;
		int item3 = 30;
		double taxrate = 0.08;
		double tiprate = 0.15;
		
		int subtotal = item1 + item2 + item3;
		double tax = subtotal * taxrate;
		double tip = subtotal * tiprate;
		double total = subtotal + tax + tip;
		
		//Display computations 
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Tax: " + tax);
		System.out.println("Tip: " + tip);
		System.out.println("Total: " + total);
	}
}