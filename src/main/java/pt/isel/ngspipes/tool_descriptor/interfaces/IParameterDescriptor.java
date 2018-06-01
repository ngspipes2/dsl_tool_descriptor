package pt.isel.ngspipes.tool_descriptor.interfaces;

import java.util.Collection;

public interface IParameterDescriptor {

    String getName();
    void setName(String name);

    String getDescription();
    void setDescription(String description);

    Collection<String> getValues();
    void setValues(Collection<String> values);

    String getType();
    void setType(String type);

    boolean isRequired();
    void setRequired(boolean required);

    String getPrefix();
    void setPrefix(String prefix);

    String getSuffix();
    void setSuffix(String suffix);

    String getSeparator();
    void setSeparator(String separator);

    String getDepends();
    void setDepends(String depends);

    Collection<String> getDependentValues();
    void setDependentValues(Collection<String> dependentValue);

    Collection<IParameterDescriptor> getSubParameters();
    void setSubParameters(Collection<IParameterDescriptor> subParameters);

}
