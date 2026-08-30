class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder anss=new StringBuilder();
        StringBuilder anst=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(anss.length()>0) anss.deleteCharAt(anss.length()-1);
            }
            else anss.append(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(anst.length()>0) anst.deleteCharAt(anst.length()-1);
            }
            else anst.append(t.charAt(i));
        }
        return anss.toString().equals(anst.toString());

        
    }
}