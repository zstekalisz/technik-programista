import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, FormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'CwiczeniaWalidacja';
  persons = new Array<Person>();
  person = new Person();

  savePerson(form : NgForm){
    if(form.valid){
      this.persons.push(this.person);
      this.person = new Person();
    }
  }
  
}

export class Person{
  name ?: string;
  surname ?: string;
  pesel ?: string;
  nip ?: string;
  age ?: number;
}
