package ex02;

import ex02.model.Reply;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public class ViewData2 {
    private int boardId;
    private String title;
    private String content;

    // Board 데이터만 넣는 생성자
    public ViewData2(List<DBData2> dbList) {
        if (dbList.size() > 0) { // 0일때 터짐 방지
            this.boardId = dbList.get(0).getBoardId();
            this.title = dbList.get(0).getTitle();
            this.content = dbList.get(0).getContent();
        }
        // 첫번째 방법
        //dbList.stream().forEach(data -> {
        //    addReply((new Reply(data.getReplyId(), data.getComment())));//});
        // 두번째 방법
        // map으로 가공해서 toList로 수집하면 data가 reply가 됨
        // replies = dbList.stream().map(data->new Reply(data.getReplyId(), data.getComment())).toList();

        // 세번째 방법
        for(DBData2 data : dbList) {
            Reply r = new Reply(data.getReplyId(), data.getComment());
            addReply(r);
        }
    }


    // 댓글들은 addReply로 추가하기 // 한건씩 만들어야하기 때문에 setter로 해결이 안되기 때문
    private List<Reply> replies = new ArrayList<>();

    public void addReply(Reply reply) {
        replies.add(reply);
    }
}
