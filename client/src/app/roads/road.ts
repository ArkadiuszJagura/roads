export class Road {

  gml_id: string
  lokalnyId: string
  przestrzenNazw: string
  wersjaId: string
  czyObiektBDOO: number
  x_kod: string
  x_skrKarto: string
  x_katDoklGeom: string
  x_doklGeom: string
  x_dokGeom_uom: string
  x_zrodloDanychG: string
  x_zrodloDanychA: string
  x_katIstnienia: string
  x_rodzajReprGeom: string
  x_uzytkownik: string
  x_aktualnoscG: string
  x_aktualnoscA: string
  poczatekWersjiObiektu: string
  x_dataUtworzenia: string
  x_kodKarto25k: string
  x_kodKarto100k: string
  x_kodKarto250k: string
  x_kodKarto500k: string
  x_kodKarto1000k: string
  katZarzadzania: string
  klasaDrogi: string
  materialNawierzchni: string
  liczbaJezdniDrogi: number
  numer: string
  skjz_l2: string
  x_uwagi: string

  constructor(json) {
    this.gml_id = json['gml_id']
    this.lokalnyId = json['lokalnyId']
    this.przestrzenNazw = json['przestrzenNazw']
    this.wersjaId = json['wersjaId']
    this.czyObiektBDOO = json['czyObiektBDOO']
    this.x_kod = json['x_kod']
    this.x_skrKarto = json[' x_skrKarto']
    this.x_katDoklGeom = json['x_katDoklGeom']
    this.x_doklGeom = json['x_doklGeom']
    this.x_dokGeom_uom = json['x_dokGeom_uom']
    this.x_zrodloDanychG = json['x_zrodloDanychG']
    this.x_zrodloDanychA = json['x_zrodloDanychA']
    this.x_katIstnienia = json['x_katIstnienia']
    this.x_rodzajReprGeom = json['x_rodzajReprGeom']
    this.x_uzytkownik = json['x_uzytkownik']
    this.x_aktualnoscG = json['x_aktualnoscG']
    this.x_aktualnoscA = json['x_aktualnoscA']
    this.poczatekWersjiObiektu = json['poczatekWersjiObiektu']
    this.x_dataUtworzenia = json['x_dataUtworzenia']
    this.x_kodKarto25k = json['x_kodKarto25k']
    this.x_kodKarto100k = json['x_kodKarto100k']
    this.x_kodKarto250k = json['x_kodKarto250k']
    this.x_kodKarto500k = json['x_kodKarto500k']
    this.x_kodKarto1000k = json['x_kodKarto1000k']
    this.katZarzadzania = json['katZarzadzania']
    this.klasaDrogi = json['klasaDrogi']
    this.materialNawierzchni = json['materialNawierzchni']
    this.liczbaJezdniDrogi = json['liczbaJezdniDrogi']
    this.numer = json['numer']
    this.skjz_l2 = json['skjz_l2']
    this.x_uwagi = json['x_uwagi']
  }
}



