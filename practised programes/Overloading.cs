using System;
class overloadpgm
{
    public int value;
    public static overloadpgm operator +(overloadpgm a, overloadpgm b)
    {
        overloadpgm overloadpg = new overloadpgm();
        overloadpg.value = a.value + b.value;
        return overloadpg;
    }
    public static overloadpgm operator ++(overloadpgm c)
    {
        c.value++;
        return c;
    }
}
class Program
{
    static void Main()
    {
        overloadpgm d = new overloadpgm();
        d++;
        Console.WriteLine(d.value);
        d++;
        Console.WriteLine(d.value);
        overloadpgm g = new overloadpgm();
        g++;
        Console.WriteLine(g.value);
        overloadpgm t = d + g;
        Console.WriteLine(t.value);
        Console.ReadLine();
    }}