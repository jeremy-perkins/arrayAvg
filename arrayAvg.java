package avgRect;

public class arrayAvg {
	
	public static double arrayAvg(int[] someArray) {
		double avg = 0;
		for(int i=0; i<someArray.length; ++i) {
			avg += someArray[i];
		}
		avg /= someArray.length;
		
		return avg;
	}
	
	public double arrayAvg(double[] someArray) {
		double avg = 0;
		for(int i=0; i<someArray.length; ++i) {
			avg += someArray[i];
		}
		avg /= someArray.length;
		
		return avg;
	}
	
	public static void main(String[] args) {
		int intArray[] = {4, 5, 8, 6, 2}; 
		int intArray2[] = {1, 2, 3, 4};
		int doubleArray[] = {5, 6, 9, 7, 3}; 
		int doubleArray2[] = {2, 3, 4, 5};
		
		System.out.println(arrayAvg(intArray));
		System.out.println(arrayAvg(intArray2));
		System.out.println(arrayAvg(doubleArray));
		System.out.println(arrayAvg(doubleArray2));
	}
}
