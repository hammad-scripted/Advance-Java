package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Demo3 {

    static void main() {

        //! Comparator is an interface which have a compare method which we override

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(24);
        list.add(9);
        list.add(90);
        list.add(33);

        Collections.sort(list, comparator);
        System.out.println(list);
        List<Student> students = new ArrayList<>();

        students.add(new Student(20, "Fazil"));
        students.add(new Student(24, "Adnaan"));
        students.add(new Student(25, "Hammad"));

        Comparator<Student> studentComparator = new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
                // return o1.age-o2.age;
            }
        };

        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, studentComparator);
        System.out.println(students);

    }
}
