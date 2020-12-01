package apocalypse.cloudpartybuilding.controller;

import cn.hutool.log.Log;
import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j
@Controller //这个注解不能使用RestController，不然会返回模板类型的页面
@RequestMapping("/files")
public class UploadController {

    @GetMapping("/upload")
    public void testJsp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/upload.jsp").forward(request, response);

    }

    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file, Model model, HttpServletRequest request) throws IOException {
        if (file.isEmpty()) {
            return "文件为空空，请选择文件";
        }

        String fileName = file.getOriginalFilename();  // 文件名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        String filePath = "D://temp-rainy//"; // 上传后的路径
        File dest = new File(filePath + fileName);

        if (!dest.getParentFile().exists()) { //判断文件是否存在
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.warn(dest.getCanonicalPath());
        String filename = "/temp-rainy/" + fileName;
        model.addAttribute("filename", filename);
        return "file";
    }

    @GetMapping("/multiUpload")
    public void testJsp2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/multiUpload.jsp").forward(request, response);

    }


    @PostMapping("/multiUpload")
    @ResponseBody
    public String multiUpload(HttpServletRequest request) {
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        String filePath = "D://temp-rainy//";
        for (int i = 0; i < files.size(); i++) {
            MultipartFile file = files.get(i);
            if (file.isEmpty()) {
                return "上传第" + (i++) + "个文件失败";
            }
            String fileName = file.getOriginalFilename();

            File dest = new File(filePath + fileName);
            try {
                file.transferTo(dest);
                log.info("第" + (i + 1) + "个文件上传成功");
            } catch (IOException e) {
                log.error(e.toString(), e);
                return "上传第" + (i++) + "个文件失败";
            }
        }

        return "上传成功";

    }

}