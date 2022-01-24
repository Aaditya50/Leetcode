class Solution {
    public String capitalizeTitle(String title) {
        String ch[] = title.split(" ");
        for(int i = 0 ; i < ch.length ; i++){
            String c = ch[i].toLowerCase();
            StringBuilder sb = new StringBuilder(c);
            if(c.length() > 2){
                sb.setCharAt(0,(char)(sb.charAt(0)^' '));
            }
            ch[i] = sb.toString();
        }
        return Arrays.stream(ch).collect(Collectors.joining(" "));
        
        
    }
}
