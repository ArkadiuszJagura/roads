export class Road {

  gml_id: string
  katZarzadzania: string
  klasaDrogi: string
  materialNawierzchni: string
  liczbaJezdniDrogi: number
  numer: string


  constructor(json) {
    this.gml_id = json['gml_id']
    this.katZarzadzania = json['katZarzadzania']
    this.klasaDrogi = json['klasaDrogi']
    this.materialNawierzchni = json['materialNawierzchni']
    this.liczbaJezdniDrogi = json['liczbaJezdniDrogi']
    this.numer = json['numer']
  }
}



