package pt.isel.ngspipes.tool_descriptor.implementations.tool;

import pt.isel.ngspipes.tool_descriptor.interfaces.tool.ICommandDescriptor;
import pt.isel.ngspipes.tool_descriptor.interfaces.tool.IOutputDescriptor;
import pt.isel.ngspipes.tool_descriptor.interfaces.tool.IParameterDescriptor;

import java.util.Collection;

public class CommandDescriptor implements ICommandDescriptor {

    private String name;
    private String description;
    private int recommendedMemory;
    private int recommendedDisk;
    private int recommendedCpu;
    private Collection<IParameterDescriptor> parameters;
    private Collection<IOutputDescriptor> outputs;
    private String command;

    @Override
    public String getName() { return name; }

    @Override
    public String getCommand() { return command; }

    @Override
    public String getDescription() { return description; }

    @Override
    public int getRecommendedMemory() { return recommendedMemory; }

    @Override
    public int getRecommendedDisk() { return recommendedDisk; }

    @Override
    public int getRecommendedCpu() { return recommendedCpu; }

    @Override
    public Collection<IParameterDescriptor> getParameters() { return parameters; }

    @Override
    public Collection<IOutputDescriptor> getOutputs() { return outputs; }


    public void setName(String name) { this.name = name; }
    public void setCommand(String command) { this.command = command; }
    public void setDescription(String description) { this.description = description; }
    public void setRecommendedMemory(int recommendedMemory) { this.recommendedMemory = recommendedMemory; }
    public void setRecommendedDisk(int recommendedDisk) { this.recommendedDisk = recommendedDisk; }
    public void setRecommendedCpu(int recommendedCpu) { this.recommendedCpu = recommendedCpu; }
    public void setParameters(Collection<IParameterDescriptor> parameters) { this.parameters = parameters; }
    public void setOutputs(Collection<IOutputDescriptor> outputs) { this.outputs = outputs; }

}
