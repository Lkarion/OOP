package com.company;

public class StudentsGrades {
    //Do you remember the tasks about students and grades? Try to create the class or classes those ft
    // best for this task

    //1 Given two arrays. The first is String[n] students – names of students.
    // The second is int[n][] grades – the array of grades for student homework.
    // Every row of grades array is one student's grades (grades[k] is the grades of students[k]).
    // Note, that each student has a different number of grades. You should implement the program
    // that finds and displays the student with highest GPA and the score.
    //Example:
    //{Jack, Nick} { { 3,4,2}, {5,5,5,4} } -> Nick 4.75
    String name;
    int[] grades;
    /*  StudentsGrades s1 = new StudentsGrades();
    s1.name = "Jack";
    s1.grades = new int[]{3, 4, 2};
    StudentsGrades s2 = new StudentsGrades();
    s2.name = "Nick";
    s2.grades = new int[]{5,5,5,4};
    StudentsGrades s3 = new StudentsGrades();
    s3.name = "John";
    s3.grades = new int[]{5,5,5,5,5,5,5,5 };

    StudentsGrades[] array = {s1,s2,s3};
    StudentsGrades.printHighestGPA(array,);*/

    /*
    public static void printHighestGPA(StudentsGrades[] array, int[] noten) {
        double max = getGPA(array.grades[0]);
        int index = 0;
        for (int i = 1; i < grades.length; i++) {
            if (max < getGPA(grades[i])){
                max = getGPA(grades[i]);
                index=i;
            }
        }
        String gpa = String.format("%.2f",max);
        System.out.println(students[index]+" "+gpa);
    }
    public static double getGPA(int[] grades){
        double sum=0;
        for (int grade: grades) {
            sum+=grade;
        }
        return sum / grades.length;*/
}
