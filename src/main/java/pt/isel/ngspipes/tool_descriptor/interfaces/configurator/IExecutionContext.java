package pt.isel.ngspipes.tool_descriptor.interfaces.configurator;

public interface IExecutionContext {

    String getName();
    String getContext();
    IConfigurator getConfigurations();
}
