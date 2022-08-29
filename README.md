# FJP - Sem. práce - vlastní jazyk S1mpl3

__________________________________________

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

## Funkční konstrukce

- [x] deklarace celočíselných a pravdivostních proměnných
- [x] deklarace celočíselných a pravdivostních konstant
- [x] deklarace celočíselných a pravdivostních polí
- [x] přiřazení do již existující proměnné proměnné
- [ ] přístup na index v poli
- [x] podmínka - if větev
- [x] else větev podmínky
- [x] ternární operátor
- [x] definice funkcí
- [ ] volání uživatelských funkcí
- [ ] volání vestavěných funkcí (+, -, /, AND, OR, !, ...)
- [ ] switch statement
- [ ] instanceof
- [x] for cyklus pro rozsah (analogie `for (int i = 0; i < X; i++)`)
- [ ] for-each
- [ ] while cyklus
- [ ] do-while cyklus

- při nalezení nefunkční konstrukce překlad skončí s chybou, "Unsupported operation"

## Známé chyby

### Nevymazání lokální proměnné z lokálního rozsahu

- momentálně při opuštění nejnižšího vnořeného rozsahu nedojde k uvolnění názvu identifikátoru z lokílní tabulky symbolů
- v praxi, pokud je uvnitř for cyklu deklarována proměnná `d`, po ukončení cyklu je jméno `d` i dále obsazeno a nelze
  již deklarovat jinou proměnnou se stejným jménem, obdobně to platí pro `if-else` bloky
    - výjimkou je dočasná proměnná v hlavičce for cyklu