/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.domainmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.urdf.domainmodel.DomainmodelPackage
 * @generated
 */
public interface DomainmodelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DomainmodelFactory eINSTANCE = org.xtext.urdf.domainmodel.impl.DomainmodelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Robot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Robot</em>'.
   * @generated
   */
  Robot createRobot();

  /**
   * Returns a new object of class '<em>Material</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Material</em>'.
   * @generated
   */
  Material createMaterial();

  /**
   * Returns a new object of class '<em>Geometry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Geometry</em>'.
   * @generated
   */
  Geometry createGeometry();

  /**
   * Returns a new object of class '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link</em>'.
   * @generated
   */
  Link createLink();

  /**
   * Returns a new object of class '<em>Joint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Joint</em>'.
   * @generated
   */
  Joint createJoint();

  /**
   * Returns a new object of class '<em>Inertial</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inertial</em>'.
   * @generated
   */
  Inertial createInertial();

  /**
   * Returns a new object of class '<em>Visual</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Visual</em>'.
   * @generated
   */
  Visual createVisual();

  /**
   * Returns a new object of class '<em>Collision</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collision</em>'.
   * @generated
   */
  Collision createCollision();

  /**
   * Returns a new object of class '<em>Origin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Origin</em>'.
   * @generated
   */
  Origin createOrigin();

  /**
   * Returns a new object of class '<em>Mass</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mass</em>'.
   * @generated
   */
  Mass createMass();

  /**
   * Returns a new object of class '<em>Inertia</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inertia</em>'.
   * @generated
   */
  Inertia createInertia();

  /**
   * Returns a new object of class '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color</em>'.
   * @generated
   */
  Color createColor();

  /**
   * Returns a new object of class '<em>Texture</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Texture</em>'.
   * @generated
   */
  Texture createTexture();

  /**
   * Returns a new object of class '<em>Box</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Box</em>'.
   * @generated
   */
  Box createBox();

  /**
   * Returns a new object of class '<em>Cylinder</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cylinder</em>'.
   * @generated
   */
  Cylinder createCylinder();

  /**
   * Returns a new object of class '<em>Mesh</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mesh</em>'.
   * @generated
   */
  Mesh createMesh();

  /**
   * Returns a new object of class '<em>Sphere</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sphere</em>'.
   * @generated
   */
  Sphere createSphere();

  /**
   * Returns a new object of class '<em>Limit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Limit</em>'.
   * @generated
   */
  Limit createLimit();

  /**
   * Returns a new object of class '<em>Axis</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Axis</em>'.
   * @generated
   */
  Axis createAxis();

  /**
   * Returns a new object of class '<em>Callibration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Callibration</em>'.
   * @generated
   */
  Callibration createCallibration();

  /**
   * Returns a new object of class '<em>Dynamics</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dynamics</em>'.
   * @generated
   */
  Dynamics createDynamics();

  /**
   * Returns a new object of class '<em>Mimic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mimic</em>'.
   * @generated
   */
  Mimic createMimic();

  /**
   * Returns a new object of class '<em>Safety Controller</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Safety Controller</em>'.
   * @generated
   */
  SafetyController createSafetyController();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DomainmodelPackage getDomainmodelPackage();

} //DomainmodelFactory