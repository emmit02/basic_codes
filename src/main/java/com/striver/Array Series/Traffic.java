Problem statement
The Road Department is planning to make some new traffic regulations. But to make the regulations they need to analyze the current situation of the traffic.



The traffic can be analyzed from an array 'VEHICLE' of length 'N' , which consists of ‘0’ if there is no vehicle at that point and ‘1’ if there is a vehicle at the point.



Unfortunately the array ‘VEHICLE’ got corrupted as at most 'M' '1' got flipped to ‘0’.



Traffic jam is defined as the length of consecutive vehicles on the road.



The Road Department wants to know the worst possible scenario for the traffic jam. Return the maximum possible length of the consecutive vehicles.



Example:
Input: ‘N’ = 3, ‘M’ = 1, VEHICLE’ = [0, 1, 1]

Output: 3


//

public class Traffic {
    public static int traffic(int n, int m, int []vehicle) {
        // Write your code here.
         int ans = 0, count = 0, right = 0 ;
        for(int left = 0; left < n; left++)
        {
            while(right < n && count <= m)
            {
                if(vehicle[right] == 0)
                {
                    count++ ;
                    if(count > m)
                    {
                        count-- ;
                        break ;
                    }
                }
                right++ ;
            }
            ans = Math.max(ans, right - left) ;
            if(vehicle[left] == 0)
            {
                count-- ;
            }
        }
        return ans ;
    }
}