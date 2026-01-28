class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int max = 500;
        Queue<Integer> q = new LinkedList<>();
        
        for(int i:students) q.add(i);

        int idx = 0;
        while (!q.isEmpty() && max>0) {
            int var = q.peek();
            if (var != sandwiches[idx]) {
                q.add(q.poll());
            }
            else {
                q.poll();
                idx++;
            }
            max--;
        }

        return q.size();
    }
}
