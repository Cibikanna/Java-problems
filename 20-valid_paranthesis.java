class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(a =='(' || a =='[' || a =='{')
                st.push(a);
            else
            {
                switch(a)
                {
                    case ')':
                        if(st.isEmpty()==true)
                            return false;
                        if(st.peek()=='{'||st.peek()=='[')
                            return false;
                        else
                        st.pop();
                    break;
                    case ']':
                        if(st.isEmpty()==true)
                            return false;
                        if(st.peek()=='{'||st.peek()=='(')
                             return false;
                            st.pop();
                    break;
                    case '}':
                        if(st.isEmpty()==true)
                            return false;
                        if(st.peek()=='('||st.peek()=='[')
                            return false;
                        st.pop();
                    break;
                }
            }
           
        }
        return st.isEmpty();
    }
}
