package pt.isel.ngspipes.tool_descriptor.implementations;

import pt.isel.ngspipes.tool_descriptor.interfaces.IExecutionContextDescriptor;

import java.util.Map;

public class ExecutionContextDescriptor implements IExecutionContextDescriptor {

    protected String name;
    protected String context;
    protected Map<String, Object> config;

    @Override
    public String getName() { return name; }
    @Override
    public String getContext() { return context; }
    @Override
    public Map<String, Object> getConfigurations() { return config; }

    public void setName(String name) { this.name = name; }
    public void setContext(String context) { this.context = context; }
    public void setConfig(Map<String, Object> config) { this.config = config; }

}
