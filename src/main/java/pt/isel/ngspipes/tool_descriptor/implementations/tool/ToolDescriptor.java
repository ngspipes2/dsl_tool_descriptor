package pt.isel.ngspipes.tool_descriptor.implementations.tool;

import pt.isel.ngspipes.tool_descriptor.interfaces.tool.ICommandDescriptor;
import pt.isel.ngspipes.tool_descriptor.interfaces.tool.IToolDescriptor;

import java.util.Collection;

public class ToolDescriptor implements IToolDescriptor {

    private String name;
    private String author;
    private String description;
    private String version;
    private Collection<String> documentation;
    private Collection<ICommandDescriptor> commands;


    @Override
    public String getName() { return name; }

    @Override
    public String getAuthor() { return author; }

    @Override
    public String getDescription() { return description; }

    @Override
    public String getVersion() { return version; }

    @Override
    public Collection<String> getDocumentation() { return documentation; }

    @Override
    public Collection<ICommandDescriptor> getCommands() { return commands; }

    public void setName(String name) { this.name = name; }
    public void setAuthor(String author) { this.author = author; }
    public void setDescription(String description) { this.description = description; }
    public void setVersion(String version) { this.version = version; }
    public void setDocumentation(Collection<String> documentation) { this.documentation = documentation; }
    public void setCommands(Collection<ICommandDescriptor> commands) { this.commands = commands; }

}
