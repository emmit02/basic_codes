Problem statement
Mr. X is a professional robber planning to rob houses along a street. Each house has a certain amount of money hidden.



All houses along this street are arranged in a circle. That means the first house is the neighbour of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses are broken into on the same night.



You are given an array/list of non-negative integers 'ARR' representing the amount of money of each house. Your task is to return the maximum amount of money Mr. X can rob tonight without alerting the police.




Note:
It is possible for Mr. X to rob the same amount of money by looting two different sets of houses. Just print the maximum possible robbed amount, irrespective of sets of houses robbed.

//solution


public class HouseRobberII {
    public static long houseRobber(int[] valueInHouse) {
           
        if (valueInHouse.length == 0) {
            return 0;
        }

        if (valueInHouse.length == 1) {
            return valueInHouse[0];
        }

        return Math.max(houseRobberUtil(valueInHouse, 0, valueInHouse.length - 1),
                   houseRobberUtil(valueInHouse, 1, valueInHouse.length));
       }

    public static long houseRobberUtil(int[] valueInHouse, int start, int end) {
           
        long[] valueAtIthHouse = new long[valueInHouse.length];

        // Check if the thief may steal the first house or not.
        if (start == 0) {
            valueAtIthHouse[0] = valueInHouse[0];
            valueAtIthHouse[1] = Math.max(valueInHouse[0], valueInHouse[1]);
        } 
       
        else {
            valueAtIthHouse[0] = 0;
            valueAtIthHouse[1] = valueInHouse[1];
        }

        for (int i = 2; i < end; i++) {
            valueAtIthHouse[i] = Math.max(valueAtIthHouse[i - 2] + valueInHouse[i], valueAtIthHouse[i - 1]);
        }
           
        return valueAtIthHouse[end - 1];
    }
}