package com.csi.protectedmodifier;

import com.csi.accessmodifier.StudentDetails;

public class ProtectedMod extends StudentDetails{
	public static void main(String[] args) {
			StudentDetails sd=new StudentDetails();
			System.out.println("Student Name: "+sd.studentName);
	}
}
