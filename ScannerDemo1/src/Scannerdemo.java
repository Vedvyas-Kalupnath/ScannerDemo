/**
 * 
 */
import java.util.Scanner;
/**
 * @author Asus
 *
 */
public class Scannerdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyin = new Scanner(System.in);
		
		System.out.println("Enter the number of pods followed by the number of peas in a pod:");
		
		
		int numberOfPods = keyin.nextInt();
		int peasPerPod = keyin.nextInt();
		int totalNumberOfPeas = numberOfPods* peasPerPod;
		
		System.out.print(numberOfPods + " pods and ");
		System.out.println(peasPerPod + " peas per pod.");
		System.out.println("The total number of peas = "+ totalNumberOfPeas);
		
		keyin.close();
		
	
		

	}

}
