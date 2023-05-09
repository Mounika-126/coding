package codpackage;

public class VoterId {   

	public static void main(String[] args) {//(main method is staring point of any java application execution if we don't give static we need to
		                                    //create object for those method
 VoterIdvariables V =new VoterIdvariables();  //VoterIdvariables V =new VoterIdvariables("mona",10,"female","us"); assigning for parameterised constructoer
V.address = "US";
V.age = 10;
V.gender = "female";
V.name = "Mona";
		  
double 	V1	= V.generateVoterId();

EIN G = new EIN();
G.setCountry("india");
G.setName("tg");
G.setZipcode(109334);
G.setName("infosys");

 double G1=G.generatEINNumber();
 
 SSN S = new SSN();  
 S.address = "us";
 //S.age = 20;
 S.name ="Jhon";
 S.gender ="female";
 
 double S1=S.generateSSNId();
 S.address="us";
 S.gender="female";
 S.name="dany";
 
 
 //Tech T = new Tech();
 
//for student class(*static key word)
 //Employee.PI=10;
 Employee.ceo="jhon";
 Employee.display();
 Employee e = new Employee();
 e.age = 10;
 e.name="tony";
 System.out.println("employee name is"+e.name+"his ceo is"+Employee.ceo);
 Employee e1 = new Employee();
 e1.age = 20;
 e1.name= "komal";
 System.out.println("employee name is"+e1.name+"his ceo is"+Employee.ceo);
 
 Bike b = new Bike();
 b.Name = "Bugatti";
// b.display();
 b.display();
 
 
 //method overloading(complietime polymorphisum)
Laptop l = new Laptop();
l.add();
l.add(10, 20);
l.add(10, 20, 30);

//method overriding(runtime polymorphism)
Machine m = new Machine();
m.run();
Plane p = new Plane();
p.run();
p.run1();

Machine m1 = new Plane();
m1.run();



//for student class(*static key word)
//Student.pi=3.14;
Student.head="karan";
Student D= new Student();
D.name = "gouthami";
D.gender ="female";
D.rollnumber=1234;
D.play();

System.out.println("student name is"+D.name+"his head name"+Student.head);
Student D1 = new Student();
D1.name = "srini";
D1.gender ="female";
D1.rollnumber = 23454;
System.out.println("student name is"+D1.name +"his head name"+Student.head);

House H = new House();
H.run();


	}

}

