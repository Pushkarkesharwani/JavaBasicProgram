class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void solve(int i, int[] nums, List<Integer> curr){
        ans.add(new ArrayList<>(curr));
        for(int j = i; j < nums.length; j++){
            if(j > i && nums[j] == nums[j-1])
            continue;
            curr.add(nums[j]);
            solve(j + 1, nums, curr);
            curr.remove(curr.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        solve(0, nums, new ArrayList<>());
        return ans;
    }
}