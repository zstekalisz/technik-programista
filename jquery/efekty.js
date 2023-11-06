///<reference path="jquery.js"/>
$(function(){
    $('#pokaz').on('click', ()=>{
        $('img').show(1000);
    });
    $('#ukryj').on('click', function(event){
        console.log(event.target.innerHTML);
        $('img').hide(500);
    });
    $('#przelacz').on('click', function(){
        $('img').toggle(2000);
    });
    $('#wysun1').on('click', ()=>{
        $('#pierwszy').toggle().slideDown(1000);
    });
    $('#wysun2').on('click', function(){
        $('#drugi').toggle().slideUp(2000);
    });
    $('#wysun3').on('click', function(){
        $('#trzeci').slideToggle('slow')     
    });
});
