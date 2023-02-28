package com.javabase.week2day001;

public class Studentexample {
    private Student[] students = new Student[2];  //所有学生信息
    private int size; //学生的数量

    //1，查询学生中在读的人数
    //2, 计算学生中男生与女生的数量之差

    public void add(Student student) {
        //参数有效性校验
        if (student == null) {
            System.out.println("参数不能为null");
            return;
        }
        //判断是否需要扩容
        grow();
        students[size++] = student;
    }

    public void add(int index, Student student) {
        if (index < 0 || index > size) {
            System.out.println("参数不合法");
            return;
        }
        if (student == null) {
            System.out.println("参数不合法");
            return;
        }
        grow();

        //将索引位置到最后的元素依次向后移动
        for (int i = size; i > index; i--) {
            students[i] = students[i - 1];
        }

        students[index] = student;
        size++;
    }

    private void grow() {
        if (size == students.length) {
            Student[] newStudents = new Student[students.length * 2];
            System.arraycopy(students, 0, newStudents, 0, students.length);
            students = newStudents;
        }
    }

    public Student query(String name) {
        int i = get(name);
        if (i != -1) {
            return students[i];
        }
        return null;
    }

    public Student query2(String name) {
        if (name == null) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            if (name.equals(students[i].getName())) {
                return students[i];
            }
        }
        return null;
    }

    /**
     * @param name
     * @return 查询到了，返回索引，查不到，返回-1
     */
    public int get(String name) {
        if (name == null) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (name.equals(students[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public void printStudents() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i].getName());
        }
    }
}
