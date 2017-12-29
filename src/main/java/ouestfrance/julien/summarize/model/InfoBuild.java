package ouestfrance.julien.summarize.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class InfoBuild {

    private String name;
    private String artifact;
    private String version;
    private String time_iso8601;
    private String group;
    private String time;

    public InfoBuild() {
        super();
    }

    public InfoBuild(String name, String artifact, String version) {
        super();
        this.name = name;
        this.artifact = artifact;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtifact() {
        return artifact;
    }

    public void setArtifact(String artifact) {
        this.artifact = artifact;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTime_iso8601() {
        return time_iso8601;
    }

    public void setTime_iso8601(String time_iso8601) {
        this.time_iso8601 = time_iso8601;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }


}
