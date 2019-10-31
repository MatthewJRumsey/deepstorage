
/**
 * Write a description of class Prime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prime
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Prime
     */
    public Prime()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static boolean isPrime (int x)
    {
        // put your code here
        boolean prime = true;
        
        if(x < 2)
        {
            prime = false;
        }
        else if(x == 2)
        {
            prime = true;
        }
        else
        {
            int d = 2;
            
            while(d < x)
            {
                if(x % d == 0)
                {
                    prime = false;
                }
                
                d++;
            }
        }
        
        return prime;
    }
    
    public static boolean isMersennePrime (int x)
    {
        boolean mersennePrime = false;
        
        for(int d = 2; (d-1) <= x; d*=2)
        {
            if(x == (d-1))
            {
                mersennePrime = true;
            }
        }
        
        return mersennePrime;
    }
}
