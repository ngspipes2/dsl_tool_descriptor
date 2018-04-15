package pt.isel.ngspipes.tool_descriptor.implementations.execution_context;

import pt.isel.ngspipes.tool_descriptor.interfaces.configurator.IConfigurator;
import pt.isel.ngspipes.tool_descriptor.interfaces.configurator.IExecutionContext;

public class ContainerExecutionContext implements IExecutionContext {

    private String uri;
    private String tag;
    private String name;
    private String context;
    private IConfigurator config;

    public String getUri() { return uri; }
    public String getTag() { return tag; }
    @Override
    public String getName() { return name; }
    @Override
    public String getContext() { return context; }
    @Override
    public IConfigurator getConfigurations() { return config; }

    public void setUri(String uri) { this.uri = uri; }
    public void setTag(String tag) { this.tag = tag; }
    public void setName(String name) { this.name = name; }
    public void setContext(String context) { this.context = context; }
    public void setConfig(IConfigurator config) { this.config = config; }

}
