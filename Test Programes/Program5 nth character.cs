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


           */

            //solving third one

            // nth character in the string 
            //a2b3c1
            Console.WriteLine("enter the string to find n th character");
            string m = Console.ReadLine();
		  int num=Convert.ToInt32(Console.ReadLine());
            string res = "";
           for(int i=1; i<m.Length;i+=2)
            {
                int k = m[i] - '0';
                char a = m[i - 1];
                for(int j=0; j<k;j++)
                {
                    res += a;
                }
            }
	
		Console.WriteLine(res[num]);




        }
    }
}
