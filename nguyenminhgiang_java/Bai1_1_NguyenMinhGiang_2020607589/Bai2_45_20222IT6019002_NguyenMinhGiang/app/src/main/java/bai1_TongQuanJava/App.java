/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bai1_TongQuanJava;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class App{
    
    public void swap(int a,int b){
        int tg = a;
        a = b;
        b = tg;
    }
    
    public void Sort(int[] a,int n){
        for(int i=0;i<n;i++){
            int m = i;
            for(int j=i+1;j<n;j++){
                if(a[j] < a[m]){
                    m = j;
                }
            }
            int tg = a[i];
            a[i] = a[m];
            a[m] = tg;
        }
    }
    
    public class Bai1{
        //Phân tích : dùng 1 vòng lăp chạy từ 1 -> n
        // chia n cho i(1 -> n) nếu n chia hết cho i thì tăng biến đếm count lên 1 đơn vị
        //kết thúc vòng lặp kiểm tra nếu biến count = 2 -> n chia hết 1 và chính n -> là số nguyên tố
        public boolean examSNT(int n){
            int count = 0;
            for(int i=1;i<=n;i++){
                if(n % i == 0){
                    count++;
                }
            }
            if(count == 2){
                return true;
            }else{
                return false;
            }
        }
    }
    
    public class Bai2{
        //Phân tích : sử dụng 1 biến delta = b*b - 4 * a * c để kiểm tra loại kết quả
        //nếu delta < 0 --> phương trình vô nghiệm
        //nếu delta = 0 -> phương trình có nghiệm kép
        //nếu delta > 0 -> phương trình có 2 nghiệm phân biệt
        public void calculator(int a,int b,int c){
            float x1,x2;
            int delta = b*b - 4*a*c;
            if(delta > 0){
                x1 = (float)(-b + Math.sqrt(delta))/(2*a);
                x2 = (float)(-b - Math.sqrt(delta))/(2*a);
                System.out.println("x1 = " + x1 + "\n" + "x2 = " + x2);
            }else if(delta < 0){
                System.out.println("Phuong Trinh Vo Nghiem");
            }else{
                x1 = (float)-b/2*a;
                System.out.println("Phuong trinh co 1 nghiem x1 = x2 = " + x1);
            }
        }
    }
    
    public class Bai3{
        //phân tích : sử dụng phương pháp đệ quy để tính n * n-1 cho đến khi n = 1 thì dừng đệ quy
        public int factorial(int n){
            if(n == 0){
                return 1;
            }else{
                return n * factorial(n - 1);
            }
        }
    }
    
    public class Bai4{
        //phân tích : sử dụng đệ quy để tính điểm dừng là khi k == 0 hoặc là k == n
        public int Combination(int k,int n){
            if (k == 0 || k == n) return 1;
            if (k == 1) return n;
            return Combination(k - 1, n - 1) + Combination(k, n - 1);
        }
        
    }
    
    public class Bai5{
        //phân tích : sử dụng đệ quy, mỗi lần gọi đệ quy sẽ thay thế biến a = b%a, b = a
        //điểm dừng là khi b chia hết cho a
        public int UCLN(int a,int b){
            if(a > b){
                swap(a,b);
            }
            if(b % a == 0){
                return a;
            }else{
                int r = b % a;
                return UCLN(r,a);
            }
        }
    }
    
    public class Bai6{
        //phân tích : tạo ra 3 method InputArray,RenderArray,handleInput
        //InputArray : nhập dữ liệu vào mảng
        //RenderArray : hiển thị dữ liệu
        //handleInput : xử lý mảng
        public void InputArray(int[] a,int n){
            Scanner sc = new Scanner(System.in);
            System.out.println("---- Nhap Mang ----\n");
            for(int i=0;i<n;i++){
                System.out.println("a[" + i + "] = ");
                a[i] = sc.nextInt();
            }
        }
        public void RenderArray(int[] a,int n){
            System.out.println("---- Hien Thi Mang ----\n");
            for(int i=0;i<n;i++){
                System.out.print(a[i] + " ");
            }
        }
        
        public void handleInput(int[] a,int n, Bai1 bai1){
            for(int i=0;i<n;i++){
                if(bai1.examSNT(a[i]) == true){
                    System.out.println(a[i] + " La So Nguyen To !");
                }
            }
        }
    }
    
    public class Bai7{
        //phân tích : tạo ra 5 method InputArray,RenderArray,handleInput,Sort_Array,Search
        //InputArray : nhập dữ liệu vào mảng
        //RenderArray : hiển thị dữ liệu
        //handleInput : xử lý mảng
        //3 method trên được kế thừa lại từ class Bai6
        //Sort_Array : dùng để sắp xếp lại mảng (tìm kiếm nhị phân chỉ sử dụng được khi mảng đã theo 1 trật tự nhất định)
        //Search : tìm kiếm bằng phương pháp tìm kiếm nhị phân
        public void InputArray(int[] a,int n,Bai6 bai6){
            bai6.InputArray(a, n);
        }
        
        public void RenderArray(int[] a,int n,Bai6 bai6){
            bai6.RenderArray(a, n);
        }
        
        public void Sort_Array(int[] a,int n){
            Sort(a,n);
        }
        
        public int Search(int[] a,int left,int right,int k){
            if(left == right){
                if(k == a[left]){
                    return left;
                }else{
                    return -1;
                }
            }else{
                int mid = (int)(left + right)/2;
                if(k > a[mid]){
                    return Search(a,mid + 1,right,k);
                }else if(k < a[mid]){
                    return Search(a, left, mid-1, k);
                }else{
                    return mid;
                }
            }
        }
    }
    
    public class Bai11{
        //phân tích : tạo ra 3 method InputArray,RenderArray,handleInput
        //InputArray : nhập dữ liệu vào mảng
        //RenderArray : hiển thị dữ liệu
        //handleInput : xử lý mảng 
        
        //Dữ liệu kiểm thử
        //TH1 : nhập 1 mảng toàn số chẵn
        //TH2 : nhập 1 mảng toàn số lẻ
        //TH3 : nhập 1 mảng toàn số nguyên tố
        //TH4 : nhập 1 mảng không có số nguyên tố
        //TH5 : nhập 1 mảng số âm
        public void InputArray(int[][] a,int n,int m){
            Scanner sc = new Scanner(System.in);
            System.out.println("------ Nhap Mang 2 Chieu ------\n");
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print("a[" + i + "][" + j + "] = ");
                    a[i][j] = sc.nextInt();
                }
            }
        }
        
        public void RenderArray(int[][] a,int n,int m){
            System.out.println("------ Hien Thi Mang 2 Chieu ------\n");
            for(int i=0;i<n;i++){
                System.out.println("");
                for(int j=0;j<m;j++){
                    System.out.print(a[i][j] + "\t");
                }
            }
        }
        
        public int HandleArray(int[][] a,int n,int m,Bai1 bai1){
            int max = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(a[i][j] > max && bai1.examSNT(a[i][j]) == true){
                        max = a[i][j];
                    }
                }
            }
            return max;
        }
    }
    public class Array{
        //phân tích : class này tạo ra 1 đối tượng là mảng 2 chiều
        int n;
        int m;
        int[][] a = new int[n][m];
    }
    
    public class Bai12{
        //phân tích : tạo ra 3 method InitArrayTwo2D,RenderArray,MultiTwoArr
        //InitArrayTwo2D : tạo ra và nhập dữ liệu cho mảng 2 chiều
        //RenderArray : hiển thị dữ liệu mảng 2 chiều
        //MultiTwoArr : nhân 2 mảng 2 chiều lại với nhau theo điều kiện : 
            //Phép nhân hai ma trận chỉ thực hiện được khi số lượng cột trong ma trận thứ nhất
            //phải bằng số lượng hàng trong ma trận thứ hai
        
        //Dữ liệu kiểm thử 
        //TH1 : tạo ra 2 mảng có số cột ma trận 1 bằng số hàng của ma trận 2
        //TH2 : tạo ra 2 mảng có số cột của ma trận 1 không bằng với số hàng của ma trận 2
        Scanner sc = new Scanner(System.in);
        App app = new App();
        App.Bai11 bai11 = app.new Bai11();
        App.Array arr = app.new Array();
        List<Array> list = new ArrayList<Array>();
        public void InitArrayTwo2D(){
            int count = 2;
            for(int i=0;i<count;i++){
                App.Array arr = app.new Array();
                System.out.print("\nNhap n : ");
                arr.n = sc.nextInt();
                System.out.print("\nNhap m : ");
                arr.m = sc.nextInt();
                arr.a = new int[arr.n][arr.m];
                bai11.InputArray(arr.a, arr.n, arr.m);
                list.add(arr);
            }
        }
        
        public void RenderArray(){
            for(Array s:list){
                bai11.RenderArray(s.a, s.n, s.m);
            }
            
        }
        public void MultiTwoArr(){
            int[][] c = new int[100][100];
            int n1 = list.get(0).n;
            int m1 = list.get(0).m;
            int a[][] = list.get(0).a;
            int m2 = list.get(1).m;
            int b[][] = list.get(1).a;
            int i, j, k;
             for(i=0;i<n1;i++) 
                for(j=0;j<m2;j++) {
                 int tt=0;
                   for(k=0;k<m1;k++)
                       {
                         tt = tt + (a[i][k] * b[k][j]);
                        }
                    c[i][j] = tt;
            }
            for(i=0;i<n1;i++){
                for(j=0;j<m2;j++){
                    System.out.print(c[i][j] + "\t"); 
                }
                System.out.println("");
            }
        }
        
        
    }
    
    public class Bai14{
        //phân tích : tạo ra 1 method HandleString để sử lý chuỗi truyền vào
        //tạo ra 1 List kiểu char để lưu trữ các ký tự khác nhau
        //dùng vòng lặp để tìm ra các kí tự chỉ tồn tại 1 lần duy nhất và add và list
        //in ra bằng cách sử dụng độ dài của list
        
        //Dữ liệu kiểm thử 
        //TH1 : Nhập vào 1 mảng không có ký tự nào giống nhau
        //TH2 : Nhập vào 1 mảng tồn tại mỗi kí tự xuất hiện 2 lần trở lên
        //TH3 : Nhập vào 1 mảng tồn tại cả kí tự xuất hiện nhiều lần và các kí tự xuất hiện 1 lần
        public int HandleString(String s){
            List<Character> a = new ArrayList<Character>();
            for(int i=0;i<s.length();i++){
                int count = 0;
                for(int j=0;j<s.length();j++){
                    if(s.charAt(i) == s.charAt(j) && s.charAt(i) != ' '){
                        count++;
                    }
                }
                if(count == 1){
                    a.add((s.charAt(i)));
                }
            }
            
            return a.size();
        }
    }
    
    public class Bai15{
        //phân tích : sử dụng 3 lần lặp để tìm ra những kí tự xuất hiện nhiều
        //lần lặp 1 để lấy ra những kí tự tồn tại trong chuỗi (ví dụ có 2 chữ s -> lấy ra 1 chữ đưa vào mảng)
        //lần lặp 2 để so sánh mảng vừa thêm vào với chuỗi truyền vào để lấy ra số tồn tại của kí tự lặp nhiều nhất
        //lần lặp 3 in ra kết quả
        
        //Dữ liệu kiểm thử
        //TH1 : nhập vào 1 chuỗi các kí tự chỉ xuất hiện 1 lần
        //TH2 : Nhập vào 1 chuỗi tồn tại kí tự xuất hiện nhiều lần
        //TH3 : Nhập vào 1 mảng rỗng
        public void HandleString(String s){
            List<Character> a = new ArrayList<Character>();
            for(int i=0;i<s.length();i++){
                if(!a.contains(s.charAt(i))){
                    a.add(s.charAt(i));
                }
            }
            int max = 0;
            for(Character value:a){
                int count = 0;
                for(int i=0;i<s.length();i++){
                    if(value == s.charAt(i)){
                        count++;
                    }
                }
                if(count > max){
                    max = count;
                }
            }
            System.out.println("\n---- Nhung ki tu xuat hien tan xuat cao ----\n");
            for(Character value:a){
                int count = 0;
                for(int i=0;i<s.length();i++){
                    if(value == s.charAt(i)){
                        count++;
                    }
                }
                if(count == max){
                    System.out.print(value + "\t");
                }
            }
        }
    }
    
    public class Bai16{
        //phân tích : sử dụng hàm replace để thay thế chữ Hello world bằng dấu + 
        //sau đó đếm số lượng dấu cộng -> số lần lặp của từ Hello world
        
        //Dữ liệu kiểm thủ
        //TH1 : Nhập vào 1 chuỗi có từ 1 -> nhiều chữ Hello world
        //TH2 : Nhập vào 1 chuỗi không có chữ Hello nào
        public int HandleString(String s){
            int result = 0;
            String value = "Hello world";
            
            s = s.replace(value, "+");
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '+'){
                    result ++;
                }
            }
            return result;
        }
    }
    
    // ------ Ham Main -----
    
    public static void main(String[] args){
        App app = new App();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap So De Chay Chuong Trinh : ");
        int stt = sc.nextInt();
        switch(stt){
            case 1:{
                App.Bai1 bai1 = app.new Bai1();
                System.out.println("------ Bai 1 ----- ");
                System.out.println("Nhap 1 So Nguyen To : ");
                int a = sc.nextInt();
                if(bai1.examSNT(a) == true){
                    System.out.println(a + " la so nguyen to");
                }else{
                    System.out.println(a + " khong la so nguyen to");
                } 
            };break;
            
            case 2:{
                App.Bai2 bai2 = app.new Bai2();
                System.out.println("Nhap a =  ");
                int a = sc.nextInt();
                System.out.println("Nhap b =  ");
                int b = sc.nextInt();
                System.out.println("Nhap c =  ");
                int c = sc.nextInt();
                bai2.calculator(a, b, c);
            };break;
            
            case 3:{
                App.Bai3 bai3 = app.new Bai3();
                System.out.println("Nhap a =  ");
                int a = sc.nextInt();
                System.out.println(bai3.factorial(a));
            };break;
            
            case 4:{
                App.Bai4 bai4 = app.new Bai4();
                System.out.println("Nhap k =  ");
                int a = sc.nextInt();
                System.out.println("Nhap n =  ");
                int b = sc.nextInt();
                System.out.println(bai4.Combination(a,b));
            };break;
            
            case 5:{
                App.Bai5 bai5 = app.new Bai5();
                System.out.println("Nhap a =  ");
                int a = sc.nextInt();
                System.out.println("Nhap b =  ");
                int b = sc.nextInt();
                
                System.out.println("Ket qua = " + bai5.UCLN(a,b));
            };break;
            
            case 6:{
                App.Bai6 bai6 = app.new Bai6();
                App.Bai1 bai1 = app.new Bai1();
                System.out.println("Nhap n =  ");
                int n = sc.nextInt();
                int[] a = new int[n];
                bai6.InputArray(a, n);
                bai6.RenderArray(a, n);
                System.out.println(""); 
                bai6.handleInput(a, n, bai1);
            };break;
            
            case 7:{
                App.Bai7 bai7 = app.new Bai7();
                App.Bai6 bai6 = app.new Bai6();
                System.out.println("Nhap n =  ");
                int n = sc.nextInt();
                int[] a = new int[n];
                bai7.InputArray(a, n, bai6);
                bai7.RenderArray(a, n, bai6);
                bai7.Sort_Array(a, n);
                System.out.println("\n ------ sau khi sap xep ------");
                bai7.RenderArray(a, n, bai6);
                System.out.print("\nNhap gia tri tim kiem : ");
                int k = sc.nextInt();
                System.out.println("vi tri : " + bai7.Search(a, 0, n-1, k));
            };break;
            
            case 11:{
                App.Bai11 bai11 = app.new Bai11();
                App.Bai1 bai1 = app.new Bai1();
                System.out.println("Nhap n =  ");
                int n = sc.nextInt();
                System.out.println("Nhap m =  ");
                int m = sc.nextInt();
                int[][] a = new int[n][m];
                bai11.InputArray(a, n, m);
                bai11.RenderArray(a, n, m);
                System.out.println("\nSNT max = " + bai11.HandleArray(a, n, m, bai1));
            };break;
            
            case 12:{
                App.Bai12 bai12 = app.new Bai12();
                bai12.InitArrayTwo2D();
                bai12.RenderArray();
                System.out.println("\n==== Hien Thi Ket Qua ====\n");
                bai12.MultiTwoArr();
            };break;
            
            case 14:{
                App.Bai14 bai14 = app.new Bai14();
                String str;
                System.out.print("Nhap vao 1 chuoi : ");
                str = sc.nextLine();
                System.out.print("\nSo ky tu khac nhau = " + bai14.HandleString(str));
            };break;
            
            case 15:{
                App.Bai15 bai15 = app.new Bai15();
                System.out.print("Nhap Vao 1 Chuoi : abcaiobidba");
                System.out.print("");
                bai15.HandleString("abcaiobidba");
            };break;
            
            case 16:{
                App.Bai16 bai16 = app.new Bai16();
                System.out.print("Nhap Vao 1 Chuoi : Hello world toi la Hello world");
                System.out.print("\nSo lan xuat hien Hello world la : " + bai16.HandleString("Hello world toi la Hello world"));
            };break;
        }
        
        
    }

}

