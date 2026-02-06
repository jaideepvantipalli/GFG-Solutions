class Solution {
    int[] smallestDiff(int a[], int b[], int c[]) {
        // write code here
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int res[]=new int[3];
        // Traverse three arrays from beginning
        int i = 0, j = 0, k = 0, diff = Integer.MAX_VALUE;
        int x = 0, y = 0, z = 0;  // Store result
        while (i < a.length && j < b.length && k < c.length) {
            int lo = Math.min(Math.min(a[i], b[j]), c[k]);
            int hi = Math.max(Math.max(a[i], b[j]), c[k]);

            if (diff > hi - lo) {
                diff = hi - lo;
                res[0]=a[i];
                res[1]=b[j];
                res[2]=c[k];
            }

            if (a[i] == lo) i++;
            else if (b[j] == lo) j++;
            else k++;
        }
        Arrays.sort(res);
        
        int temp=res[0];
        res[0]=res[2];
        res[2]=temp;
        
        return res;
    }
}
