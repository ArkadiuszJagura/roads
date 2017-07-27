package pl.training.backend.data.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.training.backend.data.repository.RoadsRepository;
import pl.training.backend.data.service.RoadsService;

@Configuration
public class RoadsBeans {

    @Bean
    public RoadsService roadsService(RoadsRepository roadsRepository) {
        return new RoadsService(roadsRepository);
    }
}
