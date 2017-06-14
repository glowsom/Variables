
public class Duck_Family {

	public static void main(String[] args) {
		// TODO Differentiating between instance and class variables
		
		Duck_Family Donald = new Duck_Family(2,5);
		System.out.println(Donald.duckWives);
		System.out.println(Donald.duckSum);

	}
	
	
	
	static int duckSum = 0;
	int duckWives;
	int ducklings;
	
	Duck_Family( int duckWives, int ducklings){
		duckSum += (ducklings + duckWives + 1);
		this.duckWives = duckWives;
		this.ducklings = duckWives;
	}
	

}
