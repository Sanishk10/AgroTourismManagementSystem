package Assignment_2;

import java.util.Scanner;

/**
 * Demonstrates five types of inheritance using tourism and agriculture
 * examples through a menu-driven application.
 *
 * @author Student
 * @version 1.0
 */
public class TourismAgricultureInheritance {

    /**
     * Starts the menu-driven application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Enter a number from 0 to 5: ");
                scanner.next();
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    demonstrateSingleInheritance();
                    break;
                case 2:
                    demonstrateMultipleInheritance();
                    break;
                case 3:
                    demonstrateMultilevelInheritance();
                    break;
                case 4:
                    demonstrateHierarchicalInheritance();
                    break;
                case 5:
                    demonstrateHybridInheritance();
                    break;
                case 0:
                    System.out.println("Thank you for exploring Tourism and Agriculture!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();

        } while (choice != 0);

        scanner.close();
    }

    /** Displays the main menu. */
    private static void printMenu() {
        System.out.println("==============================================");
        System.out.println(" TOURISM AND AGRICULTURE MANAGEMENT SYSTEM");
        System.out.println("==============================================");
        System.out.println("1. Single Inheritance");
        System.out.println("2. Multiple Inheritance");
        System.out.println("3. Multilevel Inheritance");
        System.out.println("4. Hierarchical Inheritance");
        System.out.println("5. Hybrid Inheritance");
        System.out.println("0. Exit");
        System.out.println("----------------------------------------------");
    }

    /** Demonstrates single inheritance. */
    private static void demonstrateSingleInheritance() {
        System.out.println("\n--- SINGLE INHERITANCE ---");
        FarmStay stay = new FarmStay();
        stay.showService();
        stay.showFarmStayDetails();
    }

    /** Demonstrates multiple inheritance through interfaces. */
    private static void demonstrateMultipleInheritance() {
        System.out.println("\n--- MULTIPLE INHERITANCE ---");
        AgroTourCoordinator coordinator = new AgroTourCoordinator();
        coordinator.guideTour();
        coordinator.manageFarmActivity();
        coordinator.showPackage();
    }

    /** Demonstrates multilevel inheritance. */
    private static void demonstrateMultilevelInheritance() {
        System.out.println("\n--- MULTILEVEL INHERITANCE ---");
        OrganicFarmTour tour = new OrganicFarmTour();
        tour.showService();
        tour.showRuralTourDetails();
        tour.showOrganicFarmDetails();
    }

    /** Demonstrates hierarchical inheritance. */
    private static void demonstrateHierarchicalInheritance() {
        System.out.println("\n--- HIERARCHICAL INHERITANCE ---");

        BeachTour beach = new BeachTour();
        HeritageTour heritage = new HeritageTour();

        beach.showTourismService();
        beach.showBeachDetails();

        heritage.showTourismService();
        heritage.showHeritageDetails();
    }

    /** Demonstrates hybrid inheritance. */
    private static void demonstrateHybridInheritance() {
        System.out.println("\n--- HYBRID INHERITANCE ---");
        EcoAgroTour tour = new EcoAgroTour();
        tour.showService();
        tour.showRuralTourDetails();
        tour.showFarmActivity();
        tour.showEcoPractices();
    }
}
