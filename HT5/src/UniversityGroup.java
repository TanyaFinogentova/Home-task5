
import java.util.ArrayList;
import java.util.List;

public class UniversityGroup {
    private String groupName;
    private int startYear, endYear;
    List<String> studentList = new ArrayList();

    public UniversityGroup(String name, int startYear) {
        groupName = name;
        this.startYear = startYear;
        endYear = startYear + 5;
    }

    public UniversityGroup(String groupName, int startYear, List<String> studentList) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.studentList = studentList;
        endYear = startYear + 5;
    }


    public String getGroupName() {
        return groupName;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }
    public List<String> getStudentlist() {
        return studentList;
    }

    public void getGroupDescription() {
        System.out.println("Group: "+ groupName);
        System.out.println("Start year: "+ startYear);
        System.out.println("End year: "+ endYear);
        System.out.println("Students: "+ studentList);
    }

    public boolean removeStudent (String student) {
        for (int i=0; i<studentList.size(); i++) {
            if (studentList.contains(student)) {
                studentList.remove(student);
                System.out.println("Student "+ student + " was removed.");
                return true;
            } else {
                System.out.println("Student wasn't found.");
                return false;
            }

        }
        return false;
    }

    public void addStudent (String student) {
        studentList.add(student);
        if (studentList.contains(student))
            System.out.println("Student "+ student + " was successfully added.");
        else System.out.println("Something goes wrong, try again.");
    }
    
}




