package org.usfirst.frc2783.vision.server;

/**
 * A container class for Targets detected by the vision system, containing the
 * location in three-dimensional space.
 * 
 * @author 254
 */
public class TargetInfo {
    protected double x = 1.0;
    protected double y;
    protected double z;

    public TargetInfo(double y, double z) {
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}