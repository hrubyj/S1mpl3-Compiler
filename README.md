    
# FJP - Sem. práce - vlastní jazyk S1mpl3
__________________________________________
### TODO list
   
   -> promyslet char
 
   -> instanceOf

### Zadání
#### definice celočíselných proměnných
   -> `int <identifikator>;`

#### definice celočíselných konstant
   -> `const`

#### přiřazení 
   -> `<identifikator> = <hodnota>;`
   -> `<identifikator> = <identifikator>;`

#### základní aritmetiku a logiku (+, -, *, /, AND, OR, negace a závorky, operátory pro porovnání čísel)
   -> `(<operator> <hodnota>, <hodnota>);`
   -> `(<operator> <identifikator>, <identifikator>);`
   - AND - `AND` 
   - OR - `OR`
   - negace - `!`

#### cyklus (libovolný)
   -> `while (<podminka>) { }`

#### jednoduchou podmínku (if bez else)
   -> `if (<podminka>) { }`

#### definice podprogramu (procedura, funkce, metoda) a jeho volání
   -> `func void/int <identifikator_fce>(<vstupni_parametry>) { }`
   
#### příklad
   ```
   const int a = 5;
   const int b = 10;
   int c = (+ (+(a, b), c);
   ```
#### zvolená rozšíření
Za jeden bod:

    -> další typ cyklu for, while .. do, foreach pro pole)
    
    -> else větev
    
    -> datový typ boolean a logické operace s ním
    
    -> rozvětvená podmínka (switch, case)
    
    -> ternární operátor
    
    -> příkazy pro vstup a výstup
    
Za dva body:

    -> pole a práce s jeho prvky
    
    -> parametry předávané hodnotou
    
    -> návratová hodnota podprogramu
    
Za tři body:

    -> instanceOf
