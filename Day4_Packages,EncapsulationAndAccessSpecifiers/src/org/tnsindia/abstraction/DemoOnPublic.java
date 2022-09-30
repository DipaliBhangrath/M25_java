package org.tnsindia.abstraction;


	
		class B
		{
			//if any data members is public the visibility is in any class
			public String dob="03-04-2000";
			public void display()
			{
				System.out.println("The DOB is: "+dob);
			}
		}
		public class DemoOnPublic {

			public static void main(String[] args) {
				B b=new B();
				b.display();

			}

		}

	


