import java.io.*;
class ConsecutiveOne
{   
    public static void main(String [] args)throws IOException
    {
        int nums[] = {1,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,1,1,1};
        Solution s = new Solution();
        System.out.println("The number of consecutive ones in the array (is)/(are): " +s.findMaxConsecutiveOnes(nums));
    }
}