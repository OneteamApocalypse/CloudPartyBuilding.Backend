package apocalypse.cloudpartybuilding.service.implement;

import apocalypse.cloudpartybuilding.mapper.UserFileDAO;
import apocalypse.cloudpartybuilding.pojo.UserFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Service
@Transactional
public class UserFileServiceImpl {
    @Autowired
    private UserFileDAO userFileDAO;


    public List<UserFile> findByUserId(Integer id) {
        userFileDAO.findByUserId(id);
        return userFileDAO.findByUserId(id);
    }


    public void save(UserFile userFile) {
        // userFile.setIsImg(); // 是否是图片: 解决方案: 当类型中含有image时说明当前类型一定为图片类型
        String isImg = userFile.getType().startsWith("image") ? "是" : "否";
        userFile.setIsImg(isImg);
        userFile.setDowncounts(0);
        userFile.setUploadTime(new Date());
        userFileDAO.save(userFile);
    }

    public UserFile findById(Integer id) {
        return userFileDAO.findById(id);
    }


    public void update(UserFile userFile) {
        userFileDAO.update(userFile);
    }


    public void delete(Integer id) {
        userFileDAO.delete(id);
    }
}
