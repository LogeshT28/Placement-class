public class BinaerySearch {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,9,10};
        int target = 7;
        int left=0;
        int right = a.length-1;
        while(left <= right){
            int mid = left + (right -left)/2;
            if(a[mid] == target){
                System.out.println("yes");
                break;
            }
            else if(a[mid] > target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }


}
}
