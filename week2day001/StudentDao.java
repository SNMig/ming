package com.javabase.week2day001;

public class StudentDao {
    private Student[] students = new Student[1];  //所有学生信息
    private int size; //学生的数量


    public void printStudents() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i].getName());
        }
    }
    //增加人员
    public void addStudent(Student student){
        if (student==null){
            return;
        }
        if (students.length==size){
            Student[] newStudent=new Student[size+1];
            System.arraycopy(students,0,newStudent,0,students.length);
            students=newStudent;
        }
        students[size++]=student;
    }
    //在指定的位置添加一个学生
    public void add(int index, Student student) {
        Student[] newStudent=new Student[size+1];
        System.arraycopy(students,0,newStudent,0,index);
        newStudent[index]=student;
        System.arraycopy(students,index,newStudent,index+1,size-index);
        students=newStudent;
        size++;

    }

    public Student query(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }

    /**
     * @param name
     * @return 查询到了，返回索引，查不到，返回-1
     */
    public int get(String name) {
        for (int i = 0; i < size; i++) {
            if(students[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

}
