package pt.isel.ngspipes.tool_descriptor.implementations.tool;

import pt.isel.ngspipes.tool_descriptor.interfaces.tool.IOutputDescriptor;

public class OutputDescriptor implements IOutputDescriptor {

    private String type;
    private String name;
    private String description;
    private String value;

    @Override
    public String getName() { return name; }

    @Override
    public String getDescription() { return description; }

    @Override
    public String getValue() { return value; }

    @Override
    public String getType() { return type; }

    public void setType(String type) { this.type = type; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setValue(String value) { this.value = value; }

}
