package rikkei.academy.Impl;

import rikkei.academy.Student;
import rikkei.academy.service.IStudent;

import java.util.ArrayList;
import java.util.List;

public class StudentImpl implements IStudent {
    public static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student("Vuong", "Nam", 21));
        studentList.add(new Student("Yen", "Nu", 23));
        studentList.add(new Student("Chuan", "Nam", 23));
        studentList.add(new Student("Van", "Nu", 20));
        studentList.add(new Student("Son", "Nam", 25));
    }
    @Override
    public List<Student> findAll() {
        return studentList;
    }
}