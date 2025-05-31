public class TemperatureTest {

	public static void main(String[] args)
	{
		System.out.println("Celsius to Fahrenheit:");
		
		Temperature temp1 = new Temperature();
		temp1.setTemperature(0.00);
		temp1.setScale('C');
		System.out.println(temp1.toString());

		Temperature temp2 = new Temperature('C');
		temp2.setTemperature(-40);
		System.out.println(temp2.toString());
		
		Temperature temp3 = new Temperature(100.00, 'C');
		System.out.println(temp3.toString());
		
		System.out.println("\nFahrenheit to Celsius:");
		Temperature temp4 = new Temperature(0);
		temp4.setTemperatureScale(56.00, 'F');
		System.out.println(temp4.toString());

		System.out.println("\nComparision:");
		System.out.println("temp1 < temp2: " + temp1.lessthan(temp2));
		System.out.println("temp2 = temp3: " + temp1.equals(temp3));
		System.out.println("temp3 > temp4: " + temp3.greaterthan(temp4));		
	}	
}