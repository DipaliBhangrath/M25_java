package org.tnsindia.abstractkeyword;

//main program
public class Executor {

	public static void main(String[] args) {
		Person p=new Employee("Dipali","Female",1021);
		Person p1=new Employee("abc","Male",0);
		System.out.println(p.toString());

		p.work();
		p1.work();
		p.changeName("Dips");
		System.out.println(p.toString());
		

		

	}

}