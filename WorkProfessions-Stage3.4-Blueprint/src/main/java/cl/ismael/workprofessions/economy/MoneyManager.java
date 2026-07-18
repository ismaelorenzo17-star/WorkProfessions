package cl.ismael.workprofessions.economy;

import cl.ismael.workprofessions.player.PlayerProfessionData;

public class MoneyManager {

    public void deposit(PlayerProfessionData playerData, double amount) {
        if (playerData == null || amount <= 0) {
            return;
        }
        playerData.addMoney(amount);
    }

    public boolean withdraw(PlayerProfessionData playerData, double amount) {
        if (playerData == null || amount <= 0) {
            return false;
        }
        return playerData.removeMoney(amount);
    }

    public double getBalance(PlayerProfessionData playerData) {
        if (playerData == null) {
            return 0;
        }
        return playerData.getMoney();
    }

    public void setBalance(PlayerProfessionData playerData, double amount) {
        if (playerData == null) {
            return;
        }
        playerData.setMoney(amount);
    }
}
