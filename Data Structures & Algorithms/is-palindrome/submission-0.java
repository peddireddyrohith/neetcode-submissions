class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder rev = new StringBuilder(str).reverse();
        if(rev.toString().equals(str)){
            return true;
        }
        return false;
    }
}
