package pt.isel.ngspipes.tool_descriptor.interfaces;

import java.util.Map;

public interface IExecutionContextDescriptor {

    String getName();
    String getContext();
    Map<String, Object> getConfigurations();
}
