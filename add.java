package training;

public class Preson {
	int age;
	String name;
	double height;
	double weight;
	String color;
	//methods
	public double getRunRate()
	{
	      double runRate=(height*weight)/age;
	      return runRate;
    }
}