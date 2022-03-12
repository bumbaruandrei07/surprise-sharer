package surprise;

import helpers.RandomHelper;

public class Candies implements ISurprize {

    private static final String[] types = {"Milka", "Ferrero Rocher", "Kinder Pinguin", "Truffes"};
    private static final int candiesNo = 50;
    private int amount;
    private String type;

    public Candies(int amount, String type) {
        if (amount < 0) {
            amount = 1;
        }

        this.amount = amount;
        this.type = type;
    }

    public static Candies generate() {
        int randomNum = RandomHelper.getRandomInt(candiesNo);
        int randomType = RandomHelper.getRandomInt(types.length);

        return new Candies(randomNum, types[randomType]);
    }

    @Override
    public void enjoy() {
        System.out.println(" You received: " + amount + " " + type);
    }

    @Override
    public String toString() {
        return "ITEM: Candy || TYPE: " + type + " || AMOUNT: " + amount;
    }


}
/*
Surpriza contine un numar aleator de bomboane, de un anumit tip.
Operare:	Constructorul clasei va primi numarul de bomboane si tipul acestora.
La executia surprizei se va afisa un mesaj relevant, in functie de starea interna a obiectului-surpriza.
 */

/*
Generate() :
FortuneCookie	Clasa va contine un vector de minim 20 de zicale (+ autorul acestora) la alegere. Poti lua colectia de zicale de pe un site de specialitate.
La apelul metodei generate(), metoda va genera un numar aleator si va alege elementul din array in consecinta. Ulterior, va crea o (noua) surpriza corespunzator.
 */
