package wu.fant.webstatic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wu.fant.webstatic.service.PictureService;

@RestController
@RequestMapping("/test")
public class TestDBController {

    @Autowired
    private PictureService pictureService;

//    @PostMapping("/db")
//    public String testDB() {
//        return pictureService.testDB();
//    }
}
