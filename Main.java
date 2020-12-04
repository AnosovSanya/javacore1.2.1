import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		int[] array = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};

		for (int i : array) {
			if (i > 0 && i % 2 == 0) {
				intList.add(i);
			}
		}

		int[] pozArray = new int[intList.size()];
		for (int i = 0; i < pozArray.length; i++) {
			pozArray[i] = intList.get(i);
		}

		int count = 0;
		int buffer = 0;
		while (count < pozArray.length) {
			for (int i = 0, j = 1; (i < pozArray.length - 1 && j < pozArray.length); i++, j++) {
				if (pozArray[i] > pozArray[j]) {
					buffer = pozArray[i];
					pozArray[i] = pozArray[j];
					pozArray[j] = buffer;
				}
			}
			count++;
		}

		for (int g : pozArray) {
			System.out.println(g);
		}

	}
}

