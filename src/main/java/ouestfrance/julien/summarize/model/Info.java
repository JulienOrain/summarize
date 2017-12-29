package ouestfrance.julien.summarize.model;

public class Info {

    private InfoBuild build;

    public Info() {
        super();
    }

    public Info(InfoBuild build) {
        super();
        this.build = build;
    }

    public InfoBuild getBuild() {
        return build;
    }

    public void setBuild(InfoBuild build) {
        this.build = build;
    }

    @Override
    public String toString() {
        return "Data [build=" + build + "]";
    }

}
