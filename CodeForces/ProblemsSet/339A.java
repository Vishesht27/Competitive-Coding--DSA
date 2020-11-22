import java.util.*;
import java.lang.*;
import java.io.*;

public class HelpfulMaths339A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] nums = new int[(s.length()/2)+1];
		int index = 0;

		// Get actual numbers
		for (char c : s.toCharArray()) {
			if (c != '+') {
				nums[index] = Character.getNumericValue(c);
				index++;
			}
		}

		// Sort in non-decreasing order
		Arrays.sort(nums);

		// Output nums
		for (int i = 0; i < nums.length-1; i++) {
			System.out.print(nums[i]+"+");
		}
		System.out.print(nums[nums.length-1]);
	}
}
