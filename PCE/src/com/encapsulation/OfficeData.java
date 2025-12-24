package com.encapsulation;
class Emplyoee{
	private String name;
	private int id ,salary;
	
    public Emplyoee (String n , int i , int s) {
    		name=n;
    		id=i;
    		salary=s;
	}
    
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getSalary() {
		return salary;
	}
}


public class OfficeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emplyoee s1 = new Emplyoee("anurag",78348,5000);
		System.out.println(" your name : " + s1.getName());
		System.out.println("your Id : "+ s1.getId());
		System.out.println("Enter Salary  : "+ s1.getSalary());
	}

}
