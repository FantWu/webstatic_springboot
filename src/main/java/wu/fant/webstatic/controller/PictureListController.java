package wu.fant.webstatic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wu.fant.webstatic.entity.Picture;
import wu.fant.webstatic.service.PictureService;

import java.util.List;

@RestController
@RequestMapping("/")
public class PictureListController {

    @Autowired
    private PictureService pictureService;

    @GetMapping("/getPictureList")
    public List<Picture> getPictureList() {
        return pictureService.getPictureList();
    }
}
