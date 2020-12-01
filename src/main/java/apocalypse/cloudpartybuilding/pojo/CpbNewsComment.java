package apocalypse.cloudpartybuilding.pojo;

import lombok.*;
import org.springframework.stereotype.Service;

import java.util.Date;

@Data
@AllArgsConstructor
@Getter
@Setter
public class CpbNewsComment {
    private Integer id;

    private Integer userId;

    private String content;

    private Date date;

    private String newsId;

    private Integer lastCommentId;

    public CpbNewsComment() {
    }
}