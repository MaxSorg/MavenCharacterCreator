public enum PlayerClass {
    
    BARBARIAN(12, "Light", "Berserker Rage", "Wildling") {
        @Override
        public String abilityOneDescription() {
            String desc = "They get angry and stuff";
            return desc;
        }
        public String abilityTwoDescription() {
            String desc = "Bonus to AC if wearing light armor";
            return desc;
        }
    },
    FIGHTER(10, "Heavy & Shields", "Adrenaline", "Second Wind") {
        @Override
        public String abilityOneDescription() {
            String desc = "Do an extra thing in a turn";
            return desc;
        }
        public String abilityTwoDescription() {
            String desc = "Recover some hp";
            return desc;
        }
    },
    PALADIN(10, "Heavy & Shields", "Smite", "Lay on Hands") {
        @Override
        public String abilityOneDescription() {
            String desc = "Do lots of damage, buff yourself";
            return desc;
        }
        public String abilityTwoDescription() {
            String desc = "Heal yourself or someone";
            return desc;
        }
    },
    CLERIC(8, "Heavy & Shields", "Turn Undead", "Invoke Divinity") {
        @Override
        public String abilityOneDescription() {
            String desc = "Fear / disintegrate undead";
            return desc;
        }
        public String abilityTwoDescription() {
            String desc = "Chosen god special thing";
            return desc;
        }
    },
    DRUID(8, "Medium & Shields", "Animal Companion", "Formshift") {
        @Override
        public String abilityOneDescription() {
            String desc = "Pick an animal";
            return desc;
        }
        public String abilityTwoDescription() {
            String desc = "Become an animal";
            return desc;
        }
    },
    RANGER(8, "Medium", "Tactical Mastery", "Heart Piercer") {
        @Override
        public String abilityOneDescription() {
            String desc = "Be good at melee or ranged";
            return desc;
        }
        public String abilityTwoDescription() {
            String desc = "Do lots of damage";
            return desc;
        }
    },
    ROGUE(6, "Light", "Backstab", "Evasion") {
        @Override
        public String abilityOneDescription() {
            String desc = "Do it from behind";
            return desc;
        }
        public String abilityTwoDescription() {
            String desc = "Don't get hit sometimes";
            return desc;
        }
    },    
    WIZARD(4, "None", "Presence of Mind", "Mirror Image") {
        @Override
        public String abilityOneDescription() {
            String desc = "Recover spell casts";
            return desc;
        }
        public String abilityTwoDescription() {
            String desc = "Become hard to hit";
            return desc;
        }
    }; 

    final private int hitPoints;
    final private String armorProf;
    final private String abilityOne;
    final private String abilityTwo;

    PlayerClass(int hitPoints, String armorProf, String abilityOne, String abilityTwo) {
        this.hitPoints = hitPoints;
        this.armorProf = armorProf;
        this.abilityOne = abilityOne;
        this.abilityTwo = abilityTwo;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public String getArmorProf() {
        return armorProf;
    }

    public String getAbilityOne() {
        return abilityOne;
    }

    public String getAbilityTwo() {
        return abilityTwo;
    }

    public abstract String abilityOneDescription();
    public abstract String abilityTwoDescription(); 

}
