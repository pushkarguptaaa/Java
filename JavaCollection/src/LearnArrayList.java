import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
	public static void main(String[] args) {
		ArrayList<String> studentsName = new ArrayList<>();
		studentsName.add("Pushkar");
		studentsName.add("Anu");
//		System.out.println(studentsName);
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(10);
//		System.out.println(numbers);
		numbers.add(1,15);
//		System.out.println(numbers);
		
		List<Integer> numbers1 = new ArrayList<>();
		numbers1.add(50);
		numbers1.add(100);
		numbers.addAll(numbers1);
		System.out.println(numbers);
		
//		System.out.println(numbers.get(1)); 
		
//		numbers.remove(2);
//		System.out.println(numbers);
//		numbers.remove(Integer.valueOf(50));
//		System.out.println(numbers);
//		numbers.clear();
//		System.out.println(numbers);
		
//		numbers.set(2, 100);
//		System.out.println(numbers);
//		
//		System.out.println(numbers.contains(15));
		
		//ITERATOR
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println("The element is " + numbers.get(i));
		}
		
		for (Integer integer : numbers) {
			System.out.println("foreach element is " + integer);
			
		}
		
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			System.out.println("iterator " + it.next());
		}
		
	}
}
