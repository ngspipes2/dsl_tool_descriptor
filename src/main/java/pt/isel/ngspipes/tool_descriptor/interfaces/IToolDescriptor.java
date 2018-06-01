package pt.isel.ngspipes.tool_descriptor.interfaces;

import java.util.Collection;

public interface IToolDescriptor {

    String getName();
    void setName(String name);

    String getAuthor();
    void setAuthor(String author);

    String getDescription();
    void setDescription(String description);

    String getVersion();
    void setVersion(String version);

    Collection<String> getDocumentation();
    void setDocumentation(Collection<String> documentation);

    Collection<ICommandDescriptor> getCommands();
    void setCommands(Collection<ICommandDescriptor> commands);

    byte[] getLogo();
    void setLogo(byte[] logo);

    Collection<IExecutionContextDescriptor> getExecutionContexts();
    void setExecutionContexts(Collection<IExecutionContextDescriptor> executionContexts);
}
