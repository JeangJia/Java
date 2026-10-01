package bean;

import java.util.ArrayList;


public class FoeList {
    ArrayList<Foe> foelist = new ArrayList<>();

    public FoeList() {
        foelist.add(new Foe("初级战士", 80, 15, 10));
        foelist.add(new Foe("敏捷刺客", 60, 20, 5));
        foelist.add(new Foe("重装坦克", 120, 10, 20));
        foelist.add(new Foe("神秘法师", 70, 25, 8));
    }
}
