using System;

namespace Bai_4
{
    class Program
    {
        static void Main(string[] args)
        {
            Person A = new Person();
            A.ID = "ABC";
            A.Name = "Hahaha";
            A.Age = 19;
            A.Email = "pvzbigfans@gmail.com";
            A.Address = "Homeless";

            Console.WriteLine("Person A Info");
            Console.WriteLine($"ID = {A.ID}");
            Console.WriteLine($"Name = {A.ID}");
            Console.WriteLine($"Age = {A.ID}");
            Console.WriteLine($"Email = {A.ID}");
            Console.WriteLine($"Address = {A.Address}");

            A.CheckAge();


        }
    }
}
