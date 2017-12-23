package com.jme3.anim.util;

import com.jme3.anim.Joint;
import com.jme3.export.Savable;
import com.jme3.math.Matrix4f;
import com.jme3.math.Transform;
import com.jme3.util.clone.JmeCloneable;

/**
 * Implementations of this interface holds accumulated model transform of a Joint.
 * Implementation might choose different accumulation strategy.
 */
public interface JointModelTransform extends JmeCloneable, Savable {

    void updateModelTransform(Transform localTransform, Joint parent);

    void getOffsetTransform(Matrix4f outTransform, Matrix4f inverseModelBindMatrix);

    void applyBindPose(Transform localTransform, Matrix4f inverseModelBindMatrix, Joint parent);

    Transform getModelTransform();
}
