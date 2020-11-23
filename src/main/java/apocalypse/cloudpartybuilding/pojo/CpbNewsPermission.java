package apocalypse.cloudpartybuilding.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class CpbNewsPermission {
    private Integer id;

    private Integer userId;

    private Integer editable;

    private Integer commentable;

    private Integer review;

    private Integer release;

    private Integer status;
}