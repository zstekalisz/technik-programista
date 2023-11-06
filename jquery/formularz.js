///<reference path="jquery.js"/>
$(()=>{
    $(':text').eq(0).on('keypress', (event)=>{
        console.log($(':text').eq(0).val());
    })
});