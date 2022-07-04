public class DeclaringArray {
	public static void main(String[] args) {
		
		//declaring an array
		int[] array;
		
		//creating an array
		array = new int[5];
		
		
		//declaring and creating an array
		int[] arrayName = new int[14];
		
		//0, 1, 2, 3, 4
		array[0] = 67;
		
		System.out.println(array[0]);
		
		//declaring and creating an array with values
		int[] newArray = {10,20,30,40,50};
						//0   1  2  3  4
		
		System.out.println(newArray[0]+", "+newArray[1]+","+newArray[2]+", "+newArray[3]+", "+newArray[4]);
		
		System.out.println();
		
		for(int x=0;x<newArray.length;x++) {
			System.out.println(newArray[x]);
		}
	}
}
