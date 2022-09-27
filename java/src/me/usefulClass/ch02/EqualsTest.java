package me.usefulClass.ch02;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student std1 = new Student(123, "Kim");
        Student std2 = new Student(123, "Kim");
        Student std3 = std1;

        System.out.println(std1 == std2); // 실제 주소는 다름
        System.out.println(std1.equals(std2)); // 논리적으로는 같음

        System.out.println(std1.hashCode()); // 논리적으로 같아서 같은 해쉬코드값 반환
        System.out.println(std2.hashCode());

        System.out.println(System.identityHashCode(std1)); // std1의 진짜 해쉬코드 값 출력
        System.out.println(System.identityHashCode(std2)); // std2의 진짜 해쉬코드 값 출력


        std1.setStudentName("Yu");
        Student copyStudent = (Student)std1.clone();

        System.out.println(copyStudent);
        System.out.println(std1);

    }
}
