package mydiary;

import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    /*
    사용자에게 '무슨 일을 해라'라는 지시문을 제공해야 한다.
    사용자로부터 전해받은 데이터를 (db에 전송하기 위해서) 서비스객체에 전달한다.
    사용자에게 데이터를 전해 받는다 ---> 사용자가 데이터를 입력할 수 있어야 한다.
    사용자는 어떻게 시스템에 데이터를 입력하는가 ---> 키보드 ---> Scanner
    */

    Scanner sc = new Scanner(System.in);

    //서비스 객체를 생성한다.
    DiaryServiceImpl service = new DiaryServiceImpl();

    //사용자가 일기 시스템을 사용하는데 필요한 화면 목록을 떠올려보자.

    //1. 일기를 쓴다. 2. 일기를 조회한다. --> 메인메뉴 화면

    //메인메뉴를 보여주는 기능 --> 메소드

    public void showMainUI(){
        //메뉴를 선택할 수 있도록 메뉴목록을 보여주자.
        System.out.println("----------My Diary v1.0----------");
        System.out.println("1. 일기 쓰기");
        System.out.println("2. 일기 목록 보기");
        System.out.println("0. 종료하기");
        System.out.print("\n메뉴 선택 : ");
        int selMenu = sc.nextInt();
        sc.nextLine();

        switch (selMenu){
            case 1: // 일기 쓰기 화면으로 이동하기
                showWriteUI();
                break;
            case 2: // 일기 목록 보기 화면으로 이동하기
                showListUI();
                break;
            case 0: // 종료하기 - 프로그램 종료
                System.out.println("프로그램을 종료합니다...");
                System.exit(0);
                break;
            default:
                System.out.println();
        }
    }

    private void showListUI() {
        System.out.println("----------일기 목록 보기 화면----------");
        // db로부터 일기 목록 데이터(ArrayList)가 전달되어 와야한다.
        // 서비스한테 데이터를 달라고 요청한다.(그러면 서비스느 dao한테 db(배열) 자료를 달라고
        ArrayList<Diary> list = service.getList();
        System.out.println("번호         |날짜        |제목");
        for(Diary diary : list){
            System.out.print(diary.getDno() + " | ");
            System.out.print(diary.getDate() + " | ");
            System.out.println(diary.getTitle() + " | ");
        }
        //상세보기를 할거냐...상세보기 화면으로 가기(showDiaryUI())
        //아니면...메인화면으로(showMainUI())
        System.out.println();
        System.out.print("상세보기할 일기의 번호를 입력하세요(없으면 그냥 Enter키를 입력해주세요.) : ");
        String ans = sc.nextLine();
        //만약 엔터키를 눌렀으면...메인화면으로
        if(ans.length() == 0){
            showMainUI();
            return;
        }
        //상세보기 화면으로 가려면...
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getDno().equals(ans)){
                showDiaryUI(ans);
                return;
            }
        }
        System.out.println("해당하는 일기 번호가 존재하지 않습니다.");
        showMainUI();
    }

    private void showDiaryUI(String dno) {
        // 서비스의 getDiary(String dno)메소드를 사용하자.
        Diary diary = service.getDiary(dno);
        System.out.println(diary.getDno());
        System.out.println(diary.getDate());
        System.out.println(diary.getTitle());
        System.out.println(diary.getContent());

        while(true){
            System.out.println("-----------------------------");
            System.out.println("1. 일기 목록보기 화면으로 가기");
            System.out.println("2. 메인 화면으로 가기");
            System.out.print("메뉴를 선택해주세요 : ");
            int selMenu = sc.nextInt();
            sc.nextLine();

            switch (selMenu){
                case 1: //일기 목록보기 화면으로 가기
                    showListUI();
                    break;
                case 2: //메인 화면으로 가기
                    showMainUI();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다...");
                    continue;
            }
            break;//반복문 나가기용
        }
    }

    private void showWriteUI() {
        System.out.println("일기 쓰기 화면 입니다.");
        System.out.print("날짜를 입력하세요(yyyy/MM/dd) : ");
        String date = sc.nextLine();
        String[] tempDate = date.split("/");
        /*
        date = "2022/11/13"
        tempDate[0] = 2022
        tempDate[1] = 11
        tempDate[2] = 13
         */

        int year = Integer.parseInt(tempDate[0]);
        int month = Integer.parseInt(tempDate[1]);
        int day = Integer.parseInt(tempDate[2]);

        Date d = new Date(year, month, day);

        System.out.print("제목을 입력하세요 : ");
        String title = sc.nextLine();
        System.out.println("내용을 입력하세요(다쓰면 '끝.'이라고 쓰세요) : ");
        String content = sc.nextLine();
        StringBuffer sb = new StringBuffer(content);
        while(true){
            content = sc.nextLine();
            if(content.equals("끝.")){
                break;
            }
            sb.append(content);
        }
        content = sb.toString();

        /*
        사용자로부터 입력받은 데이터를 Diary 타입의 자료로 만들자.
        왜? 서비스의 regist메소드가 매개변수로 Diary 타입을 원하니까...
         */
        Diary diary = new Diary(d, title, content);
        service.regist(diary);
        showListUI();
    }


}
