package wu.fant.webstatic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("site.jlubus.pictures2.mapper")
@SpringBootApplication
public class Pictures2Application {

    public static void main(String[] args) {
        SpringApplication.run(Pictures2Application.class, args);
    }

}
