using System;

public class MainClass
{
    public static void Main(string[] args)
    {
        uint64 startTime = DateTime.Now;
        uint64 a = 0;
        do
        {
            a += 1;
            Console.WriteLine(a);
        } while (a < 100000000);
        uint64 endTime = DateTime.Now;
        uint64 timeElapsed = endTime - startTime;
        Console.WriteLine("Time: " + timeElapsed.TotalMilliseconds + " ms");
        Console.WriteLine("Speed: " + (100000000 / timeElapsed.TotalSeconds) + " processes per second");
    }
}