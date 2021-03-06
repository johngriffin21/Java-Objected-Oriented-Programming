//This time the Student class is defined differently. The mark and name fields are private so that you can't access them directly. Now, you must use the getName() amd getMark() accessor (AKA getter) methods. Modify your print method so that it uses the accessor methods.

//A Student is defined as:

public class Student
{
   private String name;
   private int mark;

   public Student(String n, int m)
   {
      name = n;
      mark = m;
   }

   public String getName()
   {
      return name;
   }

   public int getMark()
   {
      return mark;
   }
}
//As before, the class that creates the array is similar to

public class GroupStudents
{
   public static void main(String [] args)
   {
      Student [] group = {
               new Student("John", 50),
               new Student("Abby", 40),
               new Student("Dylan", 20),
               new Student("Carl", 70),
               new Student("Maeve", 70),
               new Student("Chris", 46),
               new Student("James", 55),
               new Student("Anne", 63),
            };

      Test.print(group);
   }
}
//The program will be compiled using javac GroupStudents.java and run using java GroupStudents The output should be:

$ java GroupStudents 
50 (John)
40 (Abby)
20 (Dylan)
70 (Carl)
70 (Maeve)
46 (Chris)
55 (James)
63 (Anne)

a

import java.util.Arrays;

public class Test
{
   public static void print(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
        System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
   }
}