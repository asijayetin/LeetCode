class Solution {
    public String destCity(List<List<String>> paths) {
        for(int i=0;i<paths.size();i++){
            String destination=paths.get(i).get(1);
            boolean city=false;
            for(int j=0;j<paths.size();j++){
                String sourcecity=paths.get(j).get(0);
                if(destination.equals(sourcecity)){
                    city=true;
                    break;
                }
            }
            if(!city) return destination;
        }
        return "";
        
    }
}