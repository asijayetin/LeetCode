class Solution {
    public int countSeniors(String[] details) {
        // char[] arr=details.tocharArray();
        int seniorcount=0;
        for(String i:details){
            char eleventh=i.charAt(11);
            char twelveth=i.charAt(12);
            if(eleventh>'6' || (eleventh=='6'&&twelveth>'0')) seniorcount++;
        }
        return seniorcount;
    }
}