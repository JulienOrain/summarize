package ouestfrance.julien.summarize.model;

public enum ServeurEnum {

    // ADV
    ADV_DEV_02("ADV_DEV_02", EnvironmentEnum.DEV, ProjectEnum.ADV, "http://d1ccpadv02.ouest-france.fr:8080/ccpadv"), 
    ADV_QUAL_02("ADV_QUAL_02", EnvironmentEnum.QUAL, ProjectEnum.ADV, "http://q1ccpadv02.ouest-france.fr:8080/ccpadv"),
    ADV_INT_02("ADV_INT_02", EnvironmentEnum.INT, ProjectEnum.ADV, "http://i1ccpadv02.ouest-france.fr:8080/ccpadv"), 
    ADV_INT_03("ADV_INT_03", EnvironmentEnum.INT, ProjectEnum.ADV, "http://i1ccpadv03.ouest-france.fr:8080/ccpadv"), 
    ADV_PROD_02("ADV_PROD_02", EnvironmentEnum.PROD, ProjectEnum.ADV, "http://p1ccpadv02.ouest-france.fr:8080/ccpadv"), 
    ADV_PROD_03("ADV_PROD_03", EnvironmentEnum.PROD, ProjectEnum.ADV, "http://p1ccpadv03.ouest-france.fr:8080/ccpadv"),

    // BSI
    BSI_DEV_02("BSI_DEV_02", EnvironmentEnum.DEV, ProjectEnum.BSI, "http://d1ccpbsi02.ouest-france.fr:8080/ccpbsi"), 
    BSI_QUAL_02("BSI_QUAL_02", EnvironmentEnum.QUAL, ProjectEnum.BSI, "http://q1ccpbsi02.ouest-france.fr:8080/ccpbsi"), 
    BSI_INT_02("BSI_INT_02", EnvironmentEnum.INT, ProjectEnum.BSI, "http://i1ccpbsi02.ouest-france.fr:8080/ccpbsi"), 
    BSI_INT_03("BSI_INT_03", EnvironmentEnum.INT, ProjectEnum.BSI, "http://i1ccpbsi03.ouest-france.fr:8080/ccpbsi"), 
    BSI_PROD_02("BSI_PROD_02", EnvironmentEnum.PROD, ProjectEnum.BSI, "http://p1ccpbsi02.ouest-france.fr:8080/ccpbsi"), 
    BSI_PROD_03("BSI_PROD_03", EnvironmentEnum.PROD, ProjectEnum.BSI, "http://p1ccpbsi03.ouest-france.fr:8080/ccpbsi"),

    // VCO
    VCO_DEV_01("VCO_DEV_01", EnvironmentEnum.DEV, ProjectEnum.VCO, "http://d1ccpvco01.ouest-france.fr:8080/ccpvco"), 
    VCO_QUAL_01("VCO_QUAL_01", EnvironmentEnum.QUAL, ProjectEnum.VCO, "http://q1ccpvco01.ouest-france.fr:8080/ccpvco"), 
    VCO_INT_01("VCO_INT_01", EnvironmentEnum.INT, ProjectEnum.VCO, "http://i1ccpvco01.ouest-france.fr:8080/ccpvco"), 
    VCO_INT_02("VCO_INT_02", EnvironmentEnum.INT, ProjectEnum.VCO, "http://i1ccpvco02.ouest-france.fr:8080/ccpvco"), 
    VCO_PROD_01("VCO_PROD_01", EnvironmentEnum.PROD, ProjectEnum.VCO, "http://p1ccpvco01.ouest-france.fr:8080/ccpvco"), 
    VCO_PROD_02("VCO_PROD_02", EnvironmentEnum.PROD, ProjectEnum.VCO, "http://p1ccpvco02.ouest-france.fr:8080/ccpvco");

    private String name;
    private EnvironmentEnum environment;
    private ProjectEnum project;
    private String baseUrl;

    private ServeurEnum(final String name, final EnvironmentEnum environment, final ProjectEnum project, final String baseUrl) {
        this.name = name;
        this.environment = environment;
        this.project = project;
        this.baseUrl = baseUrl;
    }

    public String getName() {
        return name;
    }

    public EnvironmentEnum getEnvironment() {
        return environment;
    }

    public ProjectEnum getProject() {
        return project;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getUrlInfo() {
        return getUrl(EndpointEnum.INFO);
    }

    public String getUrlServices() {
        return getUrl(EndpointEnum.SERVICES);
    }

    public String getUrlHealth() {
        return getUrl(EndpointEnum.HEALTH);
    }

    private String getUrl(EndpointEnum endpoint) {
        StringBuilder builder = new StringBuilder();
        builder.append(baseUrl);
        builder.append("/");
        builder.append(endpoint.getName());
        return builder.toString();
    }
}
