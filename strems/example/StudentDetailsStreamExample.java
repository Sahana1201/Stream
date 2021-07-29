package www.xworkz.strems.example;

import java.util.Arrays;
import java.util.Collection;

import java.util.stream.Collectors;

public class StudentDetailsStreamExample {

	public static void main(String[] args) {

		Collection<String> name = Arrays.asList("Sahana", "Prajwal", "Teju", "Anusha", "Harsha", "Dhanya", "Sowmya");
		Collection<String> nameMatch = name.stream().filter((a) -> a.startsWith("S")).collect(Collectors.toSet());
		System.out.println(nameMatch);

		Collection<String> name1 = name.stream().sorted().collect(Collectors.toList());
		System.out.println(name1);

		System.out.println("\n##################################################\n");

		Collection<String> branch = Arrays.asList("CS", "EC", "IS", "EC", "EEE", "MECH");
		Collection<String> branchMatch = branch.stream().filter((a) -> a.contains("E")).collect(Collectors.toSet());
		System.out.println(branchMatch);

		System.out.println("\n##################################################\n");

		Collection<String> sem = Arrays.asList("First", "Second", "Third", "Fourth", "Fifth", "Sixith");
		Collection<String> semMatch = sem.stream().filter((a) -> a.endsWith("h")).collect(Collectors.toSet());
		System.out.println(semMatch);
	}

}
