package pt.isel.ngspipes.tool_descriptor.interfaces;

import java.util.Collection;

public interface IToolDescriptor {

    String getName();
    String getAuthor();
    String getDescription();
    String getVersion();
    Collection<String> getDocumentation();
    Collection<ICommandDescriptor> getCommands();
    Collection<IExecutionContextDescriptor> getExecutionContexts();
    String getLogo();

}