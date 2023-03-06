import java.util.ArrayList;
public class DSchoolList {
    // data section
    ArrayList<School> schools = new ArrayList<>();

    public void addSchool(School sc) {
        schools.add(sc);
    }

    public void display() {
        for (int i=0; i<schools.size(); i++) {
            System.out.print(schools.get(i));
        }
    }

}
