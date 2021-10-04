    
# FJP - Sem. práce - vlastní jazyk S1mpl3
__________________________________________
#### definice celočíselných proměnných
   -> `int <identifikator>;`

#### definice celočíselných konstant
   -> `const`

#### přiřazení 
   -> `<identifikator> = <hodnota>;`
   -> `<identifikator> = <identifikator>;`

#### základní aritmetiku a logiku (+, -, *, /, AND, OR, negace a závorky, operátory pro porovnání čísel)
   -> `<operator> (<hodnota>, <hodnota>);`
   -> `<operator> (<identifikator>, <identifikator>);`
   - AND - `^` 
   - OR - `ˇ`
   - negace - `!`

#### cyklus (libovolný)
   -> `while (<podminka>) { }`

#### jednoduchou podmínku (if bez else)
   -> `if (<podminka>) { }`

#### definice podprogramu (procedura, funkce, metoda) a jeho volání
   -> `void/int <identifikator_fce>(<vstupni_parametry>) { }`
   
#### příklad
   ```
   const int a = 5;
   const int b = 10;
   int c = +(+(a, b), c);
   ```
