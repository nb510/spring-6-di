package guru.springframework.spring6di.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"prod", "EN"})
@SpringBootTest
class DatasourceControllerTest {

    @Autowired
    DatasourceController datasourceController;

    @Test
    void testDataSource() {
        System.out.println(datasourceController.getDatasource());
    }
}