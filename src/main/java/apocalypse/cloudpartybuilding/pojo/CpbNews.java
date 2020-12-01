package apocalypse.cloudpartybuilding.pojo;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
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