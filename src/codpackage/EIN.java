package codpackage;


	public class EIN { //getters&Setters
		 private String name;
		private int zipcode;
		private String state;
		private String country;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getZipcode() {
			return zipcode;
		}

	public void setZipcode(int zipcode) {
			this.zipcode = zipcode;
		}

	public String getState() {
			return state;
		}
	public void setState(String state) {
			this.state = state;
		}

	public String getCountry() {
			return country;
		}

	public void setCountry(String country) {
			this.country = country;
		}

public double generatEINNumber(){
			System.out.println("generate EINNumber");
			return Math.random();
			
		}
		

	}



