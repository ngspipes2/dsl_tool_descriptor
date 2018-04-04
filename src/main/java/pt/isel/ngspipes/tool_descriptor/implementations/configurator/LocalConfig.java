package pt.isel.ngspipes.tool_descriptor.implementations.configurator;

import pt.isel.ngspipes.tool_descriptor.interfaces.configurator.IConfig;

public class LocalConfig implements IConfig {

    private String[] setup;

    public String[] getSetup() { return setup; }
    public void setSetup(String[] setup) { this.setup = setup; }

}
