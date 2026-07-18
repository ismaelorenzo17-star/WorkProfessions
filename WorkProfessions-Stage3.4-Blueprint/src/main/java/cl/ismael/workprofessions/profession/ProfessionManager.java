
package cl.ismael.workprofessions.profession;

import java.util.EnumMap;
import java.util.Map;

public class ProfessionManager {

    private final Map<ProfessionType, Profession> professions = new EnumMap<>(ProfessionType.class);

    public ProfessionManager() {
        for (ProfessionType type : ProfessionType.values()) {
            professions.put(type, new Profession(type));
        }
    }

    public Profession getProfession(ProfessionType type) {
        return professions.get(type);
    }

    public void addXp(ProfessionType type, int amount) {
        Profession profession = professions.get(type);
        if (profession != null) {
            profession.addXp(amount);
        }
    }

    public int getLevel(ProfessionType type) {
        return getProfession(type).getLevel();
    }

    public int getXp(ProfessionType type) {
        return getProfession(type).getXp();
    }

    public int getRequiredXp(ProfessionType type) {
        return getProfession(type).getRequiredXp();
    }

    public Map<ProfessionType, Profession> getAllProfessions() {
        return professions;
    }
}
