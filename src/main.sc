require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /привет
        a: Привет привет

    state: Bye
        intent!: /пока
        a: Пока пока
        
    state: marko
        q!: марко
        go!: /polo 
    
    state: polo
        a: polo
        
    
    state: Ivan
        q!: Ваня
        go!: /ivan_good 
    
    state: ivan_good
        a: Ебать Ванек ты такой ахуенный    
    
    state: alex
        q!: Саша
        go!: /alex_good 
    
    state: alex_good
        a: Долгих тебе лет епта СанёК!
        
        
    state: egor
        q!: егор
        go!: /egor_good 
    
    state: egor_good
        a: бля ну епта удачи те по жизни Егорыч    
        
    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}