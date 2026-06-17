class Solution {
    public char processStr(String s, long k) {
        
        long len =0;
        for(char c: s.toCharArray()){

            switch(c){

                case '*':
                    if(len!=0){
                        // sb.deleteCharAt(sb.length()-1);
                        len--;
                    }
                    break;
                case '#':
                    // sb.append(sb);
                    len+=len;
                    break;
                case '%':
                    // sb.reverse();
                    break;
                default:
                    // sb.append(c);
                    len++;
            }
        }

        if(k>=len){
            return '.';
        }

        for(int i=s.length()-1;i>=0;i--){

            switch(s.charAt(i)){

                case '*':
                    // if(sb.length()!=0){
                        // sb.deleteCharAt(sb.length()-1);
                        len++;
                    // }
                    break;
                case '#':
                    // sb.append(sb);
                    len/=2;
                     if (k >= len) k -= len;
                    break;
                case '%':
                    k = len - 1 - k;
                    // sb.reverse();
                    break;
                default:
                    // sb.append(c);
                    len--;
                    if (k == len) return s.charAt(i);
            }
        }
        return '.';
    }
}