class Solution {
    public boolean isAnagram(String s, String t) {
        char[] input1 = s.toCharArray();
        char[] input2 = t.toCharArray();
        Arrays.sort(input1);
        Arrays.sort(input2);
        if (input1.length != input2.length) 
            return false;
        
        boolean result = true;
        for (int i=0; i<input1.length; i++) {
            if(input1[i] != input2[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
