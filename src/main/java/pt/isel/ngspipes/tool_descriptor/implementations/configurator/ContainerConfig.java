package pt.isel.ngspipes.tool_descriptor.implementations.configurator;

import pt.isel.ngspipes.tool_descriptor.interfaces.configurator.IConfig;

public class ContainerConfig implements IConfig {

    private String uri;
    private String tag;

    public String getUri() { return uri; }
    public void setUri(String uri) { this.uri = uri; }

    public String getTag() { return tag; }
    public void setTag(String tag) { this.tag = tag; }
}
