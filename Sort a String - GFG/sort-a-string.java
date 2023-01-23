//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0){
            String s = sc.nextLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.sort(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String sort(String s) 
    {
        // code here
        int n=s.length();
        int[] e=new int[n];
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            e[i]=c;
        }
        Arrays.sort(e);
        String ans="";
        for(int i=0;i<n;i++){
            char c1=(char) e[i];
            ans+=c1;
        }
        return ans;
    }
} 