package guru.springframework.spring6di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service()
public class DevDatasourceServiceImpl implements DatasourceService {

    @Override
    public String getDataSource() {
        return "dev.data.source";
    }
}
