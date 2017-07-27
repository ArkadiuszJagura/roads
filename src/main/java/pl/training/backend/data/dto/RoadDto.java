package pl.training.backend.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Set;


@ApiModel(value = "Road")
@Data
public class RoadDto {

    @JsonProperty(access = Access.READ_ONLY)
    @ApiModelProperty(required = true)
    private String materialNawierzchni;

}
