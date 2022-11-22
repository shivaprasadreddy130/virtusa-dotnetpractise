using System.Data.SqlClient;
using System;

class shiva
{
    public static void Main(String[] args)
    {

        Console.WriteLine("ENTER THE SOCKS SIZE");
        int n = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("ENTER THE ARRAY ELEMENTS");
        String str=Console.ReadLine();
        string[] ch = str.Split(" ");
        
        List<int> list = new List<int>();
        foreach (var ch2 in ch)
        {
            list.Add(Convert.ToInt32(ch2));
        }

        int mainc=0;
        List<int> list2 = new List<int>();
        for(int i = 0; i < list.Count; i++)
        {
            int count = 0;
            int a = list[i];
            if (list2.Contains(a) == false)
            {
                list2.Add(a);
                for (int j = 0; j < list.Count; j++)
                {
                    if (a == list[j])
                    {
                        count++;
                    }

                }
            }
            
            mainc += count / 2;
        }
        Console.WriteLine(mainc);


    }
}