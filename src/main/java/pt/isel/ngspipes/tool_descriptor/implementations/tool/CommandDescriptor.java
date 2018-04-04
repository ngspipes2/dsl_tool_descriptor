package pt.isel.ngspipes.tool_descriptor.implementations.tool;

import pt.isel.ngspipes.tool_descriptor.interfaces.tool.ICommandDescriptor;
import pt.isel.ngspipes.tool_descriptor.interfaces.tool.IOutputDescriptor;
import pt.isel.ngspipes.tool_descriptor.interfaces.tool.IParameterDescriptor;

public class CommandDescriptor implements ICommandDescriptor {

    private String name;
    private String description;
    private int recomendedMemory;
    private int recomendedDisk;
    private int recomendedCpu;
    private IParameterDescriptor[] parameters;
    private IOutputDescriptor[] outputs;

    @Override
    public String getName() { return name; }

    @Override
    public String getDescription() { return description; }

    @Override
    public int getRecomendedMemory() { return recomendedMemory; }

    @Override
    public int getRecomendedDisk() { return recomendedDisk; }

    @Override
    public int getRecomendedCpu() { return recomendedCpu; }

    @Override
    public IParameterDescriptor[] getParameters() { return parameters; }

    @Override
    public IOutputDescriptor[] getOutputs() { return outputs; }


    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setRecomendedMemory(int recomendedMemory) { this.recomendedMemory = recomendedMemory; }
    public void setRecomendedDisk(int recomendedDisk) { this.recomendedDisk = recomendedDisk; }
    public void setRecomendedCpu(int recomendedCpu) { this.recomendedCpu = recomendedCpu; }
    public void setParameters(IParameterDescriptor[] parameters) { this.parameters = parameters; }
    public void setOutputs(IOutputDescriptor[] outputs) { this.outputs = outputs; }

}
