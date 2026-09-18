package dsa.others;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class RangesIncluded {

	public static void main(String[] args) {
		int[][] arr= {{1,6},{2,3},{0,5},{1,3}};
		SortedSet<Integer> set =
		        new TreeSet<>(Comparator.reverseOrder());
		set.subSet(20, 30);
		set.tailSet(20);
		System.out.println(set.comparator());
		
		for(int i=0;i<arr.length;i++) {
			int start=arr[i][0];
			int end=arr[i][1];
			boolean flag=false;
			for(int j=0;j<arr.length;j++) {
				int oStart=arr[j][0];
				int oEnd=arr[j][1];
				if(i!=j) continue;
				if(start<=oStart&& end<=oEnd) {
					flag=true;
					break;
				}
			}
			if(flag) System.out.println("1");
			else System.out.println("0");
		}
	}

}
