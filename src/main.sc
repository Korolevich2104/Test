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
        intent!: /марко
        go!: /polo 
    
    state: polo
        a: polo
    
    state: Ivan
        intent!: /ваня
        a: Золотой ты человек Иван 

    state: Alex
        intent!: /саша
        a: Золотой ты человек Александр 
        
    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}