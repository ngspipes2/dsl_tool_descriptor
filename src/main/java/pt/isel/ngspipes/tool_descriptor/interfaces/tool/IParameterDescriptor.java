package pt.isel.ngspipes.tool_descriptor.interfaces.tool;

public interface IParameterDescriptor {

    String getName();
    String getDescription();
    String getValue();
    String getType();
    boolean isRequired();
    String getPrefix();
    String getSuffix();
    String getSeparator();
    String getDependent();
    String getDependentValue();
    IParameterDescriptor getSubArguments();
}
