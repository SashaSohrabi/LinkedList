/**
 * Calculate the distance between indexes 
 * of the smallest and the second smallest 
 * numbers in an array.
 * @author (S. Sohrabi)
 * @version (1.0)
 */

public class Main {
	public static void main(String[] args) 
    {
        int[] elements  = {23, 45, 34, 12, 45, 4, 38, 56, 2, 49, 100}; 
        int smallest = elements[0]; 
        int secondSmallest = elements[0]; 
        int p1 = 0;
        int p2 = 0;
        
        for (int i = 0; i < elements.length; i++)
        {

            if (elements[i] < smallest)
            {
                secondSmallest = smallest;
                p2 = p1;
                smallest = elements[i];
                p1 = i;

            }
        }
        int distance= p2-p1;
        System.out.println(distance);    
    }

}
