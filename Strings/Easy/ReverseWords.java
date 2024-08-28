public class ReverseWords
{
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));

    }

    static String reverseWords(String s)
    {
        StringBuilder ans = new StringBuilder();
        String[] arr = s.trim().split("\\s+");
        for(int i = arr.length-1; i>=0; i--)
        {
            ans.append(arr[i]);
            ans.append(" ");
        }
        return ans.toString().trim();
    }
}
