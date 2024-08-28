public class RotateString
{
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s,goal));
    }

    static boolean rotateString(String s, String goal)
    {
       if(s.length() != goal.length())
       {
           return false;
       }

       String s3 = s+s;
       if(s3.contains(goal))
       {
           return true;
       }
       else
       {
           return false;
       }
    }
}
