package apocalypse.cloudpartybuilding.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

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
}