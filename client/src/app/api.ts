export class Api {

  baseUrl = 'https://localhost:8080/api-v1'
  oauthServer = 'https://localhost:8080/oauth/token'
  users = `${this.baseUrl}/users`
  activeUser = `${this.users}/active`
  roads = `${this.baseUrl}/roads`

}
