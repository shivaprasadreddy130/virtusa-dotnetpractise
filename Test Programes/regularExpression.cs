using System;
using System.Text.RegularExpressions;
  
class GFG {
     
    // Main Method
    public static void Main()
    {
         
        // this will return any pattern
        // like ab, aab, aaab, ....
        Regex regex = new Regex(@"a+b");
        Match match = regex.Match("aaabcd");
        if (match.Success)
        {
            Console.WriteLine("Match Value: " + match.Value);
        }
    }
}