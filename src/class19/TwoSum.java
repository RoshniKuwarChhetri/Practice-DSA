package class19;

public class TwoSum {
	public static void main(String[] args) {
		int[] arr= {5,8,3,4,11,6,-3,-7,-4};
		
		System.out.println(twoSum(arr ,-7));
	}
	public static int[] twoSum(int[] nums, int target) {
        int []array=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
            if(i==j)
            continue;
            if(nums[i]+nums[j]==target){
                array[0]=i;
                array[1]=j;

                
            }
            }
        }
        return array;
    }
    
}
