package pt.isel.ngspipes.tool_descriptor.interfaces;

import java.util.Collection;

public interface IParameterDescriptor {

    String getName();
    String getDescription();
    Collection<String> getValues();
    String getType();
    boolean isRequired();
    String getPrefix();
    String getSuffix();
    String getSeparator();
    String getDepends();
    Collection<String> getDependentValues();
    Collection<IParameterDescriptor> getSubParameters();
}
