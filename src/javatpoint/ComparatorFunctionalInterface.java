package javatpoint;

import java.util.*;

public class ComparatorFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentsList = new ArrayList<Student>();
		studentsList.add(new Student(1,"Vijay",23));
		studentsList.add(new Student(3,"Ajay",25));
		studentsList.add(new Student(2,"Vimal",21));
		
		//print
		System.out.println("Before sorting:");
		studentsList.forEach(st -> System.out.println(st.getId()+"-"+st.getName()+"-"+st.getAge()));
		
		System.out.println("Sorting by Age:");
		Comparator cm1 = Comparator.comparing(Student::getAge);
		Collections.sort(studentsList,cm1);
		studentsList.forEach(st -> System.out.println(st.getId()+"-"+st.getName()+"-"+st.getAge()));
		
		System.out.println("Sorting by Age:");
		Comparator cm2 = Comparator.comparing(Student::getName);
		Collections.sort(studentsList,cm2);
		studentsList.forEach(st -> System.out.println(st.getId()+"-"+st.getName()+"-"+st.getAge()));
	}

}
