package wu.fant.webstatic.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import wu.fant.webstatic.entity.Picture;
import wu.fant.webstatic.mapper.PictureMapper;
import wu.fant.webstatic.service.IService.IPictureService;

import java.util.List;

@Service
public class PictureService extends ServiceImpl<PictureMapper, Picture> implements IPictureService {
    public List<Picture> getPictureList() {
        return list();
    }

    public void savePicture(String name, String file) {
        save(new Picture(name, file));
    }
}
