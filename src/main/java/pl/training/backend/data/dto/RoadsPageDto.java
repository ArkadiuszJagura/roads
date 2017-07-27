package pl.training.backend.data.dto;


import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

@ApiModel(value = "Roads")
@Data
public class RoadsPageDto {

    private List<RoadDto> roads;
    private int pageNumber;
    private int totalPages;

    public RoadsPageDto() {
    }
    public RoadsPageDto(List<RoadDto> roads, int pageNumber, int totalPages) {
        this.roads = roads;
        this.pageNumber = pageNumber;
        this.totalPages = totalPages;
    }

}
