package mainclasshostpital;

import java.util.Scanner;

class staffdemo
{
    String sid, sname, desg, sex;
    int salary;
    void new_staff()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        sid = input.nextLine();
        System.out.print("name:-");
        sname = input.nextLine();
        System.out.print("desigination:-");
        desg = input.nextLine();
        System.out.print("sex:-");
        sex = input.nextLine();
        System.out.print("salary:-");
        salary = input.nextInt();
    }
    void staff_info()
    {
        System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary);
    }
}
public class hospital{
	public static void main(String[] args) {
        staffdemo[] s = new staffdemo[100];
int i;
int count6=4;
for (i = 0; i < 100; i++)
    s[i] = new staffdemo();
s[0].sid = "22";
s[0].sname = "Prakash";
s[0].desg = "Worker";
s[0].sex = "Male";
s[0].salary = 5000;
s[1].sid = "23";
s[1].sname = "Komal";
s[1].desg = "Nurse";
s[1].sex = "Female";
s[1].salary = 2000;
s[2].sid = "24";
s[2].sname = "Raju";
s[2].desg = "Worker";
s[2].sex = "Male";
s[2].salary = 5000;
s[3].sid = "25";
s[3].sname = "Rani";
s[3].desg = "Nurse";
s[3].sex = "Female";
s[3].salary = 20000;
Scanner input = new Scanner(System.in);
int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
while (status == 1)
{
    System.out.println("\n                                    MAIN MENU");
    System.out.println("-----------------------------------------------------------------------------------");



    System.out.println("1.Doctos  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Staff ");
    System.out.println("-----------------------------------------------------------------------------------");
    choice = input.nextInt();
    switch(choice) {
    
    
	case 6:
    {
        s6 = 1;
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                       **STAFF SECTION**");
        System.out.println("--------------------------------------------------------------------------------");
        while (s6 == 1)
        {
            String a = "nurse", b = "worker", c = "security";
            System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
            c1 = input.nextInt();
            switch (c1)
            {
                case 1:
                    {
                        s[count6].new_staff();count6++;
                        break;
                    }
                case 2:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("id \t Name \t Gender \t Salary");
                        System.out.println("--------------------------------------------------------------------------------");
                        for (j = 0; j < count6; j++)
                        {
                            //if (a.equals(s[j].desg))
                                s[j].staff_info();
                        }
                        break;
                    }
                case 3:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("id \t Name \t Gender \t Salary");
                        System.out.println("--------------------------------------------------------------------------------");
                        for (j = 0; j < count6; j++)
                        {
                            if (b.equals(s[j].desg))
                                s[j].staff_info();
                        }
                        break;
                    }
                case 4:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("id \t Name \t Gender \t Salary");
                        System.out.println("--------------------------------------------------------------------------------");
                        for (j = 0; j < count6; j++)
                        {
                            if (c.equals(s[j].desg))
                                s[j].staff_info();
                        }
                        break;
                    }
            }
            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            s6 = input.nextInt();
        }
        break;
    }
}
}
}}

	