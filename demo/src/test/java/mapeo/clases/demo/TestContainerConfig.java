package mapeo.clases.demo;

import org.testcontainers.containers.PostgreSQLContainer;

public class TestContainerConfig {
    //@Bean
    //@ServiceConnection
    PostgreSQLContainer<?> postgreSQLContainer(){
        return new PostgreSQLContainer<>("postgres:15-alpine");
    }
}
