package guru.springframework.spring6di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class ProdDatasourceServiceImpl implements DatasourceService {

    @Override
    public String getDataSource() {
        return "prod.data.source";
    }
}
