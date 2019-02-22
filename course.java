import java.util.*;
 
 
 
public class Course implements Comparable<Course> {
    String courseName;
    int numberOfStudents;
    String courseLecturer;
     
    public Course (String cou_nam, int cou_numStud, String cou_lect) {
        courseName = cou_nam;
        numberOfStudents = cou_numStud;
        courseLecturer = cou_lect;
         
    }
     
    public String getCName() {
        return courseName;
    }
     
    public int getNumSTud() {
        return numberOfStudents;
    }
     
    public String getCLecturer() {
        return courseLecturer;
    }
     
    public void setCourseName(String cn) {
        courseName = cn;
    }
     
    public String toString() {
        return String.format("(%s,%d.%s)", courseName, numberOfStudents, courseLecturer);
    }
 
    @Override
    public int compareTo(Course o) {
        // TODO Auto-generated method stub
        return 0;
    }
    public static void main(String[] args) {
        List<Course> course1 = new ArrayList<Course>();
         
        course1.add(new Course("Java", 10, "Franco"));
        course1.add(new Course("Python", 25, "Quintilla"));
        course1.add(new Course("PHP", 15, "Nina"));
        course1.add(new Course("Ruby", 30, "Wendy"));
        course1.add(new Course("Visual", 25, "Christoffel"));
         
        System.out.println("This is the origanal course 1 list: " + course1);
        Collections.sort(course1, new CourseNumStudentsComparator());
        System.out.println("Sorted course 1 list as per number of students: " + course1);
         
        Collections.swap(course1, 2, 1);
        System.out.println("Swap list: " + course1);
         
        List<Course> course2 = new ArrayList<Course>();
         
        Collections.addAll(course2,(new Course("JavaScript", 101, "Almero")),(new Course("C++", 12, "Miguel")),(new Course("Basic", 5, "Ettiene")),(new Course("HTML5", 32, "Jesica")),(new Course("Node.JS", 18, "Ian")));
        System.out.println("This is the origanal course 2 list: " + course2);
         
        course2.addAll(course1);
        System.out.println("Combined courses: " + course2);
         
        Collections.addAll(course2, (new Course("Java 101", 55, "DR. P Green")),(new Course("Advanced Programming", 93, "Prof. M Milton")));
        System.out.println("New course2 list: " + course2);
         
        Collections.sort(course2, new CourseNameComparator());
        System.out.println("This is course2 sort alphabetically: " + course2);
         
        int index = Collections.binarySearch(course2, new Course("Java 101",0 , null),new CourseNameComparator());
        System.out.println("The index of Java 101 is : " + index);
         
        System.out.println("Is list course1 distjoint to list course2: " + Collections.disjoint(course1, course2));
         
        Course course2Max = Collections.max(course2, new CourseNumStudentsComparator());
        System.out.println("This is the course with the maximum of students: " + course2Max);
         
        Course course2Min = Collections.min(course2, new CourseNumStudentsComparator() );
        System.out.println("This is the course with the minimu of students: " + course2Min);
             
    }
 
 
}
 
class CourseNumStudentsComparator implements Comparator<Course>{
     
    @Override
    public int compare(Course student1, Course student2) {
        return student1.getNumSTud() - student2.getNumSTud();
    }
}
 
class CourseNameComparator implements Comparator<Course>{
     
     
     
 
    @Override
    public int compare(Course name1, Course name2) {
        return name1.getCName().compareTo(name2.getCName());
    }
}
