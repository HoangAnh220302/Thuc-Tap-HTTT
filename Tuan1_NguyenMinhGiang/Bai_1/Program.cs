using System;

namespace Bai_1
{
    class Program
    {
        static void Main(string[] args)
        {
            float a, b;
            do
            {
                Console.Write("Nhap chieu dai : ");
                a = System.Single.Parse(Console.ReadLine());
                Console.Write("Nhap chieu rong : ");
                b = System.Single.Parse(Console.ReadLine());
            } while (a < b);

            Console.WriteLine($"Chu vi cua hinh chu nhat la : {a + b} ");
            Console.WriteLine($"Dien tich cua hinh chu nhat la : {a * b} ");
        }
    }
}
