package pt.isel.ngspipes.tool_descriptor.interfaces.tool;

import java.util.Collection;

public interface ICommandDescriptor {

    String getName();
    String getDescription();
    int getRecomendedMemory();
    int getRecomendedDisk();
    int getRecomendedCpu();
    Collection<IParameterDescriptor> getParameters();
    Collection<IOutputDescriptor> getOutputs();
}
