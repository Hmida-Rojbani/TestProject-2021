package feature;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TestTri {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,4,3,5,2,6,9,8,7);
		
		Collections.sort(list, Comparator.reverseOrder());
		
		list.sort(Comparator.naturalOrder());
		
		System.out.println(list);
	}

}

class InvOrd implements Comparator<Integer>{

	@Override
	public int compare(Integer a, Integer b) {
		return b - a;
	}
	
}
