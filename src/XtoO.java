public class XtoO {
    public static void main(String[] args) {
        String s="XXOX";

        int count=0;
        for(int i=0;i<s.length();){
            if(s.charAt(i)=='X'){
                   i+=3;
                   count+=1;
            }
            else {
                i++;
            }
        }
        System.out.println(count);
    }
}
