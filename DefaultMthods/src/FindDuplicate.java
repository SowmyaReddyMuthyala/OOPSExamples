import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

 
public class FindDuplicate {
public static void main(String[] args) {
	 Animal dog = new Dog();
     Animal cat = new Cat();
     
     dog.makeSound(); // Output: Woof woof!
     cat.makeSound(); // Output: Meow!
 }
}



//	
//	List<List<Integer>> listOfLists = Arrays.asList(
//            Arrays.asList(1, 2, 4),
//            Arrays.asList(4, 8, 6),
//            Arrays.asList(7, 8, 9)
//    );
//	
//	List<Integer> flattenedList = listOfLists.stream()
//            .flatMap(List::stream)
//            .collect(Collectors.toList());
//	//using set interface
//	Set<Integer> set=new HashSet<>();
//	Set<Integer> elements=flattenedList.stream().filter(s->!set.add(s)).collect(Collectors.toSet());
//	System.out.println(elements+"elements");
	
	
	
	
	
	
	
//	
//	flattenedList.stream().limit(6).distinct().forEach(System.out::println);
//	
//	//int sum=flattenedList.stream().collect(Collectors.summingInt(x->x));
//	//System.out.println(flattenedList+"--"+sum );
//	Set<Integer> ds=new HashSet<>();
//	//using map interface
//    Map<Integer, Long> occurrences = flattenedList.stream()
//            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//    System.out.println(occurrences+"--");
//
//    // Filter entries with count greater than 1 (duplicates)
//    Map<Integer, Long> duplicates = occurrences.entrySet().stream()
//            .filter(entry -> entry.getValue() > 1)
//            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//    
//
//    // Print the duplicates90
//    System.out.println("Duplicate Numbers: " + duplicates.keySet());
//    
//    
//    //using collection class, frequency method
	
	
	
//	        String str1 = "Hello";
//	        String s=new String("Hello");
//	        System.out.println(str1.hashCode()+" "+s.hashCode()); 
//	         
//	             
//	        
//	        String str2 = str1.concat(" World"); // Concatenation returns a new string
//	        System.out.println("str1: " + str1+" "+str1.hashCode()); // Output: str1: Hello
//	        System.out.println("str2: " + str2+" "+str2.hashCode()); // Output: str2: Hello World
//	  
	
	
	
	
	
	
	// Superclass
	class Animal {
	    public void makeSound() {
	        System.out.println("Some generic sound");
	    }
	}

	// Subclass
	class Dog extends Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("Woof woof!");
	    }
	}

	// Subclass
	class Cat extends Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("Meow!");
	    }
	}


