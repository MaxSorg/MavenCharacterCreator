package com.example.MavenCharacterCreator.CharacterData;

public enum Race {
    
    HUMAN (0, 0, 0, 0, 0, 0) {
        @Override
        public String printDescription() {
            String desc = "Humans suck";
            return desc;
            }
        },    
    HALF_ELF (0, 0, 0, 0, 0, 0) {
        @Override
        public String printDescription() {
            String desc = "Half elves are cool";
            return desc;
        }
    },    
    ELF (0, 2, -2, 0, 0, 0) {
        @Override
        public String printDescription() {
            String desc = "Elves live long";
            return desc;
        }
    },
    DWARF (0, 0, 2, 0, 0, -2){
        @Override
        public String printDescription() {
            String desc = "Dwarves are grumpy";
            return desc;
        }
    },
    HALFLING (-2, 2, 0, 0, 0, 0) {
        @Override
        public String printDescription() {
            String desc = "Halflings are lucky";
            return desc;
        }
    };

    final private int str;
    final private int dex;
    final private int con;
    final private int intel;
    final private int wis;
    final private int cha;

    Race(int str, int dex, int con, int intel, int wis, int cha) {
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.intel = intel;
        this.wis = wis;
        this.cha = cha;
    }

    public int getStr() {
        return str;
    }

    public int getDex() {
        return dex;
    }

    public int getCon() {
        return con;
    }

    public int getIntel() {
        return intel;
    }

    public int getWis() {
        return wis;
    } 

    public int getCha() {
        return cha;
    }

    public void printRaceFull(){
        String[] attributeName = {"Strength", "Dexterity", "Constitution", "Intelligence", 
        "Wisdom", "Charisma"};
        int[] attributeValue = {this.getStr(), this.getDex(), this.getCon(), this.getIntel(),
        this.getWis(), this.getCha()};
        
        System.out.println(this + "\n");
        for (int i = 0; i < attributeName.length; i++) {
            System.out.println(attributeName[i] + ": " + attributeValue[i]);
        }
        System.out.println("");
    }
    
    public static void printBonuses() {
        for (Race race : Race.values()) {
            String[] attributeName = {"Strength", "Dexterity", "Constitution", "Intelligence", 
            "Wisdom", "Charisma"};
            int[] attributeValue = {race.getStr(), race.getDex(), race.getCon(), race.getIntel(),
            race.getWis(), race.getCha()};
            System.out.println(race + " Attribute Bonuses and Penalties");
            for (int i = 0; i < attributeName.length; i++){
                if (attributeValue[i] != 0) {
                    System.out.println(attributeName[i] + ": " + attributeValue[i]);
                }
            }
            System.out.println("");
        }
    }  

    public abstract String printDescription();
}
