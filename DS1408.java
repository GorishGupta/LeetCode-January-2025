import java.util.ArrayList;
import java.util.List;

public class DS1408 {
    class Solution {
    public List<String> stringMatching(String[] words)
    {
        List<String> al=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(i!=j)
                {
                if(words[i].contains(words[j]))
                {
                    if(!al.contains(words[j]))
                    {
                    al.add(words[j]);
                }
            }
        }
        }
        }
        return al;
    }
}
}
