///<reference path="jquery.js"/>
$(()=>{
    $('.abc').on('click', function(event){
        $('button').after('<p>'+event.target.innerHTML+'</p>')
    });
});