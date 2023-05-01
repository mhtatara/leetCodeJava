package easy;
public class RunningSumof1dArray {
    //initialises new test array
    static int nums [] = new int[]{1,2,3,4};
    //?? why couldn't we pass in nums
    public static int[] runningSum(){
        //create an array, result, that is equal in length to nums
        int result [] = new int[nums.length];
        //this stores the sum
        int sum=0;
        //this for loop goes through the nums array
        for (int i = 0; i <= nums.length; i++){
            //this is equivalent to: sum = sum + num[i] which lets us
            //carry the prior sum value. 1+0, 1+2..
            sum += nums[i];
            //for every iteration, the value of sum is stored in result
            result[i] = sum;
            //prints every value of result
            System.out.println(result[i]);
        }
        return result;
    }

}
