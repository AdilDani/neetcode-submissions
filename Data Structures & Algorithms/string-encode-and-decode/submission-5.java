class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            char[] chars = str.toCharArray();
            for(int i=0;i<chars.length;i++){
                if(chars[i] == ',' || chars[i] == '\\'){
                    sb.append('\\');
                }
                sb.append(chars[i]);
            }
            sb.append(',');
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<>();

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<chars.length;i++){
            if(chars[i] == '\\'){
                sb.append(chars[i+1]);
                i++;
            }
            else if (chars[i] == ','){
                result.add(sb.toString());
                sb.setLength(0);
            }
            else {
                sb.append(chars[i]);
            }
        }
        return result;
    }
}
