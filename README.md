# Naloga 1 – Prva aplikacija (Hello World)

Šolska naloga pri predmetu **Razvoj mobilnih aplikacij (Naloga 1)**.
Android aplikacija v jeziku **Java**, izdelana v Android Studiu s predlogo *Empty Views Activity*.

## Opis

Aplikacija prikazuje osnovne gradnike uporabniškega vmesnika in odziv na dogodke:

- dva `TextView` z besedilom **Mobile application!** in **Mobilna aplikacija!** (krepko, 34sp)
- izbira **Male** / **Female** (`RadioGroup` z `RadioButton`)
- potrditveno polje `CheckBox` (**Strinjam se s pogoji uporabe**)
- gumb `Button` **Log in**, ki ob kliku prikaže `Toast`: *My first Android Studio application!*
- `FloatingActionButton` (+), ki ob kliku prikaže `Snackbar`:
  - a) privzeti `Snackbar` z besedilom *Just another option for button.*
  - b) prilagojen `Snackbar`, postavljen na sredino zaslona in oblikovan podobno kot `Toast`

Vsa besedila so shranjena v `strings.xml`, postavitev pa je izdelana s `ConstraintLayout`.

## Struktura projekta

| Datoteka | Opis |
|---|---|
| `app/src/main/java/.../MainActivity.java` | logika aktivnosti, obdelava klikov (Toast, Snackbar) |
| `app/src/main/res/layout/activity_main.xml` | postavitev uporabniškega vmesnika |
| `app/src/main/res/values/strings.xml` | besedilni viri |
| `app/src/main/AndroidManifest.xml` | osnovni podatki o aplikaciji |

## Namestitev na telefon

Datoteka `app-debug.apk` je na voljo v razdelku **Releases** tega repozitorija.

1. Prenesi `app-debug.apk` na telefon.
2. Odpri datoteko in dovoli namestitev iz neznanih virov.
3. Tapni **Install** in nato **Open**.

## Zagon iz izvorne kode

1. Kloniraj repozitorij: `git clone <URL-repozitorija>`
2. Odpri mapo v Android Studiu in počakaj na Gradle sinhronizacijo.
3. Izberi emulator ali telefon in klikni ▶ (**Run**).

## Avtor

Nejc Bajda – ŠC Nova Gorica, Elektrotehniška in računalniška šola
