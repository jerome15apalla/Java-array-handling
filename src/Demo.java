import java.util.Scanner;

public class Demo {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		int[] array = {10,20,30,40,50};
		int menu, search, edit, replace, delete, removeIndex=0;
		char again='y';
		
		//display, search, edit, delete
		
		System.out.print("Array Values: ");
		for(int x=0;x<array.length;x++) {
			System.out.print(array[x]+", ");
		}
		
		while(again=='y') {
			System.out.println();
			System.out.println("[1] Display all values");
			System.out.println("[2] Search");
			System.out.println("[3] Edit");
			System.out.println("[4] Delete");
			menu = input.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("Array Values: ");
				for(int x=0; x<array.length;x++) {
					System.out.print(array[x]+", ");
				}
				break;
			case 2:
				System.out.print("Seach Value: ");
				search = input.nextInt();
				for(int i=0;i<array.length;i++) {
					if(search == array[i]) {
						System.out.println("Value "+search+" is found at index "+i);
					}
				}
				
				break;
			case 3:
				System.out.print("Edit Value: ");
				edit = input.nextInt();
				System.out.print("Replace with: ");
				replace = input.nextInt();
				
				for(int i=0;i<array.length;i++) {
					if(edit == array[i]) {
						array[i] = replace;
					}
				}
				break;
			case 4:
				System.out.print("Delete: ");
				delete = input.nextInt();
				
				for(int x=0; x<array.length;x++) {
					if(delete == array[x]) {
						removeIndex = x;
						
						for(int i=removeIndex;i<array.length-1;i++) {
							array[i] = array[i+1];
						}
						array[array.length-1]= 0;
					}
				}
				
				
			}	
			System.out.print("\nAgain? y/n: ");
			again = input.next().charAt(0);
		}
	}
}
