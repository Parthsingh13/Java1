import java.util.List;
import java.util.LinkedList;
class Test{
	public static void main(String[] args){
		
		List<String> cities=new LinkedList<String>();

		//Adding cities
		cities.add("Milan");
		cities.add("venice");
		cities.add("Munich");
		cities.add("Vienna");

		//Displaying elements
		System.out.println(cities);

		//Inserting elements
		cities.add(3,"Progue");
		System.out.println(cities);

		//Removing Elements
		cities.remove("Munich");

		//Replacing elements
		cities.set(2,"Berlin");
		System.out.println(cities);

		//Displaying size
		System.out.println(cities.size());

		//Checking if an element is present
		System.out.println(cities.contains("Paris"));

		//Getting elements at specific position
		System.out.println(cities.get(0));

		//Clearing the elements from the LinkedList
		cities.clear();
		System.out.println(cities);
	}
}
