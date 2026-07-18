package cl.ismael.workprofessions.profession;

public enum ProfessionType {

    MINER("Minero"),
    WOODCUTTER("Leñador"),
    FARMER("Agricultor"),
    FISHERMAN("Pescador"),
    BUILDER("Constructor"),
    HUNTER("Cazador");

    private final String displayName;

    ProfessionType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
