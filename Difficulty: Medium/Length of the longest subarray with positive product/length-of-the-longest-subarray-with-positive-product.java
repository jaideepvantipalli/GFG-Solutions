// User function Template for Java

class Solution {
    /* Function to return the length of the
       longest subarray with ppositive product */
    int maxLength(int arr[], int n) {
        // code here
    int Pos = 0;
    int Neg = 0;
    int res = 0;

    for (int i = 0; i < n; i++) 
    {
        if (arr[i] == 0) 
        {
            Pos = Neg = 0;
        }
        else if (arr[i] > 0) 
        {
            Pos += 1;

            // If at least one element is
            // present in the subarray with
            // negative product
            if (Neg != 0) 
            {
                Neg += 1;
            }
            res = Math.max(res, Pos);
        }
        else 
        {
            Pos = Pos + Neg;
            Neg = Pos - Neg;
            Pos = Pos - Neg;

            // Increment the length of subarray
            // with negative product
            Neg += 1;
            // If at least one element is present
            // in the subarray with positive product
            if (Pos != 0) 
            {
                Pos += 1;
            }
            res = Math.max(res, Pos);
        }
    }
    return res;
    }
}