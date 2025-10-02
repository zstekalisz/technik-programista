var k = 10;
var x = 5;
k = x++;
console.log(x); //x=6
console.log(k); //k=5 bo bo operator inkrementacji jest z prawej strony

k = ++x;
console.log(k); // k = 7 bo operator inkrementacji jest z lewej strony

var rowne = k==x; // operator porównania - sprawdza czy wartości są równe
console.log(rowne);
var napis = '7';
rowne = napis==x;
console.log(rowne);
rowne = napis===x;
console.log(rowne);
console.log('xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx');
var rozne = k!=x; // operator sprawdzający czy wartości są różne
console.log(rozne);
rozne = napis!==x;
console.log(rozne);
console.log('xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx');
var a = 15.8;
var b = 17.9;
var wieksze = a>b;
console.log(wieksze);
wieksze = b>a;
console.log(wieksze);
wieksze = b>=a
console.log('xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx');
var mniejsze = a<b;
console.log(mniejsze);






