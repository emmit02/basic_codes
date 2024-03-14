Problem statement
Given an array ‘Arr’ that has ‘N’ elements. You have to find the subarray of ‘Arr’ that has the largest product. You must return the product of the subarray with the maximum product.



For example:
When ‘N’ = 5, and ‘Arr’ = {-2, 3, -4, 0}
The subarrays of ‘Arr’ are:
{-2}, {-2, 3}, {-2, 3, -4}, {-2, 3, -4, 0}, {3}, {3, -4}, {3, -4, 0}, {-4}, {-4, 0}, {0}.
Among these, {-2, 3, -4} is the subarray having the maximum product equal to 24.
Hence, the answer is 24.



//solution 



public class SubarrayWithMaxProduct {
    public static int subarrayWithMaxProduct(int []arr){
        // Write your code here.
        int n = arr.length;
        int ans = Integer.MIN_VALUE;

        for(int i = 0; i < n; ++i){
            int currentProduct = 1;

            for(int j = i; j < n; ++j){
                currentProduct *= arr[j];
                ans = Math.max(ans, currentProduct);
            }
        }
        return ans;
    }
}