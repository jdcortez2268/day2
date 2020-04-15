
public class TwoDimArray {

	public static void main(String[] args) {

		int maxNum = 0;
		int positionI = 0;
		int positionJ = 0;

		int[][] numbers = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] > maxNum) {
					maxNum = numbers[i][j];
					positionI = i;
					positionJ = j;
				}
			}
		}
	System.out.print("The max number was " + maxNum + " and the position was ");
	System.out.print("[" + positionI + "][" + positionJ + "]");
	
	}
}
