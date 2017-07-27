package pl.training.backend.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;
import java.util.Set;


@ApiModel(value = "Road")
@Data
public class RoadDto {

    @Id
    @JsonProperty(access = Access.READ_ONLY)
    private String gml_id;
    @JsonProperty(access = Access.READ_ONLY)
    private String lokalnyId;
    @JsonProperty(access = Access.READ_ONLY)
    private String przestrzenNazw;
    @JsonProperty(access = Access.READ_ONLY)
    private String wersjaId;
    @JsonProperty(access = Access.READ_ONLY)
    private Integer czyObiektBDOO;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_kod;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_skrKarto;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_katDoklGeom;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_doklGeom;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_dokGeom_uom;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_zrodloDanychG;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_zrodloDanychA;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_katIstnienia;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_rodzajReprGeom;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_uzytkownik;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_aktualnoscG;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_aktualnoscA;
    @JsonProperty(access = Access.READ_ONLY)
    private String poczatekWersjiObiektu;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_dataUtworzenia;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_kodKarto10k;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_kodKarto25k;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_kodKarto100k;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_kodKarto250k;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_kodKarto500k;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_kodKarto1000k;
    @JsonProperty(access = Access.READ_ONLY)
    private String katZarzadzania;
    @JsonProperty(access = Access.READ_ONLY)
    private String klasaDrogi;
    @JsonProperty(access = Access.READ_ONLY)
    @ApiModelProperty(required = true)
    private String materialNawierzchni;
    @JsonProperty(access = Access.READ_ONLY)
    private Integer liczbaJezdniDrogi;
    @JsonProperty(access = Access.READ_ONLY)
    private String numer;
    @JsonProperty(access = Access.READ_ONLY)
    private String skjz_l2;
    @JsonProperty(access = Access.READ_ONLY)
    private String x_uwagi;
}
