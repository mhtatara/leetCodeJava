package test;
//import the class you will be using
import easy.RunningSumof1dArray;
//imports the classes needed for junit test.
import org.junit.jupiter.api.Test;
//imports the assertEquals needed for the test
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RunningSumof1dArrayTest {
    RunningSumof1dArray runningSumof1dArray = new RunningSumof1dArray();
    @Test
    void runningSumTest() {
        int[] nums = new int[] {1, 2, 3, 4};
        //every time you call a class you need to call an instance of that class
        //and store the values inside a proper variable.
        int[] returnedValues = runningSumof1dArray.runningSum(nums);
        //here we type out the class name and call the method of the class
        //then we pass in the test case variable
        int[] actualValues = new int[] {1,3,6,10};
        //we define what the output should be in another sample variable
        assertArrayEquals(actualValues, returnedValues);
        //assertEquals checks if the two variables passed in are equal. one being
        //the test case and one being the expected output.
    }
}