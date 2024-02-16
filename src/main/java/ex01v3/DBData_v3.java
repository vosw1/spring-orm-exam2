package ex01v3;

import ex01.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class DBData_v3 {
    private int boardId;
    private String title;
    private String content;
    private int userId;
    private String username;
    private String email;

    // 바꾸려고하는 소스에서 적는 코드
    public ViewData_v3 toViewData() {
        return new ViewData_v3(
                boardId,
                title,
                content,
                new User(userId, username, email)
        );
    }
}
