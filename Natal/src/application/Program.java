package application;

public class Program {

	public static void main(String[] args) {

		int row, column, size;
		
		size = 6;
		
		for(row = 1; row <= 6; row++) {
			for(column = 1; column <= 10; column++) {
				if(column == size) {
					for(int row2 = 1; row2 <= size; row2++) {
						System.out.print("*");
					}
					size = size + 2;
					size --;
				} else {
					System.out.print(" ");
				}
				System.out.println();
			}
			
		}

	}

}
