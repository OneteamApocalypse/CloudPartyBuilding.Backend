package apocalypse.cloudpartybuilding.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class CpbNewsMultimedia {
    private Integer id;

    private String newsMultimediaPath;

    private String newsId;
}