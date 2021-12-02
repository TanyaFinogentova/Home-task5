import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            UniversityGroup testGroup = new UniversityGroup("test", 2000);

            testGroup.addStudent("Tanya Finogentova");
            testGroup.addStudent("Vasya Pupkin");
            testGroup.addStudent("Pavel Bad");
            testGroup.addStudent("Victor Winner");
            testGroup.addStudent("Kostya Grechka");
            testGroup.getGroupDescription();

            testGroup.removeStudent("Tanya Finogentova");
            testGroup.getGroupDescription();

            List<String> studentList = new ArrayList();
            studentList.add("Vasiliy Good");
            studentList.add("Masha Rossomasha");
            studentList.add("Yulia Prepoddancer");
            studentList.add("Morty Smith");
            studentList.add("Vitalii Tanchikov");
            UniversityGroup testGroup2 = new UniversityGroup("test2", 2005, studentList);
            testGroup2.getGroupDescription();
            testGroup2.removeStudent("Morty Smith");
            testGroup2.getGroupDescription();

        }

}
