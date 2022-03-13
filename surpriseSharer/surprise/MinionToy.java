
/*
Clasa va stoca o colectie de nume de minioni. De exemplu: [Dave, Carl, Kevin, Stuart, Jerry, Tim].
La generarea unei noi surprize, se va alege in ordine urmatorul tip de minion, conform colectiei ordonate prezentate anterior. Concret, prima surpriza generata va oferi un minion Dave, urmatoarea un Carl, s.a.m.d..
→ Hint: vei avea nevoie de un contor intern pentru a retine ultimul minion oferit.
 */


package surprise;

import helpers.RandomHelper;

import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise {

    String name;
    static ArrayList<String> minions = new ArrayList<String>(Arrays.asList("Dave","Carl", "Kevin", "Stuart", "Jerry", "Tim"));
    static int cnt = 0;

    private MinionToy (int cnt) {
        this.name = minions.get(cnt);
    }

    public static MinionToy generate() {
        MinionToy minionToy = new MinionToy(cnt);
        cnt++;
        if(cnt == minions.size()) {
            cnt = 0;
        }
        return minionToy;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public void enjoy() {
        System.out.println("Here is minion " + getName() + "!");
    }

    @Override
    public String toString(){
        return "ITEM: MINION || NAME: " + getName();
    }
}

