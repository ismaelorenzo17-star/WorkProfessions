package cl.ismael.workprofessions.player;

import cl.ismael.workprofessions.profession.Profession;
import cl.ismael.workprofessions.profession.ProfessionManager;
import cl.ismael.workprofessions.profession.ProfessionType;

public class PlayerProfessionData {

    private final ProfessionManager professionManager = new ProfessionManager();

    private double money = 0;

    public ProfessionManager getProfessionManager() {
        return professionManager;
    }

    public Profession getProfession(ProfessionType type) {
        return professionManager.getProfession(type);
    }

    public void addXp(ProfessionType type, int amount) {
        professionManager.addXp(type, amount);
    }

    public double getMoney() {
        return money;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            money += amount;
        }
    }

    public boolean removeMoney(double amount) {
        if (amount <= 0) return false;
        if (money < amount) return false;

        money -= amount;
        return true;
    }

    public void setMoney(double money) {
        this.money = Math.max(0, money);
    }
}
