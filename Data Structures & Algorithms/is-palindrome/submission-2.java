class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        char[] chars = new char[s.length()];

        for(int k=0;k<s.length();k++){
            char c = s.charAt(k);
            if(Character.isLetterOrDigit(c)){
                chars[l]=Character.toLowerCase(c);
                l++;
            }
        }

        int i=0;
        // int j=s.length()-1;
        l--;
        while(i<l){
            if(chars[i]!=chars[l]){
                return false;
            }
            i++;
            l--;
        }

        return true;
    }
}
