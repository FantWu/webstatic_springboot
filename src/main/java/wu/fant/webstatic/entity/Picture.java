package wu.fant.webstatic.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("`pictures`")
public class Picture {
    private int id;
    private String name;
    private String file;
    public Picture(String name, String file) {
        this.name = name;
        this.file = file;
    }
}
