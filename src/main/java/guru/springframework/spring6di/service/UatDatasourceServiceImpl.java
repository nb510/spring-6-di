package guru.springframework.spring6di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("uat")
public class UatDatasourceServiceImpl implements DatasourceService {

    @Override
    public String getDataSource() {
        return "uat.data.source";
    }
}
