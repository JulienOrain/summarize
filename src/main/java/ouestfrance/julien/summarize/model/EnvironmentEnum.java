package ouestfrance.julien.summarize.model;

import org.apache.commons.lang.StringUtils;

public enum EnvironmentEnum {
    DEV("Développement"), INT("Intégration"), QUAL("Qualification"), PROD("Production");

    private final String name;

    private EnvironmentEnum(final String name) {
        this.name = name;
    }

    public static EnvironmentEnum getByName(final String name) {
        EnvironmentEnum environment = null;
        if (StringUtils.isNotBlank(name)) {
            for (EnvironmentEnum e : EnvironmentEnum.values()) {
                if (name.equals(e.name)) {
                    environment = e;
                    break;
                }
            }
        }
        return environment;

    }
}
