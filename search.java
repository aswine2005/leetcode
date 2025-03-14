public class search {
    public static void main(String[] args){
        int nums[]={1,3,5,7,8};
        int target=8;
        int result_linear=linearSearch(nums,target);
        int result_binary=binarySearch(nums,target);
        if(result_linear!=0 && result_binary!=0) {
            System.out.println("Linear Element Found at:" + result_linear);
            System.out.println("Binary Element Found at:" + result_binary);
        }
        else{
            System.out.print("Element Not Found!!");
        }
    }

    public static int linearSearch(int[] nums, int target) {
        int steps=0;
        for(int i=0;i<=nums.length-1;i++){
            steps=steps+1;
            if(nums[i]==target){
                System.out.println("Steps taken by Linear search:"+steps);
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int steps=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            steps=steps+1;
                if(nums[mid]==target){
                    System.out.println("Steps taken by Binary search:"+steps);
                    return mid;
                }
                else if(nums[mid]>target){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
        }
        return -1;
    }
}
