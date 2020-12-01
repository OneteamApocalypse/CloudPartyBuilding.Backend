package apocalypse.cloudpartybuilding.pojo;

import lombok.*;

@Data
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Grades {
    private Integer gradesid;

    private Integer usersid;

    private String usersname;

    private Integer grades;

    public Integer getGradesid() {
        return gradesid;
    }

    public void setGradesid(Integer gradesid) {
        this.gradesid = gradesid;
    }

    public Integer getUsersid() {
        return usersid;
    }

    public void setUsersid(Integer usersid) {
        this.usersid = usersid;
    }

    public String getUsersname() {
        return usersname;
    }

    public void setUsersname(String usersname) {
        this.usersname = usersname == null ? null : usersname.trim();
    }

    public Integer getGrades() {
        return grades;
    }

    public void setGrades(Integer grades) {
        this.grades = grades;
    }
}