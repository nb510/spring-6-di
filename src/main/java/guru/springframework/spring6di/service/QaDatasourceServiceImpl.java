package guru.springframework.spring6di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class QaDatasourceServiceImpl implements DatasourceService {
    @Override
    public String getDataSource() {
        return "qa.data.source";
    }
}
