package ex01v2;

import ex01.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ViewData_v2 {
    private int boardId;
    private String title;
    private String content;

    private User user;

    // 직접 생성자를 만들어야 함

    public ViewData_v2(DBData_v2 dbData) {
        this.boardId = dbData.getBoardId();
        this.title = dbData.getTitle();
        this.content = dbData.getContent();
        this.user = new User(dbData.getUserId(), dbData.getUsername(), dbData.getEmail());
    }
}
