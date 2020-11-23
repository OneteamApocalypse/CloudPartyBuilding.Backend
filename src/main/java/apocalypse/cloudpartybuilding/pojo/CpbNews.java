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
public class CpbNews {
    private String id;

    private String name;

    private String subtitle;

    private Integer author;

    private Integer publisher;

    private Date date;

    private String content;

    private Integer type;

    private Integer reviewId;

    private Integer status;
}