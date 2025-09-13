class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vow=new ArrayList<>();
        ArrayList<Integer> pos=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='U'||ch=='I'){
                vow.add(ch);
                pos.add(i);
            }
        }
        Collections.sort(vow);
        char[] answer=s.toCharArray();
        for(int i=0;i<pos.size();i++){
            answer[pos.get(i)]=vow.get(i);
        }
        return new String(answer);
    }
}