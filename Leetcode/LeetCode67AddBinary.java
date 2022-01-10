import static org.junit.Assert.assertEquals;

public class LeetCode67AddBinary
{

    public static void main(String args[]){
        //assertEquals("100",addBinary("11","1"));
        //assertEquals("10101",addBinary("1010","1011"));
        assertEquals("11110",addBinary("1111","1111"));
    }

    public static String addBinary(String a, String b)
    {
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuilder sb=new StringBuilder();
        int carry=0;
        int sum=0;
        while(i>=0 || j>=0)
        {
            int i1=0,j1=0;
            if(i>=0)
            i1=Character.getNumericValue(a.charAt(i));
            if(j>=0)
            j1=Character.getNumericValue(b.charAt(j));
            sum=i1+j1+carry;
            if(sum>=2)carry=1; else carry=0;
            sb.append(sum%2);//1+1

            i--;
            j--;
        }
        if(carry==1)
            sb.append("1");
        return sb.reverse().toString();
    }
}
