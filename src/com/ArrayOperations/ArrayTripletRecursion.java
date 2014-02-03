package com.ArrayOperations;

public class ArrayTripletRecursion {
	public static void find(int[] ary, int[] out, int level, int start) {
		for (int i = start; i < ary.length; i++) {
			out[level] = ary[i];
			if (level == 2) {
				if (out[0] + out[1] + out[2] == 14)
					System.out.println(out[0] + " " + out[1] + " " + out[2]);
			} else if (level < 2) {
				find(ary, out, level + 1, i + 1);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] ary = { 1,2,3,4,5,6,7,8,9,0,14,16,18,-4,-1,-2};
		int[] out = new int[3];
		find(ary, out, 0, 0);

	}
}
/*1 4 9
1 5 8
1 6 7
1 14 -1
2 3 9
2 4 8
2 5 7
2 14 -2
2 16 -4
3 4 7
3 5 6
4 14 -4
5 9 0
6 8 0
6 9 -1
7 8 -1
7 9 -2
0 16 -2
0 18 -4
*/