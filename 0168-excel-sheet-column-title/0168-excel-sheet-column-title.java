class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            result.append((char)(columnNumber%26+'A'));
            System.out.println(result);
            columnNumber/=26;
        }
        return result.reverse().toString();
    }
}