package pt.isel.ngspipes.tool_descriptor.interfaces.tool;

public interface ICommandDescriptor {

    String getName();
    String getDescription();
    int getRecomendedMemory();
    int getRecomendedDisk();
    int getRecomendedCpu();
    IParameterDescriptor[] getParameters();
    IOutputDescriptor[] getOutputs();
}
