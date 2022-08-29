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
    - [x] součet (+)
    - [x] rozdíl (-)
    - [x] součin (*)
    - [x] celočíselné dělení
    - [ ] menší než (<)
    - [ ] menší rovno (<=)
    - [ ] větší (>)
    - [ ] větší rovno (>=)
- [ ] switch statement
- [ ] instanceof
- [x] for cyklus pro rozsah (analogie `for (int i = 0; i < X; i++)`)
- [ ] for-each
- [ ] while cyklus
- [ ] do-while cyklus

- při nalezení nefunkční konstrukce překlad skončí s chybou, "Unsupported operation"

## Překlad a spuštění

Projekt využívá `maven`. Pro vygenerování parserů a sestavení spustitelného `jar` souboru spusťtě `mvn clean package` v
kořenovém adresáři.
Ve složce `target` se po přeložení vytvoří soubor `simple-1.0.0-jar-with-dependencies.jar`, který lze spustit.

Program na vstupu očekává dva parametry:

- cestu ke vstupnímu souboru - soubor k překladu
- cestu v výstupnímu souboru - výsledné instrukce PL/0

## Známé chyby

### Nevymazání lokální proměnné z lokálního rozsahu

- momentálně při opuštění nejnižšího vnořeného rozsahu nedojde k uvolnění názvu identifikátoru z lokílní tabulky symbolů
- v praxi, pokud je uvnitř for cyklu deklarována proměnná `d`, po ukončení cyklu je jméno `d` i dále obsazeno a nelze
  již deklarovat jinou proměnnou se stejným jménem, obdobně to platí pro `if-else` bloky
    - výjimkou je dočasná proměnná v hlavičce for cyklu

## Referenční podoba jazyka a gramaticky možné konstrukce

```
func bool fnc(){

do {
    int a = a[15];
}   while(true);

return true;
}


func void fnctn() {

const int a = 15;
bool[25] pole;

if ((< a, pole)) {
    pole[0] = 1;
} else {
    (* a,b);
}

for a in 15 {
    const int c = 5;
}

switch true {
    case 15: {
        return 15;
     }
    default: {
    
   } 
}
 
(instanceof a, int);

return;
}

func int test(int a, bool[4] pole) {

return 1;
}


func void main() {

const int a = 5;
const bool c = true;
 int b = 1 ;
for a in 15 {
    const int b = 1 ;
    int b = (< a, 10) ? 1 : 13; 
}

(!(* c,b));

(instanceof c, bool);
a[(fnc 1, 2)] = -10;
a[(< a, b) ? 1 : 15] = (fnc 15, full);
return;

}
```

## Aktuálně podporovaná podoba jazyka, podporované instrukce

```

func int test(int a) {
    if (a) {
        int b = (+ 15, a);
    }
    
    if (true) {
      int x = a ? 10 : a;
    } else {
      int z = 0;
    }

    return a;
}

func void main() {
    int[10] pole;

    int a = 5;
    int b = (- a, 3);

    for c in 10 {
        b = (+ c, 2);
    }

    return;
}
```