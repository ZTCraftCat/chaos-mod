package space.chaosmc.chaos.util;

public enum Reference {
    MODID("chaos"),
    MODNAME("The ChaosMC Mod");

    private final String value;

    Reference(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
