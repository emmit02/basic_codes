Problem statement
School is organizing a team contest. You are given an array ‘SKILL’ containing the skill level of ‘N’ candidates.



Two candidates(having index ‘i’ and ‘j’) can pair up to form a team if for index i < j, SKILL[i] > 2*SKILL[j].

Your task is the return the count of all the possible pairs to take part in the contest.



Example:
Input: ‘N’ = 5
‘SKILL’ = [4, 1, 2, 3, 1] 

Output: 3



//solution



import java.util.*;
public class Team {
    private static void merge(int[] skill, int low, int mid, int high) 
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int l = low;
        int r = mid + 1;  
        
        while (l <= mid && r <= high) 
        {
            if (skill[l] <= skill[r]) 
            {
                temp.add(skill[l]);
                l++;
            } 
            else 
            {
                temp.add(skill[r]);
                r++;
            }
        }

        while (l <= mid) 
        {
            temp.add(skill[l]);
            l++;
        }

        while (r <= high) 
        {
            temp.add(skill[r]);
            r++;
        }

        for (int i = low; i <= high; i++) 
        {
            skill[i] = temp.get(i - low);
        }
    }

    public static int countPairs(int[] skill, int low, int mid, int high) 
    {
        int r = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) 
        {
            while (r <= high && skill[i] > 2 * skill[r])
            {
                 r++;
            }
            cnt += (r - (mid + 1));
        }
        return cnt;
    }

    public static int mergeSort(int[] skill, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2 ;
        cnt += mergeSort(skill, low, mid); 
        cnt += mergeSort(skill, mid + 1, high);
        cnt += countPairs(skill, low, mid, high);
        merge(skill, low, mid, high);  
        return cnt;
    }

    public static int team(int[] skill, int n) {
        return mergeSort(skill, 0, n - 1);
    }
}