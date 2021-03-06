package pt.isel.ngspipes.tool_descriptor.implementations;

import pt.isel.ngspipes.tool_descriptor.interfaces.ICommandDescriptor;
import pt.isel.ngspipes.tool_descriptor.interfaces.IExecutionContextDescriptor;
import pt.isel.ngspipes.tool_descriptor.interfaces.IToolDescriptor;

import java.util.Collection;

public class ToolDescriptor implements IToolDescriptor {

    private String name;
    private String author;
    private String description;
    private String version;
    private Collection<String> documentation;
    private Collection<ICommandDescriptor> commands;
    private Collection<IExecutionContextDescriptor> executionContexts;
    private byte[] logo;

    public ToolDescriptor(String name, String author,
                          String description, String version,
                          Collection<String> documentation, Collection<ICommandDescriptor> commands,
                          byte[] logo, Collection<IExecutionContextDescriptor> executionContexts) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.version = version;
        this.documentation = documentation;
        this.commands = commands;
        this.logo = logo;
        this.executionContexts = executionContexts;
    }

    public ToolDescriptor() {}

    @Override
    public String getName() { return name; }
    @Override
    public void setName(String name) { this.name = name; }

    @Override
    public String getAuthor() { return author; }
    @Override
    public void setAuthor(String author) { this.author = author; }

    @Override
    public String getDescription() { return description; }
    @Override
    public void setDescription(String description) { this.description = description; }

    @Override
    public String getVersion() { return version; }
    @Override
    public void setVersion(String version) { this.version = version; }

    @Override
    public Collection<String> getDocumentation() { return documentation; }
    @Override
    public void setDocumentation(Collection<String> documentation) { this.documentation = documentation; }

    @Override
    public Collection<ICommandDescriptor> getCommands() { return commands; }
    @Override
    public void setCommands(Collection<ICommandDescriptor> commands) { this.commands = commands; }

    @Override
    public byte[] getLogo() { return logo; }
    @Override
    public void setLogo(byte[] logo) { this.logo = logo; }

    @Override
    public Collection<IExecutionContextDescriptor> getExecutionContexts() { return executionContexts; }
    @Override
    public void setExecutionContexts(Collection<IExecutionContextDescriptor> executionContexts) { this.executionContexts = executionContexts; }

}
