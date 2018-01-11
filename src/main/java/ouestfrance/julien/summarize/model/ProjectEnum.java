package ouestfrance.julien.summarize.model;

import org.apache.commons.lang.StringUtils;

public enum ProjectEnum {
    AUT("CCP-AUT"), ADV("CCP-ADV"), BSI("CCP-BSI"), VCO("CCP-VCO");

    private final String name;

    private ProjectEnum(final String name) {
        this.name = name;
    }

    public static ProjectEnum getByName(final String name) {
        ProjectEnum environment = null;
        if (StringUtils.isNotBlank(name)) {
            for (ProjectEnum e : ProjectEnum.values()) {
                if (name.equals(e.name)) {
                    environment = e;
                    break;
                }
            }
        }
        return environment;

    }
}
