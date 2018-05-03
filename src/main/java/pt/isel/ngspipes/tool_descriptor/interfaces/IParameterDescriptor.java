package pt.isel.ngspipes.tool_descriptor.interfaces;

import java.util.Collection;

public interface IParameterDescriptor {

    String getName();
    String getDescription();
    String getValues();
    String getType();
    boolean isRequired();
    String getPrefix();
    String getSuffix();
    String getSeparator();
    String getDependent();
    String[] getDependentValues();
    Collection<IParameterDescriptor> getParameters();
}
