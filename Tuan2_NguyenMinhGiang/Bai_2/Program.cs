using System;

namespace Bai_2
{
    class Program
    {
        static void Main(string[] args)
        {

            int So_Dau = 0;
            int So_Sau = 1;
            int Next, n;
            Console.Write("Nhap n : ");
            n = System.Int32.Parse(Console.ReadLine());
            if (n < 2)
            {
                Console.Write("Nhap so > 2 : ");
            }
            else
            {
                Console.Write($"Day Fibonacci: {So_Dau} {So_Sau} ");
                for (int i = 2; i < n; i++)
                {
                    Next = So_Dau + So_Sau;
                    Console.Write(Next + " ");
                    So_Dau = So_Sau;
                    So_Sau = Next;
                }
            }
            Console.ReadKey();
        }
    }
}
