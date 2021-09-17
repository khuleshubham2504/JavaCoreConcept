package com.csi.accessmodifier;

class Student {
	int stuId = 121;
	private String stuName = "Shubham";
	protected int stuAge=45;
}

public class CollegeDetails {
	public static void main(String[] args) {
		Student myObj= new Student();
		System.out.println("Student id: "+myObj.stuId+"\n Age: "+myObj.stuAge);
	}
}