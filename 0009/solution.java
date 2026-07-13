class Solution {
    public boolean isPalindrome(int x) {
        int a=x;
        int r=0;
        if(x<0){
            return false;
        }
        else{
        while(a!=0){
            r=a%10+r*10;
            a=a/10;
        }
        if(r==x){
            return true;
        }
        else{
            return false;
        }
        }
        
    }
}