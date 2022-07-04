public class stringArray {
	public static void main(String[] args) {
		
		//declaring string array
		String[] arrayName = {"string", "string1","string2"};
		
		//double string
		double[] doubleArray;
		
//		for(int x=0;x<arrayName.length;x++) {
//			System.out.println(arrayName[x]);
//		}

		
		//multidimensional Array
		int[][] multiArray= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		
		int[][] newArray = new int[5][5];
		
		for(int x=0; x<multiArray.length;x++) {
			for(int i=0;i<multiArray[x].length;i++) {
				System.out.print(multiArray[x][i]+", ");
			}System.out.println();
		}
		
		String[][] multiString = {{"string", "string1","string2"},{"string 1","string 2","string3"}};
		
		for(int x=0;x<multiString.length;x++) {
			for(int i = 0; i<multiString[x].length;i++) {
				System.out.print("first index of array "+x);
				System.out.println("- second index of array"+i);
			}System.out.println();
		}
		
	}
}
