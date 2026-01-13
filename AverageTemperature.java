package Module5;
import java.util.Scanner;
import java.util.ArrayList;
public class AverageTemperature {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
ArrayList<String> days=new ArrayList<String>();
ArrayList<Double> temp=new ArrayList<Double>();
days.add("Monday");
days.add("Tuesday");
days.add("Wednesday");
days.add("Thursday");
days.add("Friday");
days.add("Saturday");
days.add("Sunday");

for(int i=0;i<days.size();i++)
{
System.out.println("enter average temperature " + days.get(i) + ":");
temp.add(scanner.nextDouble());

}
scanner.nextLine();
System.out.print("Enter a day of the week or type 'week': ");
String input = scanner.nextLine();


if (input.equalsIgnoreCase("week")) {
    double total = 0;

    System.out.println("\nWeekly Temperatures:");
    for (int i = 0; i < days.size(); i++) {
        System.out.println(days.get(i) + ": " + temp.get(i));
        total += temp.get(i);
    }

    double weeklyAverage = total / temp.size();
    System.out.println("\nWeekly Average Temperature: " + weeklyAverage);

} else {
    boolean found = false;

    // Search for the day
    for (int i = 0; i < days.size(); i++) {
        if (days.get(i).equalsIgnoreCase(input)) {
            System.out.println(days.get(i) + ": " + temp.get(i));
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Invalid day entered.");
    }
}

scanner.close();
}
}

	
	


