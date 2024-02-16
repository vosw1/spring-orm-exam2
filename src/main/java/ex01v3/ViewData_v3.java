package ex01v3;

import ex01.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ViewData_v3 {
    private int boardId;
    private String title;
    private String content;

    private User user;
}
