using System;

namespace Bai2
{
    class Program
    {
        static void Main(string[] args)
        {
            float TN, L, T;
            double Thue;
            Console.Write("Luong: ");
            L = Int32.Parse(Console.ReadLine());
            Console.Write("Thuong: ");
            T = Int32.Parse(Console.ReadLine());
            TN = L + T;

            if (TN < 9)
            {
                Console.WriteLine("Khong dong thue!");
            }
            else if (9 <= TN ||TN < 15)
            {
                Thue = TN * 0.1;
                Console.WriteLine("Thue 10% ={0} ", Thue);
            }
            else if (15 <= TN|| TN < 30)
            {
                Thue = TN * 0.15;
                Console.WriteLine("Thue 15%={0}", Thue);
            }
            else
            {
                Thue = TN * 0.2;
                Console.WriteLine("Thue 20%={0}", Thue);
            }
            Console.ReadLine();
        }
    }
}
