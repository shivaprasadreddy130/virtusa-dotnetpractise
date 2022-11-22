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


            //secound question

            /*Console.WriteLine("enter the array size");
            int k=Convert.ToInt32(Console.ReadLine());

            int[] arr=new int[k];
            
            for(int i=0; i<k; i++)
            {
                arr[i]=Convert.ToInt32(Console.ReadLine());
            }

            Array.Sort(arr);

            int count = 0;

            for(int j=0; j<arr.Length-1; j++)
            {
                int a = arr[j];
                int b= arr[j+1];
                count += a - b;
            }

            Console.WriteLine("Absolute differnce is"+ -(count));
            

        }
    }
}
