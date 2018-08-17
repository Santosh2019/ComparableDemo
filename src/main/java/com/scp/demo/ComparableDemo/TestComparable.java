package com.scp.demo.ComparableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestComparable {

	public static void main(String[] args) {
		
	Student student1=new Student(1001, "Santosh","Pune");
	Student student2=new Student(1002, "Sachin","Gazibad");
	Student student3=new Student(1003, "ShivRaj","Ahmedpur");
	Student student4=new Student(1004, "Uttam","Latur");
	Student student5=new Student(1005, "Sachin","Pune");
	Student student6=new Student(1006, "Anil","Zindabad");
	
	Set<Student>set=new HashSet<Student>();
	set.add(student1);
	set.add(student2);
	set.add(student3);
	set.add(student4);
	set.add(student5);
	set.add(student6);
	List<Student>studentlist=new ArrayList<Student>();
	studentlist.addAll(set);
	Collections.sort(studentlist, new ById());
	System.out.println("!-------------Sorted List ById----------!"+studentlist);
	Collections.sort(studentlist, new ByName());
	System.out.println("!-------------Sorted List is ByName----------!"+studentlist);
	Collections.sort(studentlist, new ByAdd());
	System.out.println("!-------------Sorted List is ByAdd----------!"+studentlist);
	
	
	
	
	}

}
























/*package com.scp.demo.ComparableDemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
public class demoComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc a5=new abc(100, "Santosh", "MH");
		abc aa = new abc(1, "Santosh", "MH");
		abc a1 = new abc(8, "Aahir", "MP");
		abc a2 = new abc(9, "tahir", "GT");
		abc a3 = new abc(7, "Zahir", "KA");
		abc a4 = new abc(10, "Shiv", "Ap");
		Set<abc> set = new HashSet<abc>();
		set.add(aa);
		set.add(a1);
		set.add(a2);
		set.add(a4);
		set.add(a3);
		set.add(a5);
		set.addAll(set);
		System.out.println(set);
		List<abc>list=new ArrayList<abc>(set);
		list.addAll(set);
		Collections.sort(list);
		//System.out.println("this is thel list"+list);
	}
}

@Getter
@Setter
@AllArgsConstructor
class abc implements Comparable<abc> {
	private int n;
	private String name;
	private String state;
	public abc() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\n Abc [n=" + n + ", name=" + name + ", state=" + state + "]";
	}
	public int compareTo(abc o) {
	// TODO Auto-generated method stub
	return o.getN()-o.getN();
	}
}

*/