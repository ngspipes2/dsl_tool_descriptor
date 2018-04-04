package pt.isel.ngspipes.tool_descriptor.implementations.tool;

import pt.isel.ngspipes.tool_descriptor.interfaces.tool.IParameterDescriptor;

import static java.io.File.separator;

public class ParameterDescriptor implements IParameterDescriptor {

    private String name;
    private String description;
    private String value;
    private String type;
    private boolean required;
    private String prefix;
    private String suffix;
    private String dependent;
    private String dependentValue;
    private IParameterDescriptor subparameters;

    @Override
    public String getName() { return name; }

    @Override
    public String getDescription() { return description; }

    @Override
    public String getValues() { return value; }

    @Override
    public String getType() { return type; }

    @Override
    public boolean isRequired() { return required; }

    @Override
    public String getPrefix() { return prefix; }

    @Override
    public String getSuffix() { return suffix; }

    @Override
    public String getSeparator() { return separator; }

    @Override
    public String getDependent() { return dependent; }

    @Override
    public String getDependentValue() { return dependentValue; }

    @Override
    public IParameterDescriptor getParameters() { return subparameters; }

    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setValue(String value) { this.value = value; }
    public void setType(String type) { this.type = type; }
    public void setRequired(boolean required) { this.required = required; }
    public void setPrefix(String prefix) { this.prefix = prefix; }
    public void setSuffix(String suffix) { this.suffix = suffix; }
    public void setDependent(String dependent) { this.dependent = dependent; }
    public void setDependentValue(String dependentValue) { this.dependentValue = dependentValue; }
    public void setSubparameters(IParameterDescriptor subparameters) { this.subparameters = subparameters; }

}
