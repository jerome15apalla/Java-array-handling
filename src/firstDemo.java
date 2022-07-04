import java.util.Scanner;

public class firstDemo {
	public static void main(String args[]) {
		Scanner key = new Scanner(System.in);
		int currentSize=0, removeIndex=0;
		int add, edit, delete;
		
		System.out.print("Array Size: ");
		int arraySize = key.nextInt();
		
		int[] array = new int[arraySize];
		
		System.out.println("Input Array Values:");
		
		for(int x=0; x<array.length;x++) {
			System.out.print("Value "+(x+1)+": ");
			array[x] = key.nextInt();
		}
		
		char again='y';
		while(again == 'y') {
		System.out.println(" ----------------");
		System.out.println("|  Array Menu    |");
		System.out.println("|----------------|");
		System.out.println("| [1] Add        |");
		System.out.println("| [2] Edit       |");
		System.out.println("| [3] Delete     |");
		System.out.println("| [4] Display    |");
		System.out.println(" ----------------");
		int menu = key.nextInt();
		
		switch(menu){
		case 1:
				System.out.println("Add to array: ");
				add = key.nextInt();
				break;
		case 2:
				System.out.println("edit: ");
				edit = key.nextInt();
				break;
		case 3:
				System.out.println("delete: ");
				delete = key.nextInt();
				for(int x=0; x<array.length;x++) {
					if(delete == array[x])
						removeIndex = x;
				}
				
				for(int i = removeIndex; i < array.length-1; i++){
			        array[i] = array[i + 1];
			      }
				array[array.length] = 0;
				
				break;
		case 4:
				System.out.print("Array [");
				for(int x=0; x<array.length;x++) {
					System.out.print(array[x]+", ");
				}
				System.out.println("]");
				break;
		default:
				System.out.println("Wrong entry - Try Again");
		}
			System.out.println("Again? y/n");
			again = key.next().charAt(0);
		}
	}
}
