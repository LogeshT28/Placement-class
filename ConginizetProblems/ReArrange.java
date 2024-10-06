public class ReArrange {
    public static void main(String[] args) {
        int n = 8;
        int arr[] = {5,12,7,14,32,67,77,78};

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                i++;
                continue;
            }
            boolean flag = false;
            for(int j=i+1;j<n;j++){
                if(arr[i]%2 == 0){
                    int temp = arr[j];
                    for(int k=j;k>i;k--){
                        arr[k] = arr[k-1];
                    }
                    arr[i] = temp;  
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                break;
            }
            i++;
        }
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
