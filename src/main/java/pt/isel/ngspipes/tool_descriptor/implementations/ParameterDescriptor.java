package pt.isel.ngspipes.tool_descriptor.implementations;

import pt.isel.ngspipes.tool_descriptor.interfaces.IParameterDescriptor;

import java.util.Collection;

import static java.io.File.separator;

public class ParameterDescriptor implements IParameterDescriptor {

    private String name;
    private String description;
    private String[] values;
    private String type;
    private boolean required;
    private String prefix;
    private String suffix;
    private String separator;
    private String depends;
    private String[] dependentValues;
    private Collection<IParameterDescriptor> subParameters;

    @Override
    public String getName() { return name; }

    @Override
    public String getDescription() { return description; }

    @Override
    public String[] getValues() { return values; }

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
    public String getDepends() { return depends; }

    @Override
    public String[] getDependentValues() { return dependentValues; }

    @Override
    public Collection<IParameterDescriptor> getSubParameters() { return subParameters; }

    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setValues(String[] values) { this.values = values; }
    public void setType(String type) { this.type = type; }
    public void setRequired(boolean required) { this.required = required; }
    public void setPrefix(String prefix) { this.prefix = prefix; }
    public void setSuffix(String suffix) { this.suffix = suffix; }
    public void setSeparator(String separator) { this.separator = separator; }
    public void setDepends(String depends) { this.depends = depends; }
    public void setDependentValues(String[] dependentValue) { this.dependentValues = dependentValue; }
    public void setSubParameters(Collection<IParameterDescriptor> subParameters) { this.subParameters = subParameters; }

}
