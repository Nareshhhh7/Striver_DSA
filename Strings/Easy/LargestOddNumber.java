public class LargestOddNumber
{
    public static void main(String[] args) {
        String  num = "52";
        String str = "abcd";
        //System.out.println(largestOddNumber(num));

        System.out.println(str.charAt(2)%2);

    }

    static String largestOddNumber(String num)
    {
        for(int i = num.length()-1; i>=0; i--)
        {
            if(num.charAt(i)%2 == 1)
            {
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
