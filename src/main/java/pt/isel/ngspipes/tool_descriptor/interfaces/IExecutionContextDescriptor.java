package pt.isel.ngspipes.tool_descriptor.interfaces;

import java.util.Map;

public interface IExecutionContextDescriptor {

    String getName();
    void setName(String name);

    String getContext();
    void setContext(String context);

    Map<String, Object> getConfig();
    void setConfig(Map<String, Object> config);
}
