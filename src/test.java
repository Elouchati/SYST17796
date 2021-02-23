/*
 * Abou Bakr Adil Ouchtati 
 */
public class test {

	public static void main(String[] args) {

	int temps[]  = new int [14];
	
		temps [0]=-1; temps [7]=17;
		temps [1]=-18; temps [8]=-55;
		temps [2]=60; temps [9]=10;
		temps [3]=-7; temps [10]=0;
		temps [4]=1; temps [11]=8;
		temps [5]=4; temps [12]=2;
		temps [6]=-2; temps [13]=2;
		
		
		Weather b= new Weather ();
		System.out.print("The average value is ");
		System.out.println(String.format("%.2f ", b.calcAvg(temps)));
		System.out.println("The maximum value is "+b.calcMax(temps));
		
	}
}
