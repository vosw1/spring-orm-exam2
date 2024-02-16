package ex01v3;

import ex01.DBData1;
import ex01v3.model.User_v3;

public class App_v3 {
    public static void main(String[] args) {
        // 1. DB에서 가져온 데이터 - Flat(평평) 하게 가져올 수 밖에 없다
        DBData_v3 dbData = new DBData_v3(1, "제목1", "내용1", 3, "love", "love@nate.com");

        // 2. dbList(컬렉션을) ViewData2(오브젝트)에 옮기시오 - ORM
        ViewData_v3 viewData = dbData.toViewData();
        System.out.println();
        System.out.println(viewData);
    }
}
