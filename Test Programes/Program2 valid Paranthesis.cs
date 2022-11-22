using System;
using System.Collections.Generic;
using System.Security.Cryptography;
using System.Transactions;

namespace firstApp
{

    class One
    {
        public static void Main()
        {


            
            //3RD CODE COMPLETED
            //NOW  1ST CODE balanced bracets

            /* Console.WriteLine("please enter the string of bractes");

             string s = Console.ReadLine();
             char[] ch = s.ToCharArray();

             Stack<char> stack = new Stack<char>();

             for (int i = 0; i < ch.Length; i++)
             {
                 if (ch[i] == '{' || ch[i] == '[' || ch[i] == '(')
                 {
                     stack.Push(ch[i]);
                 }
                 else if ((ch[i] == '}') && (stack.Peek() == '{') || (ch[i] == ']') && (stack.Peek() == '[') || (ch[i] == ')') && (stack.Peek() == '('))
                 {
                     stack.Pop();
                 }

             }
             if (stack.Count == 0)
             {
                 Console.WriteLine("BALANCED");
             }
             else
             {
                 Console.WriteLine("Not Balanced");
             }
         }
            

            




        }
    }
}
