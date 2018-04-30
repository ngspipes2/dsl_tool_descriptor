package pt.isel.ngspipes.tool_descriptor.interfaces.tool;

import java.util.Collection;

public interface ICommandDescriptor {

    String getName();
    String getCommand();
    String getDescription();
    int getRecommendedMemory();
    int getRecommendedDisk();
    int getRecommendedCpu();
    Collection<IParameterDescriptor> getParameters();
    Collection<IOutputDescriptor> getOutputs();
}
