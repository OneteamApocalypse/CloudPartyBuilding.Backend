package apocalypse.cloudpartybuilding.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class tUser {
    private Integer id;
    private String username;
    private String password;
}
