import {Route, RouterModule} from '@angular/router';
import {LoginFormComponent} from './security/login-form/login-form.component'
import {SecurityGuard} from './security/security.guard';
import {UsersListComponent} from './users/users-list/users-list.component';
import {RoadsListComponent} from "./roads/roads-list/roads-list.component";

const routesConfig: [Route] = [
  {
    path: 'login', component: LoginFormComponent
  },
  {
    path: 'roads', component: RoadsListComponent
  },
  {
    path: '', canActivate: [SecurityGuard], children: [
    {
      path: 'users', component: UsersListComponent
    }
  ]
  },
  {
    path: '**', redirectTo: 'users'
  }
]

export const routerModule = RouterModule.forRoot(routesConfig)
