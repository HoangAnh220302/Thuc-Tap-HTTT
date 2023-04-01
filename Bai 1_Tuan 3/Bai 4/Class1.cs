using System;
using System.Collections.Generic;
using System.Text;

namespace Bai_4
{
    class Person
    {
        public string ID { get; set;}
        public string Name { get; set; }
        public int Age { get; set; }
        public string Email { get; set; }
        public string Address { get; set; }

        public void CheckAge()
        {
            if (this.Age >= 18)
            {
                Console.WriteLine("Ban da du tuoi bau cu!");
            }
            else
            {
                Console.WriteLine("Ban chua du tuoi bau cu!");
            }
        }
    }
}
