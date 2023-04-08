using System;

namespace Bai_3
{
    class Program
    {
        static void Main(string[] args)
        {
            int Tich = 1;
            Console.Write("Nhap so giai thua : ");
            int n = System.Int32.Parse(Console.ReadLine());
            for(int i = 1; i <= n; i ++)
            {
                Tich *= i;
            }
            Console.WriteLine($"{n}! = {Tich}");
        }
    }
}
