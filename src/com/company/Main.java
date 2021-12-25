package com.company;

public class Main {

    public static void main(String[] args) {
	    int input = 1041; //32;
	    System.out.println(new Main().solution(input));
    }

	public int solution(final int N) {
		byte maxGap = 0;
		byte gap = 0;
		for (int i = 1; i < Integer.MAX_VALUE && i>0; i = i << 1) {
//			if (i> Integer.MAX_VALUE/2) {
//				int a = 1;
//			}

			int res = N & i;
			if (res>0) {
				if (gap==0)
					gap = 1;
				else { // gap > 0
					if (maxGap < gap)
						maxGap = gap;
					gap = 0;
				}
			}
			else // res == 0
				if (gap>0)
					gap++;
				else
				if (maxGap>0)
					gap = 2;
		}

		return maxGap>0 ? maxGap-1 : 0;
	}
}
