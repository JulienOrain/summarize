package ouestfrance.julien.summarize.model;

public enum EndpointEnum {
    INFO("info"), SERVICES("services"), HEALTH("health");

    private final String name;

    private EndpointEnum(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
