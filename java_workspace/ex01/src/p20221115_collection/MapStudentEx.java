package p20221115_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student{
    private int id;
    private String tel;

    public Student(int id, String tel){
        this.id = id;
        this.tel = tel;
    }

    public int getId(){
        return id;
    }

    public String getTel(){
        return tel;
    }

    public String toString(){
        return "id : " + id + ", tel : " + tel;
    }


}
public class MapStudentEx {
    public static void main(String[] args) {
        /*
        (학생 이름, Student객체)를 저장하는 해시맵 만들기
        3명의 학생 저장하기

        홍길동, id : 1, tel : 010-1111-1111
        임꺽정, id : 2, tel : 010-2222-2222
        일지매, id : 3, tel : 010-3333-3333

        반복문을 사용해서 학생이름으로 학생정보 조회하기
        검색할 이름? 이라고 물어볼 때 학생 이름을 키보드로 입력
        "exit"를 입력하면 반복문 종료
        이름에 해당하는 Student객체 검색
        해당이름의 학생이 존재하지 않으면 "OO는 없는 사람입니다." 출력

        출력예시
        검색할 이름 : 홍길동
        id : 1, tel : 010-1111-1111
        검색할 이름 : 고길동
        고길동은 없는 사람입니다.
        검색할 이름 : exit
        프로그램을 종료합니다.
         */
        Map<String, Student> studentMap = new HashMap<>();

        studentMap.put("홍길동", new Student(1, "010-1111-1111"));
        studentMap.put("임꺽정", new Student(2, "010-2222-2222"));
        studentMap.put("일지매", new Student(3, "010-3333-3333"));

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("검색할 이름 : ");
            String name = sc.nextLine();
            if(name.toLowerCase().equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            Student s = studentMap.get(name);
            if(s == null){
                System.out.println(name + "은 없는 사람입니다.\n");
            }else{
                System.out.println(s);
                System.out.println();
            }
        }
        sc.close();
    }
}
