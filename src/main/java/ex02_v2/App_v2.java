package ex02_v2;

import ex02_v2.model.Reply_v2;

import java.util.Arrays;
import java.util.List;

public class App_v2 {
    public static void main(String[] args) {
        // 1. DB에서 가져온 데이터 - Flat(평평) 하게 가져올 수 밖에 없다
        DBData_v2 dbData1 = new DBData_v2(1, "제목1", "내용1", 1, "댓글1");
        DBData_v2 dbData2 = new DBData_v2(1, "제목1", "내용1", 2, "댓글2");
        DBData_v2 dbData3 = new DBData_v2(1, "제목1", "내용1", 3, "댓글3");

        List<DBData_v2> dbList = Arrays.asList(dbData1, dbData2, dbData3);
        // 생성자에 디비리스트 넣고
        // 2. dbList(컬렉션을) ViewData2(오브젝트)에 옮기시오 - ORM
        if (dbList.size() == 0) return; // 값이 null일때 처리하기

        ViewData_v2 viewData_v2 = new ViewData_v2(
                //리스트에 추가하기
                dbList.get(0).getBoardId(),
                dbList.get(0).getTitle(),
                dbList.get(0).getContent()
        );

        for (DBData_v2 data : dbList) { //댓글 갯수만큼 반복문 돌리기
            Reply_v2 r = new Reply_v2(data.getReplyId(), data.getComment());
            viewData_v2.addReply(r);
        }
    }
}
