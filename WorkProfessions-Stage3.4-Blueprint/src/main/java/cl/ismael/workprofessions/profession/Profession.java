package cl.ismael.workprofessions.profession;

/**
 * Representa el progreso de una profesión para un jugador.
 */
public class Profession {

    private final ProfessionType type;
    private int level;
    private int xp;
    private int totalXp;

    public Profession(ProfessionType type) {
        this.type = type;
        this.level = 1;
        this.xp = 0;
        this.totalXp = 0;
    }

    public ProfessionType getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public int getTotalXp() {
        return totalXp;
    }

    public int getRequiredXp() {
        return level * 100;
    }

    public float getProgress() {
        return (float) xp / getRequiredXp();
    }

    public void addXp(int amount) {
        if (amount <= 0) return;

        totalXp += amount;
        xp += amount;

        while (xp >= getRequiredXp()) {
            xp -= getRequiredXp();
            level++;
        }
    }

    public void setLevel(int level) {
        this.level = Math.max(1, level);
    }

    public void setXp(int xp) {
        this.xp = Math.max(0, xp);
    }
}
