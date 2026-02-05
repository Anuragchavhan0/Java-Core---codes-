package com.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

class Student10{
	String name;
	int id;
	int age;
	String email;
	String gender;
	int weight;
	int height ;
	char bloodGroup;
	int marks;
	int sem;
	String status ;
	String adress;
	
	public Student10(String name, int id, int age, String email, String gender, int weight, int height,
			char bloodGroup, int marks, int sem, String status, String adress) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.email = email;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.bloodGroup = bloodGroup;
		this.marks = marks;
		this.sem = sem;
		this.status = status;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public char getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(char bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Student10 [name=" + name + ", id=" + id + ", age=" + age + ", email=" + email + ", gender=" + gender
				+ ", weight=" + weight + ", height=" + height + ", bloodGroup=" + bloodGroup + ", marks=" + marks
				+ ", sem=" + sem + ", status=" + status + ", adress=" + adress + "]";
	}
	
	
	
}
public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student10 s1 = new Student10("anurag", 101, 21, "anu@gmail.com", "male", 50, 170,'B',534,7,"unmarried","unnmaried");
		Student10 s2 = new Student10("ag", 102, 21, "anufbfjfail.com", "male", 50, 170,'B',534,7,"unmarried","unnmaried");
		Student10 s3 = new Student10("hhfag", 103, 21, "anudjjf@gmail.com", "male", 50, 170,'B',534,7,"unmarried","unnmaried");
		Student10 s4 = new Student10("fhfhrag", 104, 21, "andju@gmail.com", "male", 50, 170,'B',534,7,"unmarried","unnmaried");
		Student10 s5 = new Student10("ddnag", 105, 21, "anu@gnjfmail.com", "male", 50, 170,'B',534,7,"unmarried","unnmaried");

		TreeMap hs = new TreeMap();
		hs.put(101, s1);
		hs.put(102, s2);
		hs.put(103, s3);
		hs.put(104, s4);
		hs.put(105, s5);
		
		System.out.println(hs);
	}

}
