import { CurrencyPipe, registerLocaleData } from '@angular/common';
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import localePl from '@angular/common/locales/pl';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, FormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
  providers : [CurrencyPipe]
})
export class AppComponent {
  
  ksiazki : Array<Ksiazka>
  private currency : CurrencyPipe;
  ksiazka : Ksiazka;
  
  constructor(currency : CurrencyPipe){
    registerLocaleData(localePl, 'pl');
    this.currency = currency;
    this.ksiazki = new Array<Ksiazka>();
    var k1 = new Ksiazka();
    k1.autor = 'Henryk Sienkiewicz';
    k1.tytul = 'W pustyni i w puszczy';
    k1.wydawnictwo = 'WSiP';
    k1.cena = 1449.99;
    this.ksiazki.push(k1);
    var k2 = new Ksiazka();
    k2.autor = 'Bolesław Prus';
    k2.tytul = 'Lalka';
    k2.wydawnictwo = 'Lektury szkolne';
    k2.cena = 70;
    this.ksiazki.push(k2);
    this.ksiazka = new Ksiazka();
  }
  getPriceWithCurrency(price:number|undefined): string|null{
    return this.currency.transform(price, 'zł', 'symbol', '0.2-2', 'pl');
  }
  addKsiazka(){
    //this.ksiazki.push(this.ksiazka);
    //this.ksiazka = new Ksiazka();
  }
  
}

export class Ksiazka{
  tytul ?: string
  autor ?: string
  wydawnictwo ?: string
  cena ?: number
}
