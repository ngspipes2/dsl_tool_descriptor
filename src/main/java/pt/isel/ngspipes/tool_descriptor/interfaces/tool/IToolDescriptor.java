package pt.isel.ngspipes.tool_descriptor.interfaces.tool;

import pt.isel.ngspipes.tool_descriptor.interfaces.configurator.IExecutionContextDescriptor;

import java.util.Collection;

public interface IToolDescriptor {

    String getName();
    String getAuthor();
    String getDescription();
    String getVersion();
    Collection<String> getDocumentation();
    Collection<ICommandDescriptor> getCommands();
    Collection<IExecutionContextDescriptor> getExecutionContexts();

}
