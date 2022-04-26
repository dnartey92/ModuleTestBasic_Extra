package main;

public class Practice {


    /**
     * 1. feladat (2 pont)
     *
     * Valósítsd meg a getLastNumber metódust! A metódus adja vissza a paraméterként kapott tömb utolsó elemét!
     */
    public static int getLastNumber(int[] numbers) {

        // Ne felejtsd el átírni a return értékét!
        return numbers[numbers.length - 1];

    }

    /**
     * 2. feladat (2 pont)
     *
     * Valósítsd meg a matrixTopLeftNumber metódust!
     * A metódus egy kétdimenziós tömböt kap paraméterül, és adja vissza ennek a mátrixnak a bal felső (azaz legelső) elemét!
     */
    public static int getTopLeftNumber(int[][] matrix) {
        // Ide írd a metódus megvalósítását...
        // Ne felejtsd el átírni a return értékét!
        return matrix[0][0];
    }

    /**
     * 3. feladat (3 pont)
     *
     * Valósítsd meg a countEvenNumbers metódust!
     * A metódus adja vissza, hogy a paraméterként kapott tömbben hány páros szám szerepel!
     */
    public static int countEvenNumbers(int[] numbers) {
        int evenNumbers = 0;
        for (int i = 0;  i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        return evenNumbers;
    }

    /**
     * 4. feladat (3 pont)
     *
     * A findNumber metódus bemeneti paraméterként kap egy tömböt és egy számot.
     * A metódusod adja vissza a tömb azon indexét, ahol ez a szám először fordul elő!
     * Ha a tömbben nem szerepel ez a szám, a metódus visszatérési értéke legyen -1.
     */
    public static int findNumber(int[] numbers, int number) {
        for (int i = 0;  i < numbers.length; i++) {
            if (numbers[i] == number) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 5. feladat (3 pont)
     *
     * Valósítsd meg a findMaxIndex metódust!
     * A metódus bemeneti paraméterként egy egész számokat tartalmazó tömböt kap.
     * Visszatérési értéke legyen a tömb azon indexe, amelyen a tömb legnagyobb értékű eleme található.
     *
     * A bemeneti paraméterként kapott tömbre igaz, hogy minden eleme eltérő értékű. (Azaz csak egy maximuma van.)
     */
    public static int findMaxIndex(int[] numbers) {
        int maxNumber = 0;
        int index = 0;
        for (int i = 0; i < numbers.length;i++) {
            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];
                index = i;
            }
        }
        return index;
    }

    /**
     * 6. feladat (3 pont)
     *
     * Valósítsd meg a hasPositivesOnly nevű metódust!
     * A metódus bemeneti paraméterként egy egész számokat tartalmazó tömböt kap, és megállapítja,
     * hogy ebben a tömbben csak pozitív számok szerepelnek-e vagy sem.
     *
     * Ügyelj arra, hogy a 0 (nulla) se nem pozitív, se nem negatív szám!
     */
    public static boolean hasPositivesOnly(int[] numbers) {
        for (int i= 0; i < numbers.length;i++) {
            if (numbers[i] < 1) {
                return false;
            }

        }
        return true;
    }

    /**
     * 7. feladat (4 pont)
     *
     * Mennyi a különbség a mátrix két átlójában szereplő elemek összege között?
     * Valósítsd meg a countDiagonalDifference metódust! A metódus egy kétdimenziós tömböt kap paraméterül,
     * és visszatérési értéke a mátrix átlóiban szereplő számok összegei közötti eltérés.
     *
     * Ügyelj arra, hogy a metódusod visszatérési értéke a kérdésnek megfelelően mindig nem-negatív egész szám legyen!
     *
     * A bemenetül kapott kétdimenziós tömbre igaz, hogy négyzetes mátrix, azaz a sorainak és oszlopainak száma egyenlő.
     */
    public static int countDiagonalDifference(int[][] matrix) {
        // Ide írd a metódus megvalósítását...
        // Ne felejtsd el átírni a return értékét!
        return -1;
    }

    /**
     * 8. feladat (4 pont)
     *
     * Valósítsd meg a countSameNumbers metódust!
     * A metódus két egészeket tartalmazó tömb paramétert kap,
     * és azt kell megszámolnia, hogy hány elem szerepel az első tömbből a második tömbben.
     *
     * Ügyelj arra, hogy ha egy szám többször szerepel a második tömbben, akkor azt csak egynek számold!
     *
     * Az első tömbben minden szám csak egyszer fordul elő, ám a második tömbre ez nem feltétlen igaz.
     *
     * Példa:
     *      int[] firstNumbers = {0, 1, 2, 3, 4};
     *      int[] secondNumbers = {5, 6, 5, 4, 4, 4, 3};
     *      megoldás: 2
     *      indoklás: mivel 2 szám szerepel az első tömbből a másodikban (a 3 és a 4)
     */
    public static int countSameNumbers(int[] firstNumbers, int[] secondNumbers) {
        int sameNumberCount = 0;
        int currentNumber = 0;
        for (int i = 0; i < firstNumbers.length;i++) {
            for (int j = 0; j < secondNumbers.length;j++) {
                if (firstNumbers[i] == secondNumbers[j]) {
                    if(currentNumber != secondNumbers[j]){
                        sameNumberCount++;
                        currentNumber = firstNumbers[i];
                    }
                }
            }
        }
        return sameNumberCount;
    }

    /**
     * 9. feladat (5 pont)
     *
     * A zoknijaimat mindig párban teszem a mosógépbe, ám a teregetésnél szomorúan tapasztalom,
     * hogy az egyik zoknim (és mindig csak az egyik zoknim) egyik párja unos-untalan elvész...
     * Micsoda rejtelem! Ám szerencsére nem kell feltárnod ezt a misztikus jelenséget.
     *
     * Valósítsd meg a findTheOneSock metódust, amely bemeneti paraméterként nem-negatív egész számokat tartalmazó tömböt kap
     * (szimbolizálva a zoknijaimat a teregetéskor), és visszatérési értéke a tömb azon értéke, amelynek nincsen párja a tömbben.
     * A tömbben a számok párosával szerepelnek - előfordulhat, hogy kétszer, négyszer, hatszor... vagy többször.
     * Ám egy, és mindig csak egy szám pár nélkül szerepel.
     * A metódusodnak ezt az egyedül, pár nélkül lévő számot kell visszaadnia.
     *
     * Példa1.:     a tömb: {30, 10, 30, 10, 30, 30, 20, 10, 30, 10, 30}
     *              megoldás: 20
     *              indoklás:
     *                  a számpárok: 30-30, 10-10, 30-30, 10-10, 30-30
     *                  pár nélküli: 20
     *
     * Példa2.:     a tömb: {56, 1, 33, 42, 0, 86, 42, 86, 1, 56, 0}
     *              megoldás: 33
     *              indoklás:
     *                  a számpárok: 56-56, 1-1, 42-42, 0-0, 86-86
     *                  pár nélküli: 33
     */
    public static int findTheOneSock(int[] socks) {
        // Ide írd a metódus megvalósítását...
        // Ne felejtsd el átírni a return értékét!
        return -1;
    }

    /**
     * 10. feladat (5 pont)
     *
     * Valósítsd meg a bubbleSort nevű metódust!
     * A metódus csökkenő sorrendbe (!) rendezi a bemeneti paraméterként kapott tömböt.
     *
     * A rendezéshez használd a buborékrendezést!
     */
    public static void bubbleSort(int[] array) {
        // Ide írd a metódus megvalósítását...
    }

}
