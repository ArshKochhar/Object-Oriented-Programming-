//Arsh Kochhar - 20104779

package guessmaster2;


public class Country extends Entity {
	
	
		private String capital; //initializing instance Variable
		

		
		//Constructor for String type 
		public Country(String name, String dateString, String capital, double difficulty) {
			super(name, dateString,difficulty);
			this.capital = capital;
		}
		
		//Constructor for Date type
		public Country(String name, Date dateOfBirth, String capital, double difficulty) {
			super(name, dateOfBirth,difficulty);
			this.capital = capital;
		}
		
		//Copy Constructor
		public Country(Country country) {
			super(country);
			this.capital = country.capital;
		}
		//Accessors and Mutators for Country's Capital 
		public String getCapital() {
			return capital;
		}
		public void setCapital(String capital) {
			this.capital = capital;
		}
		//Abstract Clone method
		public Country clone() {
			return new Country(this);
		}
		//toString function that calls the parent class's toString function
		public String toString() {
			return super.toString()+"Capital: "+getCapital()+"\n";
		}
		//Abstract entityType method. Gives details about the type of derived entity - Notice the '!' punctuation mark to help TA
		public String entityType() {
			return "This entity is a country!";
		}
	
	

}
