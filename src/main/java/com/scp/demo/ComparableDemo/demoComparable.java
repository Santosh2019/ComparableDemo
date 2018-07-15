package com.scp.demo.ComparableDemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class demoComparable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc aa=new abc(1,"Santosh","MH");
		abc a1=new abc(8,"Aahir","MP");
		abc a2=new abc(9,"tahir","GT");
		abc a3=new abc(7,"Zahir","KA");
		abc a4=new abc(10,"Shiv","Ap");
		TreeSet<abc>set=new TreeSet<abc>(new bcd());
		set.add(aa);
		set.add(a1);
		set.add(a2);
		set.add(a4);
		set.add(a3);
		System.out.println(set);
		//Collections.sort(set);
	}


}
@Getter@Setter@ToString
@AllArgsConstructor
class abc {//implements Comparable<abc>{
	private int n;
	private String name;
	private String state;
	public abc() {
		super();
		// TODO Auto-generated constructor stub
	}
//	
//	public int compareTo(abc o) {
//	// TODO Auto-generated method stub
//	return 0;//this.getName().compareTo(o.getName());
//	}
}
class bcd implements Comparator<abc>
{

	public int compareTo(abc o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int compare(abc o1, abc o2) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return 0;
	}
	
}