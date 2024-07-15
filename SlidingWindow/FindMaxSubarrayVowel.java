class FindMaxSubarrayVowel{
    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static int maxVowelsSubarray(String s,int k){
        int max=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                max++;
            }
        }
        int curr=max;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                curr++;
            }
            if(isVowel(s.charAt(i-k))){
                curr--;
            }
            max= Math.max(curr,max);
        }

        return max;

    }
    public static void main(String[] args) {
            String s = "abciiidef";
            int k = 3;
            System.out.println("Maximum number of vowels in subarray of size " + k + " is: " + maxVowelsSubarray(s, k));

    }
}