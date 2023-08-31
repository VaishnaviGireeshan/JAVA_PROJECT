package hashmapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SchoolMain {

	public static void main(String[] args) {

//		ArrayList<String> student = new ArrayList<String>();
//		student.add("Jon");
//		student.add("Sansa");
//		student.add("Rob");
//		student.add("Brandon");

		HashMap<Integer, String> teacher = new HashMap<>();
		teacher.put(202, "Catlyn");
		teacher.put(203, "Eddard");

		HashMap<Integer, ArrayList<String>> cat = new HashMap<>();
		ArrayList<String> catStudents = new ArrayList<>();
		catStudents.add("Jon");
		catStudents.add("Sansa");
		cat.put(202, catStudents);

		HashMap<Integer, ArrayList<String>> ed = new HashMap<>();
		ArrayList<String> edStudents = new ArrayList<>();
		edStudents.add("Rob");
		edStudents.add("Brandon");
		 ed.put(203, edStudents);

		System.out.println("Students of Catlyn:");
		ArrayList<String> catlynStudents = cat.get(202);
		for (String student : catlynStudents) {
			System.out.println(student);
		}

		System.out.println("\nStudents of Eddard:");
		ArrayList<String> eddardStudents = ed.get(203);
		for (String student : eddardStudents) {
			System.out.println(student);
		}

	}

}
