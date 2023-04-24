using System;

namespace Bai3
{
    class Program
    {
        static void Main(string[] args)
        {
            int M, Y, D = 0;
            Console.Write("Nhap thang: ");
            M = Int32.Parse(Console.ReadLine());
            Console.Write("Nhap nam: ");
            Y = Int32.Parse(Console.ReadLine());
            switch (M)
            {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    D = 31;
                    break;
                case 2:
                    if (Y % 4 == 0)
                        D = 29;
                    else
                        D = 28;
                    break;
                case 4: case 6: case 9: case 11:
                    D = 30;
                    break;
            }
            Console.WriteLine("Thang " + M + " nam " + Y + " co " + D + " ngay.");
            Console.ReadLine();
        }
    }
}
