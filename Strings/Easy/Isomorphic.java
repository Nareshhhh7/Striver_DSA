import java.util.HashMap;
import java.util.Map;

public class Isomorphic
{
    public static void main(String[] args) {

        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s,t));

    }

    static boolean isIsomorphic(String s, String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }
        Map<Character,Character> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(!map.get(s.charAt(i)).equals(t.charAt(i)))
                {
                    return false;
                }
            }
            else if(map.containsValue(t.charAt(i)))
            {
                return false;
            }
            else
            {
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
