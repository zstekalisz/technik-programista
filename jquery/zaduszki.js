///<reference path="jquery.js"/>
$(()=>{
    $('button').eq(0).on('click',(e)=>{
        $('img').slideUp(500);
    });
    $('button').eq(1).on('click', (e)=>{
        $('img').slideDown(500);
    });
    $('button').eq(2).on('click', (e)=>{
        $('img').animate({'left':'+=200px'}, 3000);
    });
    $('button').eq(3).on('click', ()=>{
        $('img').css('left','0px')
    });
});