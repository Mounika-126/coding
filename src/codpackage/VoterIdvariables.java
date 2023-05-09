package codpackage;

public class VoterIdvariables {  ///eg of variable & methods & constructor
	
	String name;    //constructor:- constructor is similar to method  which don't have any return type. when ever we create an object it will create default
	                //constructor main advantage of constutor is to provide default values to the instance & static variable
	int age;
	String address;    // eg:- public SSN(){ default constructor it will provide deaflut values to the object
	String gender;        
                              //}
	public double generateVoterId(){            //eg:-  public SSN(String name,int age,String  gender,String address){//eg of paramerterised constructor
		
System.out.println("geneate voterid");             //this.name=name;
		                                                   //this.age=age;
		                                                   //this.address=address;
		                                                   //this.gender=gender;
		return Math.random();                          //}
		
	}
}
