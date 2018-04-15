package pt.isel.ngspipes.tool_descriptor.implementations.execution_context;

import pt.isel.ngspipes.tool_descriptor.interfaces.configurator.IConfigurator;
import pt.isel.ngspipes.tool_descriptor.interfaces.configurator.IExecutionContext;

public class LocalExecutionContext implements IExecutionContext {

    private String[] setup;
    private String name;
    private String context;
    private IConfigurator config;

    public String[] getSetup() { return setup; }
    @Override
    public String getName() { return name; }
    @Override
    public String getContext() { return context; }
    @Override
    public IConfigurator getConfigurations() { return config; }

    public void setSetup(String[] setup) { this.setup = setup; }
    public void setName(String name) { this.name = name; }
    public void setContext(String context) { this.context = context; }
    public void setConfig(IConfigurator config) { this.config = config; }

}
