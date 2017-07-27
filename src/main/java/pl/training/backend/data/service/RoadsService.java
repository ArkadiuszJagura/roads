package pl.training.backend.data.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import pl.training.backend.common.model.ResultPage;
import pl.training.backend.data.entity.Road;
import pl.training.backend.data.repository.RoadsRepository;

public class RoadsService {

    private RoadsRepository roadsRepository;

    public RoadsService(RoadsRepository roadsRepository) {
        this.roadsRepository = roadsRepository;
}

    public ResultPage<Road> getRoads(int pageNumber, int pageSize) {
        Page<Road> roadsPage = roadsRepository.findAll(new PageRequest(pageNumber, pageSize));
        return new ResultPage<>(roadsPage.getContent(), roadsPage.getNumber(), roadsPage.getTotalPages());
    }

}
