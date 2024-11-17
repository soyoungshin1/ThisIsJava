package ch13.sec05;

public class Course {
    //모든 사람이면 등록 가능
    public static void registerCourse1(Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1 을 등록함");
    }

    //학생만 등록 가능
    //Student 이거나 Student 의 자식 타입만 가능
    public static void registerCourse2(Applicant<? extends Student> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2 을 등록함");
    }

    //직장인 및 일반인만 등록 가능
    //Worker 이거나 Worker 의 부모 타입만 가능
    public static void registerCourse3(Applicant<? super Worker> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3 을 등록함");
    }
}
