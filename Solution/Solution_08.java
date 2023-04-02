/*Write a java application which accepts 10 names of student and their age. Sort names and 
  age in descending order at an interval of 1 second using thread.*/

import java.util.Arrays;
import java.util.Scanner;

public class Solution_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[10];
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            scanner.nextLine(); 
        }
		while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Sort via Name.");
            System.out.println("2. Sort via Age.");
            System.out.println("3. Exit");
			System.out.print("\nSelect Your Choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    for (int i = 0; i < 10; i++) {
						for (int j = i + 1; j < 10; j++) {
							if (names[i].compareToIgnoreCase(names[j]) < 0) {
								String tempName = names[i];
								names[i] = names[j];
								names[j] = tempName;
								int tempAge = ages[i];
								ages[i] = ages[j];
								ages[j] = tempAge;
							}
						}
					}
					System.out.println("\nSorted Names in Descending Order:");
					for (int i = 0; i < 10; i++) {
						try {
								System.out.println(names[i] + " - " + ages[i]);
								Thread.sleep(1000);
							} 
						catch (InterruptedException e) {
								e.printStackTrace();
							}
					}
                    break;
                case 2:
                    for (int i = 0; i < 10; i++) {
						for (int j = i + 1; j < 10; j++) {
							if (ages[i] < (ages[j])) {
								int tempage = ages[i];
								ages[i] = ages[j];
								ages[j] = tempage;
								String tempname = names[i];
								names[i] = names[j];
								names[j] = tempname;
							}
						}
					}
					System.out.println("\nSorted Ages in Descending Order:");
					for (int i = 0; i < 10; i++) {
						try {
								System.out.println(ages[i] + " - " + names[i]);
								Thread.sleep(1000);
							} 
						catch (InterruptedException e) {
								e.printStackTrace();
							}
					}
                    break;
				case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
		}	
    }
}
