package ex02_v2;

import ex02_v2.model.Reply_v2;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public class ViewData_v2 {
    private int boardId;
    private String title;
    private String content;

    // Board 데이터만 넣는 생성자
    public ViewData_v2(int boardId, String title, String content) {
        this.boardId = boardId;
        this.title = title;
        this.content = content;
    }

    // 댓글들은 addReply로 추가하기
    private List<Reply_v2> replies = new ArrayList<>();

    public void addReply(Reply_v2 replyV2){
        replies.add(replyV2);
    }
}
