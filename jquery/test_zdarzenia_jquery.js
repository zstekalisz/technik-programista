///<reference path="jquery.min.js" />
$(()=>{
    $('#copy').on('click', function(){
        var ul = $('ul').first().html();
        $('ul').last().after('<ul>'+ul+'</ul>');
    });
    $('#add').on('click', ()=>{
        //$('li').last().after('<li>pusty</li>');
        $('ul').append('<li>pusty</li>');
    });
    $('input').on('blur', function(){
        
    });
});

