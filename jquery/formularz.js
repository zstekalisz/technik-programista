///<reference path="jquery.js"/>
$(() => {
    let obj = {};
    $(':text').eq(0).on('keypress', (event) => {
        console.log($(':text').eq(0).val());
    });
    $(':text').eq(0).on('blur', () => {
        let val = $(':text').eq(0).val();
        console.log(val);
        let asciCode = val.charCodeAt(0);
        console.log(asciCode);
        if (!(asciCode > 64 && asciCode < 91)) {
            $('span').eq(0).remove();
            $(':text').eq(0).after('<span>Wpisz imię z dużej litery</span>');
        } else {
            $('span').eq(0).remove();
        }

    });
    $('select').on('change', function (e) {
        $('p').last().remove();
        //let val = $('select').eq(0).val();
        let val = e.target.value;
        console.log(val);
        let technology = "";
        if(val==1){
            technology = "Java";
        }else if(val==2){
            technology = "C++";
        }else if(val==3){
            technology = "PHP";
        }else{
            technology = "";
        }
        $('body').append('<p>Wybrano język :'+technology+'</p>')
    });
    $(':radio').on('change', function(e){
        $('#radio').html('');
        $('#radio').append('<h1>Wybrano :'+e.target.value +'</h1>');
        console.log(obj);
    });
    $('#test').on('submit', (e)=>{
        obj.imie = $('#test').find(':text').eq(0).val();
        obj.nazwisko = $('#test').find(':text').eq(1).val();
        console.log('formularz zapisany');
        return false;
    });

});