package pt.isel.ngspipes.tool_descriptor.implementations;

import pt.isel.ngspipes.tool_descriptor.interfaces.IOutputDescriptor;

public class OutputDescriptor implements IOutputDescriptor {

    private String type;
    private String name;
    private String description;
    private String value;

    @Override
    public String getName() { return name; }
    @Override
    public void setName(String name) { this.name = name; }

    @Override
    public String getDescription() { return description; }
    @Override
    public void setDescription(String description) { this.description = description; }

    @Override
    public String getValue() { return value; }
    @Override
    public void setValue(String value) { this.value = value; }

    @Override
    public String getType() { return type; }
    @Override
    public void setType(String type) { this.type = type; }

}
