package com.twostringmethod;

class Student{
	String name;
	int age;
	 String gender;
	 
	 public Student(String name, int age , String gender) {
		 this.name=name;
		 this.age=age;
		 this.gender=gender; 
	 }
	 
	 String getName() {
		 return name;
	 }
	 int getAge() {
		 return age;
	 }
	String getGender() {
		return gender;
	}
	public String toString() {
		return name + " " + age+" "+gender;
	}
}


public class StudentApp0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("anurag", 21, "male");
		
		System.out.println(s1.toString());
	}

}
