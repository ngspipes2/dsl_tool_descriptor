package pt.isel.ngspipes.tool_descriptor.interfaces.tool;

public interface IToolDescriptor {

    String getName();
    String getAuthor();
    String getDescription();
    String getVersion();
    String[] getDocumentation();
    ICommandDescriptor[] getCommands();
}
