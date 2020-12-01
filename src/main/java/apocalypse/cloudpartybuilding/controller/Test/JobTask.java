package apocalypse.cloudpartybuilding.controller.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
<<<<<<< HEAD:src/main/java/apocalypse/cloudpartybuilding/controller/Test/JobTask.java

=======
>>>>>>> cacdb2319f2f90261ff5ec41a1aa2162d2edaf05:src/main/java/apocalypse/cloudpartybuilding/controller/JobTask.java
@Component
public class JobTask {

    // 打印
    private static final Logger log = LoggerFactory.getLogger(JobTask.class);
    // 时间格式化
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

//    // 每三秒执行一次
//    @Scheduled(fixedRate = 3000)
//    public void jobTask() {
//        log.info("任务执行时间: " + dateFormat.format(new Date())+"测试+++");
//    }
}
