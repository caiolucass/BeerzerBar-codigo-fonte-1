import { ProdutoComponent } from './produto-Form/produto-form.component';
import { AdmProdutoComponent } from './admProduto/admProduto.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ProdutoRoutingModule } from './produto-routing.module';
import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { TemplateModule } from './../template/template.module';
import { DataTablesModule } from 'angular-datatables';



@NgModule({
  declarations: [
    AdmProdutoComponent,
    ProdutoComponent
  ],
  imports: [
    CommonModule,
    ProdutoRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    TemplateModule,
    DataTablesModule,
  ]
})
export class ProdutoModule { }
