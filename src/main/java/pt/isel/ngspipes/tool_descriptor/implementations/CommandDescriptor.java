package pt.isel.ngspipes.tool_descriptor.implementations;

import pt.isel.ngspipes.tool_descriptor.interfaces.ICommandDescriptor;
import pt.isel.ngspipes.tool_descriptor.interfaces.IOutputDescriptor;
import pt.isel.ngspipes.tool_descriptor.interfaces.IParameterDescriptor;

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


    public CommandDescriptor(String name, String description, int recommendedMemory, int recommendedDisk, int recommendedCpu, Collection<IParameterDescriptor> parameters, Collection<IOutputDescriptor> outputs, String command) {
        this.name = name;
        this.description = description;
        this.recommendedMemory = recommendedMemory;
        this.recommendedDisk = recommendedDisk;
        this.recommendedCpu = recommendedCpu;
        this.parameters = parameters;
        this.outputs = outputs;
        this.command = command;
    }

    public CommandDescriptor() { }


    @Override
    public String getName() { return name; }
    @Override
    public void setName(String name) { this.name = name; }

    @Override
    public String getCommand() { return command; }
    @Override
    public void setCommand(String command) { this.command = command; }

    @Override
    public String getDescription() { return description; }
    @Override
    public void setDescription(String description) { this.description = description; }

    @Override
    public int getRecommendedMemory() { return recommendedMemory; }
    @Override
    public void setRecommendedMemory(int recommendedMemory) { this.recommendedMemory = recommendedMemory; }

    @Override
    public int getRecommendedDisk() { return recommendedDisk; }
    @Override
    public void setRecommendedDisk(int recommendedDisk) { this.recommendedDisk = recommendedDisk; }

    @Override
    public int getRecommendedCpu() { return recommendedCpu; }
    @Override
    public void setRecommendedCpu(int recommendedCpu) { this.recommendedCpu = recommendedCpu; }

    @Override
    public Collection<IParameterDescriptor> getParameters() { return parameters; }
    @Override
    public void setParameters(Collection<IParameterDescriptor> parameters) { this.parameters = parameters; }

    @Override
    public Collection<IOutputDescriptor> getOutputs() { return outputs; }
    @Override
    public void setOutputs(Collection<IOutputDescriptor> outputs) { this.outputs = outputs; }

}
