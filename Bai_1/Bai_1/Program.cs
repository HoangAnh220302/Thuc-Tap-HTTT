using System;

namespace Bai_1
{
    struct SinhVien
    {
        public int ID;
        public string Ten;
        public string GioiTinh;
        public int Tuoi;
        public float DiemToan;
        public float DiemLy;
        public float DiemHoa;
        public double DiemTrungBinh;
        public string HocLuc;
    }

    
    class Program
    {
        static void NhapSinhVien(ref SinhVien A)
        {
            Console.Write("Nhap ID hoc sinh : ");
            A.ID = System.Int32.Parse(Console.ReadLine());

            Console.Write("Nhap ten hoc sinh : ");
            A.Ten = Console.ReadLine();

            Console.Write("Nhap gioi tinh hoc sinh : ");
            A.GioiTinh = Console.ReadLine();

            Console.Write("Nhap tuoi hoc sinh : ");
            A.Tuoi = System.Int32.Parse(Console.ReadLine());

            Console.Write("Nhap diem toan hoc sinh : ");
            A.DiemToan = System.Single.Parse(Console.ReadLine());

            Console.Write("Nhap diem ly hoc sinh : ");
            A.DiemLy = System.Single.Parse(Console.ReadLine());

            Console.Write("Nhap diem hoa hoc sinh : ");
            A.DiemHoa = System.Single.Parse(Console.ReadLine());
        }

        static void XuatSinhVien(ref SinhVien A)
        {
            Console.Write($"\nID hoc sinh : {A.ID}");

            Console.Write($"\nTen hoc sinh : {A.Ten}");

            Console.Write($"\nGioi tinh hoc sinh : {A.GioiTinh}");

            Console.Write($"\nTuoi hoc sinh : {A.Tuoi}");

            Console.Write($"\nDiem toan hoc sinh : {A.DiemToan}");

            Console.Write($"\nDiem ly hoc sinh : {A.DiemLy}");

            Console.Write($"\nDiem hoa hoc sinh : {A.DiemHoa}");

            A.DiemTrungBinh = (A.DiemHoa + A.DiemLy + A.DiemToan) / 3;
            Console.Write($"\nDiem trung binh cua hoc sinh : {A.DiemTrungBinh}");

            if (A.DiemTrungBinh > 8)
            {
                Console.Write($"\nHoc sinh {A.Ten} dat hoc sinh Gioi!");
            }
            else if (A.DiemTrungBinh > 6.5 && A.DiemTrungBinh < 8 )
            {
                Console.Write($"\nHoc sinh {A.Ten} dat hoc sinh Kha!");
            }
            else if (A.DiemTrungBinh > 5 && A.DiemTrungBinh < 6.5)
            {
                Console.Write($"\nHoc sinh {A.Ten} dat hoc sinh Trung Binh!");
            }
            else if (A.DiemTrungBinh < 5)
            {
                Console.Write($"\nHoc sinh {A.Ten} dat hoc sinh Yeu!");
            }
        }

        static void NhapMang(ref int n, SinhVien[] A)
        {
            for (int i = 0; i < n; i++)
            {
                Console.WriteLine($"\nNhap sinh vien thu {i} ");
                NhapSinhVien(ref A[i]);
            }
        }

        static void XuatMang(ref int n, SinhVien[] A)
        {
            for (int i = 0; i < n; i++)
            {
                Console.WriteLine($"\nSinh vien thu {i} ");
                XuatSinhVien(ref A[i]);
            }
        }

        static void ThemPT(ref int n, SinhVien[] A)
        {
            Console.Write("\nNhap sinh vien can chen : ");
            SinhVien X = new SinhVien();
            NhapSinhVien(ref X);
            Console.Write("\nNhap vi tri can chen : ");
            int x = System.Int32.Parse(Console.ReadLine());
            for(int i = n; i >= x; i--)
            {
                A[i].ID = A[i - 1].ID;
                A[i].Ten = A[i - 1].Ten;
                A[i].GioiTinh = A[i - 1].GioiTinh;
                A[i].Tuoi = A[i - 1].Tuoi;
                A[i].DiemToan = A[i - 1].DiemToan;
                A[i].DiemLy = A[i - 1].DiemLy;
                A[i].DiemHoa = A[i - 1].DiemHoa;
                n++;
            }
            A[x - 1].ID = X.ID;
            A[x - 1].Ten = X.Ten;
            A[x - 1].GioiTinh = X.GioiTinh;
            A[x - 1].Tuoi = X.Tuoi;
            A[x - 1].DiemToan = X.DiemToan;
            A[x - 1].DiemLy = X.DiemLy;
            A[x - 1].DiemHoa = X.DiemHoa;
        }
        static void Main(string[] args)
        {
            Console.Write("Nhap so hoc sinh : ");
            int n = System.Int32.Parse(Console.ReadLine());
            SinhVien[] A = new SinhVien[n];
            NhapMang(ref n, A);
            XuatMang(ref n, A);
            Console.WriteLine("\nMang sau khi chen la : ");
            ThemPT(ref n, A);
            XuatMang(ref n, A);
        }
    }
}
