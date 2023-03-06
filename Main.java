import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of data: ");
        int numdata = scanner.nextInt();

        Marks marks = new Marks(numdata);
        marks.createData();
        PrincipalName principalName = new PrincipalName("Amy", "Weng");
        Address address = new Address("No 33, Jalan Damai Bakti", "31620", "Cheras", "Kuala Lumpur");
        School school = new School("Sk Raudah", address, principalName, marks);

        school.setNumberParticipants();
        System.out.println(school.toString());
        System.out.printf("Average Score     : %.2f", marks.average());
        System.out.printf("\nStandard Deviation: %.2f", marks.stanDev(marks.average()));

        DSchoolList dl = new DSchoolList();

        School sc = new School();
        sc.setName("St Patrick");
        dl.addSchool(sc);

        School sc2 = new School();
        sc2.setName("Woodsville");
        dl.addSchool(sc2);

        dl.display();
    }
}
