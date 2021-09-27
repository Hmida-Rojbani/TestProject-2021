package feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestLam {

	public static void print(List<Integer> list, Cond condition) {
		for (Integer i : list) {
			if (condition.test(i)) {
				System.out.print(i + " | ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 3,4, 5, 2, 6, 9, 8, 7);
		Predicate<Integer> p = i -> i % 2 == 0 ;
		list.stream()
			.filter(p)
			.sorted()
			.distinct()
			.forEach(i -> System.out.println(i));
		
		// print(list, new EvenCond());

//		print(list, new Cond() {
//
//			@Override
//			public boolean test(Integer i) {
//				return i % 2 != 0;
//			}
//		});
//
//		print(list, (Integer i) -> {
//				return i % 2 != 0;
//			});
//		
//		print(list, i -> i % 2 != 0);
	}
}

interface Cond {
	boolean test(Integer i);
}

class EvenCond implements Cond {

	@Override
	public boolean test(Integer i) {
		return i % 2 == 0;
	}

}
