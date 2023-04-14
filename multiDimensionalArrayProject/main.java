package multiDimensionalArrayProject;

public class main {

	public static void main(String[] args) {
		String[][] cities = new String[3][3];
		
		cities[0][0] = "Teksas";
		cities[0][1] = "Dallas";
		cities[0][2] = "Houston";
		cities[1][0] = "Florida";
		cities[1][1] = "Tampa";
		cities[1][2] = "Orlando";
		cities[2][0] = "California";
		cities[2][1] = "San Francisco";
		cities[2][2] = "Los Angeles";
		
		for(int i=0; i<=2; i++)
		{
			System.out.println("----------------------");
			
			for(int j=0; j<=2; j++)
			{
				System.out.println(cities[i][j]);
			}
		}
	}

}
