import java.util.*;
class iFriendContactOrganizer{
	
	
	public static String[] contactIDs = new String[1];
	public static String[] contactNames = new String[1];
	public static String[] phoneNo = new String[1];
	public static String[] company = new String[1];
	public static double [] salary = new double[1];
	public static String [] birthday = new String [1];
	public static int contactCount = 0;
	
	public static void main(String args []){
		
		System.out.println("\n\n            /$$ /$$$$$$$$ /$$$$$$$  /$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$$");
		System.out.println("            |__/| $$_____/| $$__  $$|_  $$_/| $$_____/| $$$ | $$| $$__  $$");
		System.out.println("             /$$| $$      | $$  \\ $$  | $$  | $$      | $$$$| $$| $$  \\ $$");
		System.out.println("            | $$| $$$$$   | $$$$$$$/  | $$  | $$$$$   | $$ $$ $$| $$  | $$");
		System.out.println("            | $$| $$__/   | $$__  $$  | $$  | $$__/   | $$  $$$$| $$  | $$");
		System.out.println("            | $$| $$      | $$  \\ $$  | $$  | $$      | $$\\  $$$| $$  | $$");
		System.out.println("            | $$| $$      | $$  | $$ /$$$$$$| $$$$$$$$| $$ \\  $$| $$$$$$$/");
		System.out.println("            |__/|__/      |__/  |__/|______/|________/|__/  \\__/|_______/");
		
		
		System.out.println();
		System.out.println();
		System.out.println("  ______            _             _          ____                        _");
		System.out.println(" / _____|          | |           | |        / __ \\                      (_)");
		System.out.println("| |      ___  _ __ | |_ __ _  ___| |_ ___  | |  | |_ __ __ _  __ _ _ __  _ _______ _ __");
		System.out.println("| |     / _ \\| '_ \\| __/ _` |/ __| __/ __| | |  | | '__/ _` |/ _` | '_ \\| |_  / _ \\ '__|");
		System.out.println("| |____| (_) | | | | || |_| | |__| |_\\__ \\ | |__| | | | |_| | |_| | | | | |/ /  __/ |");
		System.out.println(" \\______\\___/|_| |_|\\__\\__,_|\\___|\\__|___/  \\____/|_|  \\__, |\\__,_|_| |_|_/___\\___|_|");
		System.out.println("                                                        __/ |");
		System.out.println("                                                       |___/");
		
		mainMenu();
		

	
	}
	
	public static void mainMenu(){
		Scanner input = new Scanner(System.in);
		int option =0;
		
		L1: while (option!=6){
			System.out.println("\n\n==========================================================================================");
		
			System.out.println("\n\n        [01] ADD Contacts");
			System.out.println("\n        [02] UPDATE Contacts");
			System.out.println("\n        [03] DELETE Contacts");
			System.out.println("\n        [04] SEARCH Contacts");
			System.out.println("\n        [05] LIST Contacts");
			System.out.println("\n        [06] EXIT");
			
			System.out.print("\n Enter an option to continue -> ");
			option = input.nextInt();
			
			switch (option){
				
				case 1 :
					addContact();
					break;
				case 2 :
					updateContact();
					break;
				case 3 :
					deleteContact();
					break;
				case 4 :
					searchContact();
					break;
				case 5 :
					listContact();
					break;
				case 6 :
					break L1;
				default :  
					System.out.println("Invalid option. Please try again.");
					continue;
			}
			
		}
		System.out.println("Thank You for Use Our Software...");
		
	}
	
	public static void addContact(){
		
		System.out.println("\n+-------------------------------------------------------------------------+");
		System.out.println("|                              Add Contact                                |");
		System.out.println("+-------------------------------------------------------------------------+");
		System.out.println();
		
			
			Scanner input = new Scanner(System.in);
			String []  tempID =  new String [contactIDs.length+1];
			String []  tempName =  new String [contactNames.length+1];
			String []  tempPhoneNo =  new String [phoneNo.length+1];
			String []  tempCompany =  new String [company.length+1];
			double []  tempSalary =  new double [salary.length+1];
			String []  tempbirthday  =  new String [birthday .length+1];
			

		
			if (contactIDs.length!=0){
			
				for (int i = 0;i<contactIDs.length;i++){
				
					tempID[i]=contactIDs[i];
					contactIDs = tempID;
				
					tempName[i]=contactNames[i];
					contactNames = tempName;
				
					tempPhoneNo[i]=phoneNo[i];
					phoneNo = tempPhoneNo;
				
					tempCompany[i]=company[i];
					company = tempCompany;
				
					tempSalary[i]=salary[i];
					salary =tempSalary;
				
					tempbirthday[i]= birthday[i];
					birthday = tempbirthday;
				
				}
			}
		
			contactIDs = tempID;
			contactNames = tempName;
			phoneNo = tempPhoneNo;
			company = tempCompany;
			salary = tempSalary;
			birthday = tempbirthday;
		
			String contactID = String.format("C%04d", contactCount + 1);
			contactIDs[contactCount] = contactID; 
        
			System.out.println("\n\n  "+contactID);
			System.out.println(" =======");
			System.out.print("\n   Name               : ");
			String name = input.next();
			contactNames[contactCount]=name;
        
			System.out.print("\n   Phone Number       : ");
			String phone = input.next();
			
			
			while(phone.length()!=10){
				System.out.println("\n   Invalid Phone No... ");
				System.out.print("\nDo you want to add phone number again (Y/N) : ");
				char flag = input.next().charAt(0);
				if ((flag=='Y')||(flag=='y')){
					
					System.out.print("\n   Phone Number       : ");
					phone = input.next();
					break;
					
				}else if ((flag=='n')||(flag=='N')){
					phone = "-1";
					break;
					
				}else {
					System.out.print("\n   Invalid Charactor...! ");
					continue;
				}
				
				
			}
			if (phone.equals("-1")){
				System.out.println("\n       You are Skip phone number... ");
				
			}else {
				phoneNo[contactCount]=phone;
			}
			
			System.out.print("\n   Company Name       : ");
			String companyN = input.next();
			company[contactCount]=companyN;
        
			System.out.print("\n   Salary             : ");
			double salaryS = input.nextDouble();
			salary[contactCount] = salaryS;
        
			System.out.print("\n   B'Day(YYYY-MM-DD)  : ");
			String bday = input.next();
			birthday[contactCount]=bday;
			contactCount++;
		
			System.out.println("\n\nContact ID " + contactID + " generated and stored successfully.");
		
	
	}
	
	public static void updateContact() {
		
		System.out.println("\n+-------------------------------------------------------------------------+");
		System.out.println("|                             Update Contact                              |");
		System.out.println("+-------------------------------------------------------------------------+");
		System.out.println();
		
    Scanner input = new Scanner(System.in);
    int index = -1;
    System.out.print("\nSearch Contact by Name or PhoneNumber : ");
    String search = input.next();

    // Search for the contact by name
    for (int i = 0; i < contactNames.length; i++) {
        if (search.equals(contactNames[i])) {
            index = i;
        }
    }

    // Search for the contact by phone number if not found by name
    if (index == -1) {
        for (int i = 0; i < phoneNo.length; i++) {
            if (search.equals(phoneNo[i])) {
                index = i;
            }
        }
    }

    // Handle case when no contact is found
    if (index == -1) {
        System.out.print("\nNo Contact found for " + search);
        return;
    } else {
        // Display the current contact details
        System.out.print("\n   Contact ID          : " + contactIDs[index]);
        System.out.print("\n   Name                : " + contactNames[index]);
        System.out.print("\n   Phone Number        : " + phoneNo[index]);
        System.out.print("\n   Company Name        : " + company[index]);
        System.out.print("\n   Salary              : " + salary[index]);
        System.out.print("\n   B'Day (YYYY-MM-DD)  : " + birthday[index]);
    }

    // Update the contact details
    while (true) {
        System.out.print("\nWhat do you want to update? ");
        System.out.println("\n\n        [01] Name");
        System.out.println("\n        [02] Phone Number");
        System.out.println("\n        [03] Company Name");
        System.out.println("\n        [04] Salary");
        System.out.println("\n        [05] Exit Update");

        System.out.print("\nEnter an option to continue -> ");
        int option = input.nextInt();

        switch (option) {
            case 1:
                System.out.println("\n Update Name");
                System.out.println("\n=============");
                System.out.print("\n   Input new Name     : ");
                contactNames[index] = input.next();
                System.out.println("\nContact has been updated successfully.");
                break;

            case 2:
                System.out.println("\n Update Phone Number");
                System.out.println("\n=====================");
                System.out.print("\n   Input new Phone Number: ");
                phoneNo[index] = input.next();
                System.out.println("\nContact has been updated successfully.");
                break;

            case 3:
                System.out.println("\n Update Company Name");
                System.out.println("\n=====================");
                System.out.print("\n   Input new Company Name: ");
                company[index] = input.next();
                System.out.println("\nContact has been updated successfully.");
                break;

            case 4:
                System.out.println("\n Update Salary");
                System.out.println("\n==============");
                System.out.print("\n   Input new Salary: ");
                salary[index] = input.nextDouble();
                System.out.println("\nContact has been updated successfully.");
                break;

            case 5:
                System.out.println("\nExiting update menu...");
                return;

            default:
                System.out.println("\nInvalid option. Please try again.");
        }

        
        System.out.print("\nDo you want to update another field? (Y/N): ");
        char updateAnother = input.next().charAt(0);

        if (updateAnother == 'N' || updateAnother == 'n') {
            break;
        }
    }
}

	
	public static void deleteContact() {
    System.out.println("\n+-------------------------------------------------------------------------+");
    System.out.println("|                             Delete Contact                              |");
    System.out.println("+-------------------------------------------------------------------------+");
    System.out.println();

    Scanner input = new Scanner(System.in);

    while (true) {
        int index = -1;
        System.out.print("\nSearch Contact by Name or PhoneNumber: ");
        String search = input.next();

        // Search for the contact by name
        for (int i = 0; i < contactNames.length; i++) {
            if (search.equals(contactNames[i])) {
                index = i;
                break;
            }
        }

        // Search for the contact by phone number if not found by name
        if (index == -1) {
            for (int i = 0; i < phoneNo.length; i++) {
                if (search.equals(phoneNo[i])) {
                    index = i;
                    break;
                }
            }
        }

        // Handle case when no contact is found
        if (index == -1) {
            System.out.println("\nNo Contact found for " + search);
        } else {
            // Display the current contact details
            System.out.println("\n   Contact ID          : " + contactIDs[index]);
            System.out.println("   Name                : " + contactNames[index]);
            System.out.println("   Phone Number        : " + phoneNo[index]);
            System.out.println("   Company Name        : " + company[index]);
            System.out.println("   Salary              : " + salary[index]);
            System.out.println("   B'Day (YYYY-MM-DD)  : " + birthday[index]);

            System.out.print("\nDo you want to delete this contact (Y/N): ");
            char isDelete = input.next().charAt(0);

            if (isDelete == 'Y' || isDelete == 'y') {
                // Perform deletion by creating new arrays
                contactIDs = removeElement(contactIDs, index);
                contactNames = removeElement(contactNames, index);
                phoneNo = removeElement(phoneNo, index);
                company = removeElement(company, index);
                salary = removeElement(salary, index);
                birthday = removeElement(birthday, index);
                contactCount--;

                System.out.println("\nContact has been deleted successfully.");
            } else if (isDelete == 'N' || isDelete == 'n') {
                System.out.println("\nContact deletion canceled.");
            } else {
                System.out.println("\nInvalid choice. No action taken.");
            }
        }

        // Ask if the user wants to delete another contact
        System.out.print("\nDo you want to delete another contact (Y/N): ");
        char wantAnother = input.next().charAt(0);

        if (wantAnother == 'N' || wantAnother == 'n') {
            break;
        } else if (wantAnother != 'Y' && wantAnother != 'y') {
            System.out.println("\nInvalid choice. Returning to main menu.");
            break;
        }
    }
}

// Helper method to remove an element from an array
	public static String[] removeElement(String[] array, int index) {
		String[] newArray = new String[array.length - 1];
		for (int i = 0, j = 0; i < array.length; i++) {
			if (i != index) {
				newArray[j++] = array[i];
			}
		}
		return newArray;
	}

	public static double[] removeElement(double[] array, int index) {
		double[] newArray = new double[array.length - 1];
		for (int i = 0, j = 0; i < array.length; i++) {
			if (i != index) {
				newArray[j++] = array[i];
			}
		}
		return newArray;
	}

	
	public static void searchContact(){
		
		System.out.println("\n+-------------------------------------------------------------------------+");
		System.out.println("|                             Search Contact                              |");
		System.out.println("+-------------------------------------------------------------------------+");
		System.out.println();
		
		
		Scanner input = new Scanner (System.in);
		int index = -1;
		System.out.print("\nSearch Contact by Name or PhoneNumber : ");
		String search = input.next();
		
		for (int i = 0; i<contactNames.length ; i++){
			if (search.equals(contactNames[i])){
				index = i;
			}  
		}
		
		if (index == -1){
			
			for (int i = 0; i<phoneNo.length ; i++){
				
				if (search.equals(phoneNo[i])){  
					               
					index = i;
					
				}
			}
		}
		
		if (index == -1){
			
			System.out.print("\nNo COntact found for "+search);
		}else {
			
			System.out.print("\n   Contact ID          : "+contactIDs[index]);
			System.out.print("\n   Name                : "+contactNames[index]);
			System.out.print("\n   Phone Number        : "+phoneNo[index]);
			System.out.print("\n   Company Name        : "+company[index]);
			System.out.print("\n   Salary              : "+salary[index]);
			System.out.print("\n   B'Day (YYYY-MM-DD)  : "+birthday[index]);
			
		}
		
	}
	
	public static void listContact() {
    Scanner input = new Scanner(System.in);

    System.out.println("\n+-------------------------------------------------------------------------+");
    System.out.println("|                              List Contacts                              |");
    System.out.println("+-------------------------------------------------------------------------+");
    
    if (contactCount == 0) {
        System.out.println("\nNo contacts to display.");
        return;
    }

    System.out.println("\nSort Contacts by:");
    System.out.println("[1] Name");
    System.out.println("[2] Salary");
    System.out.println("[3] Birthday");
    System.out.print("Enter your choice: ");
    int option = input.nextInt();

    int[] sortedIndices = getSortedIndices(option);

    // Print table header
    System.out.println("\n+--------+----------------+-------------+----------------+---------+------------+");
    System.out.println("| ID     | Name           | Phone       | Company        | Salary  | Birthday   |");
    System.out.println("+--------+----------------+-------------+----------------+---------+------------+");

    // Print each contact in sorted order
    for (int index : sortedIndices) {
        System.out.printf("| %-6s | %-14s | %-11s | %-14s | %-7.2f | %-10s |\n",
                contactIDs[index],
                contactNames[index],
                phoneNo[index],
                company[index],
                salary[index],
                birthday[index]);
    }

    System.out.println("+--------+----------------+-------------+----------------+---------+------------+");

    System.out.print("\nDo you want to stay in the listing menu? (Y/N): ");
    char choice = input.next().charAt(0);
    if (choice == 'N' || choice == 'n') {
        System.out.println("Returning to main menu...");
    }
}

 private static int[] getSortedIndices(int option) {
    Integer[] indices = new Integer[contactCount];
    for (int i = 0; i < contactCount; i++) {
        indices[i] = i;
    }


    Comparator <Integer> comparator = switch (option) {
        case 1 -> Comparator.comparing(i -> contactNames[i]); // Sort by Name
        case 2 -> Comparator.comparingDouble(i -> salary[i]); // Sort by Salary
        case 3 -> Comparator.comparing(i -> birthday[i]);     // Sort by Birthday
        default -> Comparator.comparing(i -> contactIDs[i]);  // Default to Contact ID
    };


    Arrays.sort(indices, comparator);
    return Arrays.stream(indices).mapToInt(Integer::intValue).toArray();
}
}
