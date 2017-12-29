package ouestfrance.julien.summarize.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Info {

    private InfoBuild build;
    private boolean statusUp;

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

    public boolean isStatusUp() {
        return statusUp;
    }

    public void setStatusUp(boolean statusUp) {
        this.statusUp = statusUp;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }


}
