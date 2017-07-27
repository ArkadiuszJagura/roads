package pl.training.backend.data.entity;



import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "roads")
@Entity
@Data
public class Road implements Serializable {

    @Id
    private String gml_id;
    private String lokalnyId;
    private String przestrzenNazw;
    private String wersjaId;
    private Integer czyObiektBDOO;
    private String x_kod;
    private String x_skrKarto;
    private String x_katDoklGeom;
    private String x_doklGeom;
    private String x_dokGeom_uom;
    private String x_zrodloDanychG;
    private String x_zrodloDanychA;
    private String x_katIstnienia;
    private String x_rodzajReprGeom;
    private String x_uzytkownik;
    private String x_aktualnoscG;
    private String x_aktualnoscA;
    private String poczatekWersjiObiektu;
    private String x_dataUtworzenia;
    private String x_kodKarto10k;
    private String x_kodKarto25k;
    private String x_kodKarto100k;
    private String x_kodKarto250k;
    private String x_kodKarto500k;
    private String x_kodKarto1000k;
    private String katZarzadzania;
    private String klasaDrogi;
    private String materialNawierzchni;
    private Integer liczbaJezdniDrogi;
    private String numer;
    private String skjz_l2;
    private String x_uwagi;

    public String getMaterialNawierzchni() {
        return materialNawierzchni;
    }








}