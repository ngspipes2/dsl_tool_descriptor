package pt.isel.ngspipes.tool_descriptor.interfaces;

import java.util.Collection;

public interface ICommandDescriptor {

    String getName();
    void setName(String name);

    String getCommand();
    void setCommand(String command);

    String getDescription();
    void setDescription(String description);

    int getRecommendedMemory();
    public void setRecommendedMemory(int recommendedMemory);

    int getRecommendedDisk();
    void setRecommendedDisk(int recommendedDisk);

    int getRecommendedCpu();
    void setRecommendedCpu(int recommendedCpu);

    Collection<IParameterDescriptor> getParameters();
    void setParameters(Collection<IParameterDescriptor> parameters);

    Collection<IOutputDescriptor> getOutputs();
    void setOutputs(Collection<IOutputDescriptor> outputs);
}
