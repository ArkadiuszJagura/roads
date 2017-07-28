import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {HttpModule} from "@angular/http";
import { RoadsListComponent } from './roads-list/roads-list.component';
import {RoadsService} from "./roads.service";
import { BookFormComponent } from './book-form/book-form.component';
import {FormsModule} from "@angular/forms";
import {routerModule} from "../app.routing";


@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    HttpModule,
    routerModule
  ],
  declarations: [
    RoadsListComponent,
    BookFormComponent
  ],
  providers: [
    { provide: 'RoadsService' },
  RoadResolver
  ],
  exports: [
    RoadsListComponent
  ]
})
export class RoadsModule { }
