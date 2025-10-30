import java.util.Scanner;

class Flight {
    int flightNo;
    String source;
    String destination;
    double price;

    Flight(int flightNo, String source, String destination, double price) {
        this.flightNo = flightNo;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    void display() {
        System.out.println(flightNo + "\t" + source + "\t" + destination + "\t" + price);
    }
}

public class FlightReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of flights: ");
        int n = sc.nextInt();

        Flight[] flights = new Flight[n];

        // Input flight details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Flight " + (i + 1) + ":");
            System.out.print("Flight No: ");
            int no = sc.nextInt();
            System.out.print("Source: ");
            String src = sc.next();
            System.out.print("Destination: ");
            String dest = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            flights[i] = new Flight(no, src, dest, price);
        }

        int choice;
        do {
            System.out.println("\n---- Flight Reservation Menu ----");
            System.out.println("1. Display Flights");
            System.out.println("2. Sort Flights by Price");
            System.out.println("3. Search Flight by Number (Linear Search)");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nFlightNo\tSource\tDestination\tPrice");
                    for (int i = 0; i < n; i++) {
                        flights[i].display();
                    }
                    break;

                case 2:
                    // Bubble sort by price
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (flights[j].price > flights[j + 1].price) {
                                Flight temp = flights[j];
                                flights[j] = flights[j + 1];
                                flights[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("\nFlights sorted by price (low to high).");
                    break;

                case 3:
                    // Linear Search by flight number
                    System.out.print("Enter flight number to search: ");
                    int key = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (flights[i].flightNo == key) {
                            System.out.println("\nFlight Found:");
                            System.out.println("FlightNo\tSource\tDestination\tPrice");
                            flights[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Flight not found!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
            }
        } while (choice != 4);

        sc.close();
    }
}
