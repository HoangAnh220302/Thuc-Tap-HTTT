using System;

namespace Bai1
{
    class Program
    {
        static void Main(string[] args)
        {
            float a, b, c;
            Console.Write("Nhap a: ");
            a = Convert.ToSingle(Console.ReadLine());
            Console.Write("Nhap b: ");
            b = Convert.ToSingle(Console.ReadLine());
            Console.Write("Nhap c: ");
            c = Convert.ToSingle(Console.ReadLine());
            if (a == 0)
            {
                if (b == 0)
                {
                    Console.Write("Phuong trinh vo nghiem.");
                }
                else
                {
                    Console.Write("Phuong trinh co mot nghiem x0: ");
                    double x0 = -c / b;
                    Console.WriteLine("x0={0}", x0);
                }
            }
            float delta = b * b - 4 * a * c;
            if (delta < 0)
            {
                Console.WriteLine("Phuong trinh vo nghiem.");
            }
            else if (delta == 0)
            {
                Console.WriteLine("Phuong trinh co nghiem kep: ");
                double x = -b / 2 / a;
                Console.WriteLine("x={0}", x);
            }
            else
            {
                Console.WriteLine("Phuong trinh co 2 nghiem phan biet: ");
                double x1 = (-b + Math.Sqrt(delta)) / 2 / a;
                double x2 = (-b - Math.Sqrt(delta)) / 2 / a;
                Console.WriteLine("x1={0}", x1);
                Console.WriteLine("x2={0}", x2);
            }
            Console.ReadLine();
        }
    }
}
