package com.csi.accessmodifier;

public class FinalConcept {
	final	String studentname="Siya";
		public static void main(String[] args) {
			
			FinalConcept fc=new FinalConcept();
			fc.show();
		}
		void show(){
//			studentname="Pooja";
			System.out.println("Student Name: "+studentname);
		}
}
