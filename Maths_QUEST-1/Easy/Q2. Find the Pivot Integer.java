// TC: O(N)
class Solution {
    public int pivotInteger(int n) {
        int totalSum = n * (n + 1) / 2;
        int leftSum = 0;

        for (int i = 1; i <= n; i++) {
            leftSum += i;

            int rightSum = totalSum - leftSum + i;

            if (leftSum == rightSum)  return i;
        }
        return -1;
    }
}

// TC: O(1)
class Solution {
    public int pivotInteger(int n) {
        int total = n * (n + 1) / 2;
        int x = (int) Math.sqrt(total);

        return x * x == total ? x : -1;
    }
}

// TC: O(N*N)
class Solution {
    public int pivotInteger(int n) {
        for(int x=1; x<=n; x++) {
            int left = 0, right = 0;
            for(int i=1; i<=x; i++) {
                left+=i;
            }

            for(int j=x; j<=n; j++) {
                right+=j;
            }

            if(left == right) return x;
        }
        return -1;
    }
}

