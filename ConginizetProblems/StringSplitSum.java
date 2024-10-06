/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class StringSplitSum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
// 		String str = sc.nextLine();
// 		int st = 0;
// 		int end = str.length() - 1;
// 		char[] ch = str.toCharArray();
// 		while(st < end)
// 		{
// 		    if(!(Character.isLetter(ch[st])))
// 		    {
// 		        st++;// 1 2 3 4 5
// 		        continue;
// 		    }
// 		    if(!(Character.isLetter(ch[end])))
// 		    {
// 		        end--;// 1 2 3 4 5
// 		        continue;
// 		    }
// 		    char temp = ch[st];
// 		    ch[st] = ch[end];
// 		    ch[end] = temp;
// 		    st++;
// 		    end--;
// 		}
// 		System.out.println(new String(ch));


        // String str = sc.nextLine();
        // char[] chstr = str.toCharArray();
        // // yum feed
        // int val = 0;
        // for(int i=str.length()-1 ;i>=0;i--)
        // {
        //     if(chstr[i] == ' ')
        //         val = 0;
        //     else{
        //         if(chstr[i] + val > 122)
        //         {
        //             chstr[i] = (char)((chstr[i] + val)- 26);
        //             val++;
        //         }
        //         else{
        //             chstr[i] = (char)(chstr[i] + val);
        //             val++;// 1 2 3 4
        //         }
        //     }
        // }
        // System.out.println(new String(chstr));
        
        // int a = sc.nextInt();
        // int m = sc.nextInt();
        // int rs = sc.nextInt(); 
        // if(a > m) // if a greater means we buy mangos 
        //     rs = rs - (a - m);
        // else  // or we sell mangos rate of 1
        //     rs = rs + (m - a);
        // System.out.println(rs);
        
        
        // Process Two Words
        String str = sc.nextLine();
        int num = sc.nextInt();// 41
        int dig1 = num % 10;// 1
        int dig2 = num / 10;// 4
        
        String word1 = split_words(str,dig1);// today 
        String word2 = split_words(str,dig2);// nice
        
        String new_word_1 = word_forming(word1);
        String new_word_2 = word_forming(word2);
        
        System.out.println(new_word_2 + " " + new_word_1);
	}
	// Today is a nice day
	public static String split_words(String str,int dig)
	{
	    int spa_cnt = 0;
	    int st_ind = 0;
	    int end_ind = 0;
	    boolean find = false;
	    for(int i=0;i<str.length();i++)
	    {
	        if(dig == 1)
	        {
	            st_ind = 0;
	            find = true;
	        }
	        if(i==str.length() - 1)
	        {
	            end_ind = str.length();
	            find = true;
	        }
	        if(str.charAt(i) == ' ')
	        {
	            spa_cnt++;// 1
	            if(find)
	            {
	                end_ind = i;// 15
	                break;
	            }
	            if(spa_cnt == dig - 1)// 3 == 3
	            {
	                st_ind = i+1;// 11
	                find = true;
	            }
	        }
	    }
	    String word = "";
	    for(int i = st_ind;i<end_ind;i++)
	    {
	        word += str.charAt(i);
	    }
	    // System.out.println(word);
	    
	    return word;
	}

	public static String word_forming(String word)// nice
    {
        String fir_half = "";
        String sec_half = "";
        int len = word.length()/ 2;// 5
        for(int i=len;i<word.length();i++)
        {
            fir_half += word.charAt(i);
        }
        // System.out.println(fir_half);
        
        if(len % 2 == 0)
        // today nice
        {
            for(int i=len;i>=0;i--)
            {
                sec_half += word.charAt(i);
            }
        }
        else
        {
            for(int i=len-1;i>=0;i--)
            {
                sec_half += word.charAt(i);
            }
        }
        
       //  System.out.println(sec_half);
       
        return fir_half + sec_half;
        
    }
}
