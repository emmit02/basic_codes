Problem statement
You are given an array ‘NUMS’ of length ‘N’. You are also given an integer ‘TARGET’.



Return an array of all the unique quadruplets [ ‘NUMS[ a ]’, ‘NUMS[ b ]’, ‘NUMS[ c ]’, ‘NUMS[ d ]’ ] with the following conditions:



i. 0 <= a, b, c, d < ‘N’ and a, b, c, and d are distinct.

ii. NUMS[ a ] + NUMS[ b ] + NUMS[ c ] +NUMS[ d ] = TARGET



Return the array in any order.


//solution


import java.util.*;
public class FourSum {
    public static List<List<Integer>> fourSum(int []nums, int target) {
        // Write your code here.
        int n=nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<n;i++) 
        {
            if (i > 0 && nums[i] == nums[i - 1]) 
            {
                continue;
            }
            for (int j=i+1;j<n;j++) 
            {
                if (j > i + 1 && nums[j] == nums[j - 1]) 
                {
                    continue;
                }
                int k = j + 1;
                int l = n - 1;
                while (k < l) 
                {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if (sum == target) 
                    {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;

                        while (k < l && nums[k] == nums[k - 1]) 
                        {
                            k++;
                        }
                        while (k < l && nums[l] == nums[l + 1]) 
                        {
                            l--;
                        }
                    } 
                    else if (sum < target) 
                    {
                        k++;
                    }
                    else 
                    {
                        l--;
                    }
                }
            }
        }

        return ans;
    }
}