/*Create two user-defined exceptions named “TooHot” and “TooCold” to check the
temperature (in Celsius) given by the user is too hot or too cold.
If temperature > 35, throw exception “TooHot”.
If temperature <5, throw exception “TooCold”.
Otherwise, print “Normal” and convert it to Farenheit.*/

package ex;

import java.util.Scanner;

public class temperature{
	
	static void checkTemp(int temp) throws checkTemperature {
				if(temp < 5) {
					throw new checkTemperature("TooCold");
				}
				if(temp > 35) {
					throw new checkTemperature("TooHot");
				}
				else {
					System.out.println("Normal");
				}
	}
	
	static void celtofer(int temp) {
		
		int far = 0;
		far = (temp * 9/5) + 35;
		System.out.println("After converting "+temp+"C to fahrenheit the temperature is "+far+"F");

	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int temp;
		
		System.out.println("Enter the Temperature: ");
		temp = sc.nextInt();
		
		try {
			temperature.checkTemp(temp);
		}
		catch(checkTemperature e)
		{
			System.out.println(e.getMessage());
		}
		temperature.celtofer(temp);
	}
}

