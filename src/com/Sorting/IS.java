package com.Sorting;

class IS {
	public static void main(String args[]) {

		int list[] = { 5,6,7,4,3 };
		int i;
		for (int j = 0; j < list.length; j++) {
			System.out.print(list[j] + " ");
		}
		System.out.println();
		int j;
		for (j = 1; j < list.length; j++) {

			int temp = list[j];
			i = j - 1;
			while ((i > -1) && (list[i] > temp)) {

				list[i + 1] = list[i];
				i--;for (int k = 0; k < list.length; k++)
					System.out.print(list[k] + " ");
				System.out.println();

			}
			list[i + 1] = temp;
			for (int k = 0; k < list.length; k++)
				System.out.print(list[k] + " ");
			System.out.println();
		}

	}
}