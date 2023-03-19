using System;

namespace Bai_1
{
    class Program
    {
        static void NhapMang(ref int n, int[] a)
        {
            for (int i = 0; i < n; i++)
            {
                Console.Write($"Nhap phan tu thu {i} : ");
                a[i] = System.Int32.Parse(Console.ReadLine());
            }
        }

        static void XuatMang(ref int n, int[] a)
        {
            for (int i = 0; i < n; i++)
            {
                Console.Write($"\nPhan tu thu {i} : {a[i]}");
            }
        }

        static void Tim_Max(ref int n, int[] a)
        {
            int max = a[0];
            for(int i = 0; i < n; i++)
            {
                if (a[i] > max)
                {
                    max = a[i];
                }
            }
            Console.WriteLine($"\nPhan tu lon nhat trong mang la : {max}");
        }

        static void Tim_Min(ref int n, int[] a)
        {
            int min = a[0];
            for (int i = 0; i < n; i++)
            {
                if (a[i] < min)
                {
                    min = a[i];
                }
            }
            Console.WriteLine($"\nPhan tu nho nhat trong mang la : {min}");
        }

        static void Tinh_Tong(ref int n, int[] a)
        {
            int Sum = 0; ;
            for (int i = 0; i < n; i++)
            {
                Sum += a[i];
            }
            Console.WriteLine($"\nTong cac phan tu trong mang la : {Sum}");
        }
        static void Main(string[] args)
        {
            int n;
            Console.Write("Nhap n : ");
            n = System.Int32.Parse(Console.ReadLine());
            int[] a = new int[n];
            Console.WriteLine("\nNhap cac phan tu cua mang : ");
            NhapMang(ref n, a);
            Console.WriteLine("\nCac phan tu cua mang vua nhap : ");
            XuatMang(ref n, a);
            Tim_Max(ref n, a);
            Tim_Min(ref n, a);
            Tinh_Tong(ref n, a);
        }
    }
}
