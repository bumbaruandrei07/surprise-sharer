/*
MinionToy	Surpriza va fi o jucarie Minion.
Operare:	Clasa primeste la crearea obiectelor numele minionului.
La deschiderea surprizei, se va afisa un mesaj sugestiv la output, ce include detaliile jucariei primite.
 */

package surpriseSharer.surprise;

import surpriseSharer.helpers.RandomHelper;

public class MinionToy implements ISurprise {
    private static final String[] NAME_LIST = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};
    private static int crtNameIndex = -1;
    private static int minionIndex = 0;
    String name;

    // private constructor -> used for generate() method
    private MinionToy(String name) {
        this.name = name;
    }


    public static MinionToy generate() {

//        Using %
//        if (crtNameIndex < 0){
//            crtNameIndex = RandomHelper.getNewRandomInt(NAME_LIST.length);
//        }
//
//        MinionToy newMinionToy = new MinionToy(NAME_LIST[crtNameIndex]);
//        crtNameIndex++;
//        crtNameIndex %= NAME_LIST.length;
//
//        return newMinionToy;

        String minionName = NAME_LIST[minionIndex]; //starts at 0
        minionIndex++;
        if (minionIndex > NAME_LIST.length - 1) {
            minionIndex = 0; //reset index
        }

        return new MinionToy(minionName);
    }

    @Override
    public void enjoy() {
        System.out.println("Here is minion " + name + "!");
    }

    @Override
    public String toString() {
        return "ITEM: MINION || NAME: " + name;
    }
}

