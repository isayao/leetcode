/*
Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/


public class TwoSum
{
    public static int[] twosum(int[] nums, int target)
    {
         int res[] = new int[2]; 
         for (int i=0; i<nums.length; i++)
         {
              for(int j=i+1; j<nums.length; j++)
              {
                   if (nums[i] + nums[j] == target)
                   {
                       /* res[0] = i;
                       res[1] = j;
                       return res;
                       */
                       return new int[] {i, j};
                   }

              }
         }
         // return res;
         throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String []args)
    {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        twosum(nums, target);
    }
}