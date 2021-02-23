/*
 * Abou Bakr Adil Ouchtati 
 */

public class Weather {

	// calcAvg this method will return the average of temps given in an array
	// ignoring temps up to 50 and under 50 
	//@temps the array input  
	public double calcAvg(int[] temps) 
	{
		double t=0;//T for the TOTAL temps
		double A ; //A for the Average 
		for (int i =0;i<14;i++) {
			if (temps[i]>-50 && temps[i]<50) {
				t=t+temps[i];
				}
			else i++;
		}
		return A=t/14;
		
	}
	/*
	 * calMax this method will return the max temps
	 */
	public int calcMax (int[] temps) {
		int max=temps[0] ;
		for (int i =0;i<temps.length;i++) {
			if (max < temps[i] )  max = temps[i] ; 
		}
		return max ; 
		
	}
	
}
