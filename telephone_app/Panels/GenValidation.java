package telephone_app.Panels;


public class GenValidation
{
    public boolean checkAlphaField(String s)
    {
        boolean ans=true;
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            char ch=a[i];
            if(!(ch>='a' && ch<='z' || ch>='A' && ch<='Z'))
            {
                ans=false;
                break;
            }   
        }
        return ans;
    }
    public boolean checkNumericField(String s)
    {
          Boolean ans=true;
          char a[]=s.toCharArray();
          for(int i=0;i<s.length();i++)
        {
              char ch=a[i];
              if(!(ch>='0' && ch<='9'))  
              {
                  ans=false;
                  break;
              }
        }
          return ans;
    }
    
    public boolean MatchPassword(String s,String t)
    {
        boolean ans=true;
        if(!(s.equals(t)))
            ans=false;
     return ans;   
    }
    
}
