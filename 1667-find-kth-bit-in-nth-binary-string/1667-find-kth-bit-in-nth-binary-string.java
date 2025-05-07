class Solution {
    public char findKthBit(int n, int k) {
        String[] arr = new String[n+1];
        arr[0] = "0";
        for(int i=1; i<=n; i++){
            StringBuffer sb = new StringBuffer(arr[i-1]);
            String reversedStr = sb.reverse().toString();
            String inversedStr = invertBits(reversedStr);
            arr[i] = arr[i-1] + "1" + inversedStr;
           // System.out.println(arr[i]);
        }
        
        return arr[n].charAt(k-1);
    }

    public String invertBits(String s) {
    StringBuilder flipped = new StringBuilder();
    for (char c : s.toCharArray()) {
        flipped.append(c == '0' ? '1' : '0');
    }
    return flipped.toString();
}
}