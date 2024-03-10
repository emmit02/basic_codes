Ninja is playing with intervals. He has an array of intervals called ‘Arr’ having ‘N’ intervals.



However, he doesn’t like overlapping intervals. So you must help Ninja by merging all the overlapping intervals in ‘Arr’ and return an array of non-overlapping intervals.



Note:
Two intervals [L1, R1] and [L2, R2] such that L1 <= L2, are said to be overlapping if and only if L2 <= R1.


//solution


import java.util.ArrayList;
import java.util.List;

public class MergeOverlappingIntervals {
    public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){
        List< List< Integer > > ans = new ArrayList<>();
        int n = arr.length;

        for(int i = 0; i < n; ++i)
        {
            ans.add(new ArrayList<>());
            ans.get(ans.size() - 1).add(arr[i][0]);
            ans.get(ans.size() - 1).add(arr[i][1]);
            int Least = arr[i][0], Max = arr[i][1];

            for(List< Integer > interval : ans)
            {
                if(areOverlapping(interval, arr[i]))
                {
                    Least = Math.min(Least, interval.get(0));
                    Max = Math.max(Max, interval.get(1));
                }
            }

            for(List< Integer > interval : ans)
            {
                if(areOverlapping(interval, arr[i]))
                {
                    interval.set(0, Least);
                    interval.set(1, Max);
                }
            }
        }
        int p = 0;
        while(p < ans.size())
        {
            int frequency = 0;
            for(List < Integer > interval : ans)
            {
                if(interval.equals(ans.get(p)))
                    frequency++;
            }
            if(frequency > 1)
                ans.remove(p);
            else
                ++p;
        }
        return ans;
    }
    public static boolean areOverlapping(List< Integer > a, int []b){
        if(a.get(0) <= b[0])
            return b[0] <= a.get(1);
        return a.get(0) <= b[1];
    }
}