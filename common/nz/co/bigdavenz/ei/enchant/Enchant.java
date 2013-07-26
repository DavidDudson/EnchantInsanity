package nz.co.bigdavenz.ei.enchant;

public class Enchant {

    private Object name;
    private int Level;
    private int requiredLevel;
    private int EnchantLevel;
    private int EnchantXP;
    private String requiredSkill;
    private int ID;
    private double modifier;

    public static void init() {
    }

    // Enchant constructor
    public Enchant(int EnchantID, String EnchantName, String requiredSkill,
            int requiredLevel, double modifier) {
        this.ID = EnchantID;
        this.name = EnchantName;
        this.requiredSkill = requiredSkill;
        this.requiredLevel = requiredLevel;
        this.EnchantLevel = 0;
        this.EnchantXP = 0;
        this.modifier = modifier;
    }
}
