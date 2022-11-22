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


            int n=Convert.ToInt32(Console.ReadLine());
            string[] arr1=new string[n];
            for(int i=0;i<n;i++)
            {
                arr1[i] = Console.ReadLine();
            }
            Stack<string> stack1=new Stack<string>();

            for(int j=0;j<arr1.Length;j++)
            {
                string k=arr1[j];
                char[] c=k.ToCharArray();
                if (c[0]=='F')
                {
                    stack1.Push(k);
                }
                else if(c[1]=='.')
                {
                    stack1.Pop();
                }
                else
                {
                    continue;
                }
            }
            Console.WriteLine(stack1.Count);
        }
            




        }
    }
}
