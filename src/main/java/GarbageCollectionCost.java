import java.util.Scanner;

public class GarbageCollectionCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 10000; 
        GarbageTruck truck = new GarbageTruck(capacity);
        int cost = 0;

        int totalGarbage = 0;
        int time = 0;

        System.out.println("Enter the amount of garbage at each station (in kg):");

        while (scanner.hasNextInt()) {
            int garbage = scanner.nextInt();
            totalGarbage += garbage;
            time += 8;

            if (totalGarbage >= capacity) {
                cost += (time / 60) * 120000; 
                cost += 57000; 
                totalGarbage = 0;
                time += 30;
            }
        }

        
        if (totalGarbage > 0) {
            int hours = time / 60; 
            if (time % 60 != 0) {
                hours++; 
            }
            cost += hours * 120000; 
            cost += 57000; 
        }

        System.out.println("The total cost is " + cost + " VND");

        scanner.close();
    }
}
