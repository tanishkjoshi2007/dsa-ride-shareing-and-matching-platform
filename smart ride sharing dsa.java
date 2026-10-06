import java.util.Scanner;

public class RideSharingPlatform {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Driver names
        String[] drivers = {"Driver A", "Driver B", "Driver C"};

        // Distance of drivers from rider
        int[] distance = {5, 2, 8};

        System.out.println("Available Drivers:");

        for (int i = 0; i < drivers.length; i++) {
            System.out.println(drivers[i] + " - " + distance[i] + " km away");
        }

        // Assume first driver is nearest
        int minDistance = distance[0];
        int nearestDriver = 0;

        // Find nearest driver
        for (int i = 1; i < distance.length; i++) {

            if (distance[i] < minDistance) {
                minDistance = distance[i];
                nearestDriver = i;
            }
        }

        System.out.println("\nRide Request Received!");

        System.out.println("Matched Driver: " + drivers[nearestDriver]);

        System.out.println("Distance: " + minDistance + " km");

        System.out.println("Ride Successfully Booked!");

        sc.close();
    }
}