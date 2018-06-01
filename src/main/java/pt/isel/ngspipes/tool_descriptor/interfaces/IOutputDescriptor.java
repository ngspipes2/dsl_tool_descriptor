package pt.isel.ngspipes.tool_descriptor.interfaces;

public interface IOutputDescriptor {

    String getName();
    void setName(String name);

    String getDescription();
    void setDescription(String description);

    String getValue();
    void setValue(String value);

    String getType();
    void setType(String type);
}
