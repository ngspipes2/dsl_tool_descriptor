package pt.isel.ngspipes.tool_descriptor.implementations;

import pt.isel.ngspipes.tool_descriptor.interfaces.IParameterDescriptor;

import java.util.Collection;

import static java.io.File.separator;

public class ParameterDescriptor implements IParameterDescriptor {

    private String name;
    private String description;
    private Collection<String> values;
    private String type;
    private boolean required;
    private String prefix;
    private String suffix;
    private String separator;
    private String depends;
    private Collection<String> dependentValues;
    private Collection<IParameterDescriptor> subParameters;

    @Override
    public String getName() { return name; }
    @Override
    public void setName(String name) { this.name = name; }

    @Override
    public String getDescription() { return description; }
    @Override
    public void setDescription(String description) { this.description = description; }

    @Override
    public Collection<String> getValues() { return values; }
    @Override
    public void setValues(Collection<String> values) { this.values = values; }

    @Override
    public String getType() { return type; }
    @Override
    public void setType(String type) { this.type = type; }

    @Override
    public boolean isRequired() { return required; }
    @Override
    public void setRequired(boolean required) { this.required = required; }

    @Override
    public String getPrefix() { return prefix; }
    @Override
    public void setPrefix(String prefix) { this.prefix = prefix; }

    @Override
    public String getSuffix() { return suffix; }
    @Override
    public void setSuffix(String suffix) { this.suffix = suffix; }

    @Override
    public String getSeparator() { return separator; }
    @Override
    public void setSeparator(String separator) { this.separator = separator; }

    @Override
    public String getDepends() { return depends; }
    @Override
    public void setDepends(String depends) { this.depends = depends; }

    @Override
    public Collection<String> getDependentValues() { return dependentValues; }
    @Override
    public void setDependentValues(Collection<String> dependentValue) { this.dependentValues = dependentValue; }

    @Override
    public Collection<IParameterDescriptor> getSubParameters() { return subParameters; }
    @Override
    public void setSubParameters(Collection<IParameterDescriptor> subParameters) { this.subParameters = subParameters; }

}
