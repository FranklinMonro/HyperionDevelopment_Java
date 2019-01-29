class Animalt {//create class of teacher
	//Attributes
	int numTeeth;//create variable attribute
	boolean spots;//create variable attribute
	static int weight;//create variable attribute
	
	
	//method
	
	void Animalt(int numTeeth, boolean spots, int weight)//creating of constructor
	{
		this.numTeeth = numTeeth;//refer to current object name
		this.spots = spots;//refer to current object subject
		this.weight = weight;//refer to current object grade
		
	}
	
	public String toString()//create of constructor
	{
		String output = "Number of teeth: " + numTeeth;//output of the name constructor when use
		output += "\nDo animal have spots: " + spots;//output of the subject constructor when use
		output += "\nWhat is the weight of animal: " + weight;//output of the grade constructor when use
		
		return output;//return the output to class
	}
	
}

class Lion extends Animalt//create sub class with super class
{
	
	
	String coat;//create variable attribute
	String result = cub(weight);//create variable attribute
	String cub = result;//create variable attribute
	String resFem = female(weight);//create variable attribute
	String sex = resFem;//create variable attribute
	
	void Animalt(int numTeeth, boolean spots, int weight,String coat)//creating of constructor
	{
		this.numTeeth = numTeeth;//refer to current object
		this.spots = spots;//refer to current object 
		this.weight = weight;//refer to current object 
		this.coat = coat;//refer to current object 
	}
	
	public String toString()//create of constructor
	{
		String output = "Number of teeth: " + numTeeth;//output of the constructor when use
		output += "\nDo animal have spots: " + spots;//output of the constructor when use
		output += "\nThe weight of the animal is: " + weight;//output of the constructor when use
		output += "\nIs this a cub: " + cub;//output of the constructor when use
		output += "\nThe sex of the lion is: " + sex;//output of the constructor when use
		output += "\nThe Colour of the coat of the lion is : " + coat;//output of the constructor when use
		return output;//return the output to class
	}
	public String cub(int weight) // create if statement for telling if cub or not
	{

	boolean cub = false;
	String result= "";
	
	if (weight > 80)
	{
		cub = true;
	}	
	if (cub == true)
	{
	result ="This is a cub";
			
	}
	else
	result = "This is not a cub";

	return result;
	}
	
	public String female(int weight) // create if statement for telling if female or not
	{
		
	boolean female = false;
	String resFem= "";
	
	if (weight > 120)
	{
		female = true;
	}	
	if (female == true)
	{
	resFem ="This is a female";
			
	}
	else
	resFem = "This is a male";
	
	return resFem;
	
	}
	
}

class Cheetah extends Animalt//create sub class with super class
{
	String sex;//create variable attribute
	
	void Animalt(int numTeeth, boolean spots, int weight, String sex)//creating of constructor
	{
		this.numTeeth = numTeeth;//refer to current object 
		this.spots = spots;//refer to current object 
		this.weight = weight;//refer to current object 
		this.sex = sex;//refer to current object 
		
	}
	
	public String toString()//create of constructor
	{
		String output = "Number of teeth: " + numTeeth;//output of the constructor when use
		output += "\nDo animal have spots: " + spots;//output of the constructor when use
		output += "\nThe weight of the animal is: " + weight;//output of the constructor when use
		output += "\nThe sex of the Cheetah is: " + sex;//output of the constructor when use
		
		return output;//return the output to class
	}
	
	 void setWeight(int weight)//create setter
	{
		this.weight =  weight;//use of weight as setter
	}
	
	int getWeight()//create getter
	{
		return weight;//return of getter
	}
}
public class Animal
{
	public static void main(String[] args)
	{
		Lion joe = new Lion();
		joe.Animalt(25, false, 85, "Gold");
		System.out.println(joe);
		System.out.println();
		Cheetah mike = new Cheetah();
		mike.Animalt(30, true, 90, "Male");
		System.out.println(mike);
	}
	
}
