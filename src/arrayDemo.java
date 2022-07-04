import java.util.Scanner;

public class arrayDemo {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		int [] array = {10,20,30,40,50};
		int search, edit, replace, delete, removeIndex = 0;
		char again='y';
		
		System.out.print("Array Values = ");
		for(int x=0; x<array.length;x++) {
			System.out.print(array[x]+", ");
		}
		
		while(again=='y') {
		System.out.println();
		System.out.println("[1] Display");
		System.out.println("[2] Search");
		System.out.println("[3] Edit");
		System.out.println("[4] Delete");
		int menu = input.nextInt();
		
		switch(menu) {
		case 1:
			System.out.print("Array Values = ");
			for(int x=0; x<array.length;x++) {
				System.out.print(array[x]+", ");
			}
			System.out.println();
			break;
		case 2:
			System.out.print("Search Value: ");
			search = input.nextInt();
			
			for(int x=0; x<array.length; x++) {
				if(search == array[x]) {
					System.out.println("Value is found at index "+x);
					break;
				}
			}
			break;
		case 3:
			System.out.print("Edit Value: ");
			edit = input.nextInt();
			System.out.print("Replace with: ");
			replace = input.nextInt();
			
			for(int x=0;x<array.length;x++) {
				if(edit == array[x]) {
					array[x]=replace;
				}
			}
			break;
		case 4:
			System.out.println("Delete Value: ");
			delete = input.nextInt();
			for(int x=0; x<array.length;x++) {
				if(delete == array[x])
					removeIndex = x;
			}
			
			for(int i = removeIndex; i < array.length-1; i++){
		        array[i] = array[i + 1];
		      }
			array[array.length] = 0;
			
			break;
			
		}
		System.out.print("Again? y/n : ");
		again =input.next().charAt(0);
		}
	}
}
