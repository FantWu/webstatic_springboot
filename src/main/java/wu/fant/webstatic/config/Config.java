package wu.fant.webstatic.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Value("${file-storage.path}")
    public String path;
}
