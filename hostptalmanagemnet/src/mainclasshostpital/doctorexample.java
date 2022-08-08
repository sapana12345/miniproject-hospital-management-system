package mainclasshostpital;

import java.util.Scanner;
class doctordemo
{
    String did, dname, specilist, appoint, doc_qual;
    int droom;
    void new_doctor()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        did = input.nextLine();
        System.out.print("name:-");
        dname = input.nextLine();
        System.out.print("specilization:-");
        specilist = input.nextLine();
        System.out.print("work time:-");
        appoint = input.nextLine();
        System.out.print("qualification:-");
        doc_qual = input.nextLine();
        System.out.print("room no.:-");
        droom = input.nextInt();
    }
    void doctor_info()
    {
        System.out.println(did + "\t" + dname + "  \t" + specilist + "     \t" + appoint + "    \t" + doc_qual + "       \t" + droom);
    }
}
public class doctorexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        doctordemo[] d = new doctordemo[25];
        int i;
        int count1=4;
        for (i = 0; i < 25; i++)
      d[i] = new doctordemo();

	    d[0].did = "21";
        d[0].dname = "Dr.Ghanendra";
        d[0].specilist = "ENT";
        d[0].appoint = "5-11AM";
        d[0].doc_qual = "MBBS,MD";
        d[0].droom = 17;
        d[1].did = "32";
        d[1].dname = "Dr.Vikram";
        d[1].specilist = "Physician";
        d[1].appoint = "10-3AM";
        d[1].doc_qual = "MBBS,MD";
        d[1].droom = 45;
        d[2].did = "17";
        d[2].dname = "Dr.Rekha";
        d[2].specilist = "Surgeon";
        d[2].appoint = "8-2AM";
        d[2].doc_qual = "BDM";
        d[2].droom = 8;
        d[3].did = "33";
        d[3].dname = "Dr.Pramod";
        d[3].specilist = "Artho";
        d[3].appoint = "10-4PM";
        d[3].doc_qual = "MBBS,MS";
        d[3].droom = 40;
        Scanner input = new Scanner(System.in);
      int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        while (status == 1)
        {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");

 

            System.out.println("1.Doctos  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Staff ");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();

		switch (choice)
        {
            case 1:
                {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                      **DOCTOR SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s1 = 1;
                    while (s1 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Existing Doctors List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                                {
                                    d[count1].new_doctor();count1++;
                                    break;
                                }
                            case 2:
                                {
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");



                                   System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count1; j++)
                                    {
                                       d[j].doctor_info();                                  }
                                    break;
                                }
                        }
                      System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                       s1 = input.nextInt();
                    }
                    break;
                }
        }
                System.out.println("\nReturn to MAIN MENU Press 1");
                status = input.nextInt();        
        

	}

}
}
	