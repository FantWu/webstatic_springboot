package wu.fant.webstatic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import wu.fant.webstatic.config.Config;
import wu.fant.webstatic.service.PictureService;

import java.io.File;
import java.io.IOException;
import java.util.Date;

@RestController
@RequestMapping("/static")
public class FileUploadController {

    @Autowired
    private Config config;

    @Autowired
    private PictureService pictureService;

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "文件是空的";
        }
        String timestamp = String.valueOf(new Date().getTime());
        String path = config.path + timestamp + "_" + file.getOriginalFilename().replace(" ", "s");
        try {
            file.transferTo(new File(path));
            pictureService.savePicture(
                    file.getOriginalFilename(),
                    timestamp + "_" + file.getOriginalFilename().replace(" ", "s")
            );
            return "文件上传成功";
        } catch (IOException e) {
            e.printStackTrace();
            return "文件上传失败";
        }
    }
}
