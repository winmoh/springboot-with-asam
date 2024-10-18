/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.asam.asam.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.asam.asam.AsamPackage;
import org.xtext.example.asam.asam.Property;
import org.xtext.example.asam.asam.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.asam.asam.impl.PropertyImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link org.xtext.example.asam.asam.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.asam.asam.impl.PropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property
{
  /**
   * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNom()
   * @generated
   * @ordered
   */
  protected static final String NOM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNom()
   * @generated
   * @ordered
   */
  protected String nom = NOM_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyImpl()
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
    return AsamPackage.Literals.PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNom()
  {
    return nom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNom(String newNom)
  {
    String oldNom = nom;
    nom = newNom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsamPackage.PROPERTY__NOM, oldNom, nom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsamPackage.PROPERTY__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsamPackage.PROPERTY__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsamPackage.PROPERTY__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsamPackage.PROPERTY__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDefaultValue(String newDefaultValue)
  {
    String oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsamPackage.PROPERTY__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
      case AsamPackage.PROPERTY__TYPE:
        return basicSetType(null, msgs);
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
      case AsamPackage.PROPERTY__NOM:
        return getNom();
      case AsamPackage.PROPERTY__TYPE:
        return getType();
      case AsamPackage.PROPERTY__DEFAULT_VALUE:
        return getDefaultValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AsamPackage.PROPERTY__NOM:
        setNom((String)newValue);
        return;
      case AsamPackage.PROPERTY__TYPE:
        setType((Type)newValue);
        return;
      case AsamPackage.PROPERTY__DEFAULT_VALUE:
        setDefaultValue((String)newValue);
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
      case AsamPackage.PROPERTY__NOM:
        setNom(NOM_EDEFAULT);
        return;
      case AsamPackage.PROPERTY__TYPE:
        setType((Type)null);
        return;
      case AsamPackage.PROPERTY__DEFAULT_VALUE:
        setDefaultValue(DEFAULT_VALUE_EDEFAULT);
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
      case AsamPackage.PROPERTY__NOM:
        return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
      case AsamPackage.PROPERTY__TYPE:
        return type != null;
      case AsamPackage.PROPERTY__DEFAULT_VALUE:
        return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (nom: ");
    result.append(nom);
    result.append(", defaultValue: ");
    result.append(defaultValue);
    result.append(')');
    return result.toString();
  }

} //PropertyImpl
