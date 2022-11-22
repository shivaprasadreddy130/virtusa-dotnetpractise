sing System;
namespace mismatch
{
    class Program
    {
        string value, substring;
        int j, i;
        string[] a = new string[5];
        void input()
        {
            Console.WriteLine("Enter the String : ");
            value = Console.ReadLine();
            Console.WriteLine("All Possible Substrings of the Given String are :");
            for (i = 1; i <=value.Length; i++)
            {
                for (j = 0; j <= value.Length - i; j++)
                {
                    substring = value.Substring(j, i);
                    a[j] = substring;
                    Console.WriteLine(a[j]);
                }
            }
        }
        public static void Main()
        {
            Program pg = new Program();
            pg.input();
            Console.ReadLine();
        }
    }
}