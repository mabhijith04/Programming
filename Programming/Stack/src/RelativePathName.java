import java.util.Stack;

public class RelativePathName {
    public String simplifyPath(String A) 
    {
        Stack<Character> s = new Stack<Character>();
        
        if(A.length() == 1)
            return A;
            
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i) == '.');
            else s.push(A.charAt(i));
        }
        if(s.size() == 1);
        else s.pop();
        String str="";
        while(s.peek() != '/')
        {
            str = str + s.pop();
        }
        str = str+s.pop();
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String args[])
    {
    	RelativePathName n = new RelativePathName();
    	System.out.println(n.simplifyPath("/.."));
    }
}
