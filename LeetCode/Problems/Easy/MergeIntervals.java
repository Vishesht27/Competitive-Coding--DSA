class Solution {
    public int[][] merge(int[][] nums) {

        // custom sort
        Comparator<int[]> comp = new Comparator<>(){
            @Override
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
            }
        };

        // sort on the basis of starting point
        Arrays.sort(nums, comp);
        int n = nums.length;

        // take two pointers (start and end of a pair)
        // the idea is to keep updating our pointers
		// and add the resultant pair whenever necessary
        int start = nums[0][0];
        int end = nums[0][1];

        ArrayList<int[]> ans = new ArrayList<>();
        for(int i = 1; i < n; i++){

            // no overlap condition (means we need to add a new pair
			// with previous start and end in our ans)
            if(nums[i][0] > end){
                ans.add(new int[]{start, end});
                start = nums[i][0];
                end = nums[i][1];
            }

            // overlap condition (update the end pointer)
            else if(nums[i][1] >= end){
                end = nums[i][1];
            }
        }

        // final pair
        ans.add(new int[]{start, end});

        return ans.toArray(new int[ans.size()][]);

    }
}
