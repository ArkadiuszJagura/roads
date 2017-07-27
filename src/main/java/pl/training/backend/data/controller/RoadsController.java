package pl.training.backend.data.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.training.backend.common.model.Mapper;
import pl.training.backend.common.model.ResultPage;
import pl.training.backend.common.web.UriBuilder;
import pl.training.backend.data.dto.RoadDto;
import pl.training.backend.data.dto.RoadsPageDto;
import pl.training.backend.data.entity.Road;
import pl.training.backend.data.service.RoadsService;

import java.net.URI;
import java.util.List;

import static org.springframework.http.ResponseEntity.created;

@Api(description = "Roads resource")
@RequestMapping(value = UriBuilder.PREFIX + "/roads")
@RestController
public class RoadsController {

    private Mapper mapper;
    private RoadsService roadsService;
    private UriBuilder uriBuilder = new UriBuilder();

    @Autowired
    public RoadsController(Mapper mapper, RoadsService roadsService) {
        this.mapper = mapper;
        this.roadsService = roadsService;
    }

    @ApiOperation(value = "Get roads", response =RoadsPageDto.class)
    @RequestMapping(method = RequestMethod.GET)
    public RoadsPageDto getRoads(
            @RequestParam(required = false, defaultValue = "0", name = "pageNumber") int pageNumber,
            @RequestParam(required = false, defaultValue = "10", name = "pageSize") int pageSize) {
        ResultPage<Road> resultPage = roadsService.getRoads(pageNumber, pageSize);
        List<RoadDto> roadDtos = mapper.map(resultPage.getContent(), RoadDto.class);
        return new RoadsPageDto(roadDtos, resultPage.getPageNumber(), resultPage.getTotalPages());
    }

}
