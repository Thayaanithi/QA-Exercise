package org;

public class Infareded implements ConnectionStrategy {
	@Override
    public void connectTo(String phone) {
        System.out.println(String.format("Connecting to %s via HDMI audio...", phone));
        System.out.println("HDMI audio connected.");
}
