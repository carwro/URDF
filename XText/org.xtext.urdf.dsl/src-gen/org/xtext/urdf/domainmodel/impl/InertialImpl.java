/**
 * generated by Xtext 2.10.0
 */
package org.xtext.urdf.domainmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.urdf.domainmodel.DomainmodelPackage;
import org.xtext.urdf.domainmodel.Inertia;
import org.xtext.urdf.domainmodel.Inertial;
import org.xtext.urdf.domainmodel.Mass;
import org.xtext.urdf.domainmodel.Origin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inertial</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.urdf.domainmodel.impl.InertialImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.xtext.urdf.domainmodel.impl.InertialImpl#getMass <em>Mass</em>}</li>
 *   <li>{@link org.xtext.urdf.domainmodel.impl.InertialImpl#getInertia <em>Inertia</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InertialImpl extends MinimalEObjectImpl.Container implements Inertial
{
  /**
   * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrigin()
   * @generated
   * @ordered
   */
  protected Origin origin;

  /**
   * The cached value of the '{@link #getMass() <em>Mass</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMass()
   * @generated
   * @ordered
   */
  protected EList<Mass> mass;

  /**
   * The cached value of the '{@link #getInertia() <em>Inertia</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInertia()
   * @generated
   * @ordered
   */
  protected EList<Inertia> inertia;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InertialImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DomainmodelPackage.Literals.INERTIAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Origin getOrigin()
  {
    return origin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrigin(Origin newOrigin, NotificationChain msgs)
  {
    Origin oldOrigin = origin;
    origin = newOrigin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.INERTIAL__ORIGIN, oldOrigin, newOrigin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrigin(Origin newOrigin)
  {
    if (newOrigin != origin)
    {
      NotificationChain msgs = null;
      if (origin != null)
        msgs = ((InternalEObject)origin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.INERTIAL__ORIGIN, null, msgs);
      if (newOrigin != null)
        msgs = ((InternalEObject)newOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.INERTIAL__ORIGIN, null, msgs);
      msgs = basicSetOrigin(newOrigin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.INERTIAL__ORIGIN, newOrigin, newOrigin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mass> getMass()
  {
    if (mass == null)
    {
      mass = new EObjectContainmentEList<Mass>(Mass.class, this, DomainmodelPackage.INERTIAL__MASS);
    }
    return mass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Inertia> getInertia()
  {
    if (inertia == null)
    {
      inertia = new EObjectContainmentEList<Inertia>(Inertia.class, this, DomainmodelPackage.INERTIAL__INERTIA);
    }
    return inertia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainmodelPackage.INERTIAL__ORIGIN:
        return basicSetOrigin(null, msgs);
      case DomainmodelPackage.INERTIAL__MASS:
        return ((InternalEList<?>)getMass()).basicRemove(otherEnd, msgs);
      case DomainmodelPackage.INERTIAL__INERTIA:
        return ((InternalEList<?>)getInertia()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DomainmodelPackage.INERTIAL__ORIGIN:
        return getOrigin();
      case DomainmodelPackage.INERTIAL__MASS:
        return getMass();
      case DomainmodelPackage.INERTIAL__INERTIA:
        return getInertia();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainmodelPackage.INERTIAL__ORIGIN:
        setOrigin((Origin)newValue);
        return;
      case DomainmodelPackage.INERTIAL__MASS:
        getMass().clear();
        getMass().addAll((Collection<? extends Mass>)newValue);
        return;
      case DomainmodelPackage.INERTIAL__INERTIA:
        getInertia().clear();
        getInertia().addAll((Collection<? extends Inertia>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DomainmodelPackage.INERTIAL__ORIGIN:
        setOrigin((Origin)null);
        return;
      case DomainmodelPackage.INERTIAL__MASS:
        getMass().clear();
        return;
      case DomainmodelPackage.INERTIAL__INERTIA:
        getInertia().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DomainmodelPackage.INERTIAL__ORIGIN:
        return origin != null;
      case DomainmodelPackage.INERTIAL__MASS:
        return mass != null && !mass.isEmpty();
      case DomainmodelPackage.INERTIAL__INERTIA:
        return inertia != null && !inertia.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InertialImpl