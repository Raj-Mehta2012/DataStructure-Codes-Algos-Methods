**DS in to post (Method 2)***

import java.util.*; 

public class InToPost {
  
   static int Prec(char ch)
   {
         switch (ch) 
         {
            case '+': 
            case '-':
            	return 1;
             
            case '*': 
            case '/':
            	 return 2;	
            case '^': 
            	return 3;  
         }
         return -1;
      }
    
   static String InfixToPostfix (String exp)
   {
	   String result=new String("");
	   Stack<Character> stack=new Stack<Character>();
	   for(int i=0;i<exp.length();++i)
	   {
		   char c=exp.charAt(i);
		   if(Character.isLetterOrDigit(c))
			   result+=c;
		   else if (c=='(')
			   stack.push(c);
		   else if (c==')')
		   {
			   while(!stack.isEmpty() && stack.peek()!='(') 
			   {
				   result+=stack.pop();
			   }
			   
			   if(stack.isEmpty() && stack.peek()!=')')
				   System.out.println("Invalid");
			   else 
				   stack.pop();
		   }
		   else
		   {
			   while(!stack.isEmpty() && Prec(c)<=Prec(stack.peek())) 
			   {
				   if(stack.peek()=='(')
					   return "Invalid";
				   result+=stack.pop();
			   }
			   stack.push(c);
		   }
	   }
	   
	  while(!stack.isEmpty()) 
	  {
		  if(stack.peek()=='(')
			   return "Invalid";
		   result+=stack.pop();
	  } 
	  return result;
   }
   

   public static void main(String[] args) 
   {
	   String exp="((a+b)-(c*d)^e)";
	   System.out.println(InfixToPostfix(exp));
   }
}
