
/*
Clasa va stoca o colectie de nume de minioni. De exemplu: [Dave, Carl, Kevin, Stuart, Jerry, Tim].
La generarea unei noi surprize, se va alege in ordine urmatorul tip de minion, conform colectiei ordonate prezentate anterior. Concret, prima surpriza generata va oferi un minion Dave, urmatoarea un Carl, s.a.m.d..
→ Hint: vei avea nevoie de un contor intern pentru a retine ultimul minion oferit.
 */


package surprise;

import helpers.RandomHelper;

public class MinionToy implements ISurprise {

    private static final String[] NAME_LIST = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};
    private static int crtNameIndex = -1;
    String name;

    MinionToy(String name){
        this.name = name;
    }

    public static MinionToy generate(){
        if (crtNameIndex < 0){
            crtNameIndex = RandomHelper.getRandomInt(NAME_LIST.length);
        }

        MinionToy newMinionToy = new MinionToy(NAME_LIST[crtNameIndex]);
        crtNameIndex++;
        crtNameIndex %= NAME_LIST.length;

        return newMinionToy;
    }

    @Override
    public void enjoy() {
        System.out.println("Here is minion " + name + "!");
    }

    @Override
    public String toString(){
        return "ITEM: MINION || NAME: " + name;
    }
}

