class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x == 0) return true;

        String str = String.valueOf(x); // convert to String
        StringBuilder sb = new StringBuilder(str); // StringBuilder

        if (str.equals(sb.reverse().toString())){
          return true;
        }
        
        return false;
    }
}