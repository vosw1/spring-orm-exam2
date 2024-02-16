package ex01v2;

public class App_v2 {
    public static void main(String[] args) {
        // 1. DB에서 가져온 데이터 - Flat(평평) 하게 가져올 수 밖에 없다
        DBData_v2 dbData = new DBData_v2(1, "제목1", "내용1", 3, "love", "love@nate.com");

        // 2. dbData1를 ViewData1에 옮기시오 - ORM
        ViewData_v2 viewData_v2 = new ViewData_v2(dbData);
        System.out.println(viewData_v2);

    }
}