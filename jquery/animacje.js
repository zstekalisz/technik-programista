///<reference path="jquery.js"/>
$(()=>{
    $('button').eq(0).on('click', (e)=>{
        console.log(e.target.innerHTML);
        $('div.pudelko').animate({
            'left':'+=300px'       
        }, 2000);
        $('div.pudelko').animate({
            'top':'+=300px'       
        }, 2000);
    });
    $('button').eq(1).on('click', function(event){
        console.log(event.type);
        $('div.pudelko').animate({
            'width':'+=50px',
            'height':'+=50px'
        }, 2000);
    });
    $('button').eq(2).on('click', ()=>{
        $('div.pudelko').animate({
            'height':'-=50px',
            'width':'-=50px'},
            2000
        );
        
    });
    $('button').eq(3).on('click', ()=>{
        $('div.pudelko').clearQueue();
    });
});